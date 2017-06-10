package com.stock.insert.statisdata;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import com.jdbc.utils.JdbcUtils;

public class A05InsertStatisData2 {
	static Connection conn = JdbcUtils.getMysqlCon("stock_data");
	/**
	 * 程序入口
	 * @param args
	 */
	public static void main(String[] args) {
		A05InsertStatisData2 insertStatisData2 = new A05InsertStatisData2();
		try {
			insertStatisData2.insertStatisData("stock_2017","2017-03-08",1);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 基础数据表里面的数据一定要正确、因为需要使用基础数据表的数据去匹配其它统计数据、然后拼成SQL插入到统计表里面
	 * @param stock_data (基础数据库名称)
	 * @param date(从哪天开始统计)
	 * @param inNumber(统计多少天的数据)
	 * @throws SQLException
	 */

	public void insertStatisData(String stock_data,String date,int inNumber) throws SQLException{
		System.out.println("开始读取文件并导入到数据库中,请稍等...");
		long start = System.currentTimeMillis();

		ArrayList<String> dayList = new ArrayList<String>();
		StringBuffer insertSQL = new StringBuffer();
		StringBuffer dataSQL = new StringBuffer();
		ArrayList<HashMap<String, String>> sDataList = new ArrayList< HashMap<String, String> >();

		ResultSet days = getResultSet("SELECT DISTINCT date FROM stock_data ORDER BY date DESC;");
		while(days.next()){
			dayList.add(days.getString("date"));
		}

		int index = dayList.indexOf(date);//获取当前日期在List中的下标
		if(index-14 < 0){
			System.out.println("温馨提示：前面的数据不够15天！");
			return;
		}

		
		for(int i=0; i<inNumber; i++){
			if(i>0)++index;
			for(int j = index-1; j>=index-15; j-=3){
				//System.out.println(dayList.get(j)+" -- "+dayList.get(j-2));
				sDataList.add(getStatisData(dayList.get(j),dayList.get(j-2),3) );
			}
			sDataList.add(getStatisData(dayList.get(index-1),dayList.get(index-15),3) );
			sDataList.add(getStatisData(dayList.get(index-1),dayList.get((index-30)>0?30:0),3) );
			
			for(int j=2; j<=9; j+=3){ //获取前3、6、9天的日期
				sDataList.add(getStatisData(dayList.get(index+j),dayList.get(index),3) );
			}

			for(int j = 30; j<=90; j+=30){ //获取1~60天每个阶段20天的数据
				sDataList.add(getStatisData(dayList.get(index+j),dayList.get(j<=30 ? (index+1):(index+j-29) ),3) );
			}

			for(int j = 60;j<=240;j+=60){
				sDataList.add(getStatisData(dayList.get(index+j-1),dayList.get(index+j-60),2));
			}
			sDataList.add(getStatisData(dayList.get(index+119),dayList.get(index),3));
			sDataList.add(getStatisData(dayList.get((index-239)>=0?index+239:(dayList.size()-1)), dayList.get(index),3));
			
			ResultSet resultSet = getResultSet("SELECT * FROM stock."+stock_data+" WHERE date = '"+dayList.get(index)+"'  ORDER BY securityCode");
			int flag = 1;
			while(resultSet.next()){
				String securityCode = resultSet.getString("securityCode");
				if(flag == 1){
					flag++;
					insertSQL.append("INSERT INTO stock_statisdata2(securityCode,securityName,startPrice,endPrice,ZhangFu,ZhenFu,date,B_ZF1_3,B_ZF3_3,B_ZF6_3,B_ZF9_3,B_ZF12_3,B_ZF15,B_ZF30,");
					insertSQL.append("ZF1_3,ZF1_6,ZF1_9,ZF1_30,ZF30_30,ZF60_30,ZF1_60,ZhenFu1_60,ZF60_60,ZhenFu60_60,ZF120_60,ZhenFu120_60,ZF180_60,ZhenFu180_60,ZF120,ZF240) ");
					insertSQL.append(" VALUES('"+securityCode+"','"+resultSet.getString("securityName")+"','"+resultSet.getString("startPrice")+"','"+resultSet.getString("endPrice")+"','"+resultSet.getString("ZhangFu")+"','"+resultSet.getString("ZhenFu")+"','"+resultSet.getString("Date")+"',");
				}else{
					insertSQL.append(",('"+securityCode+"','"+resultSet.getString("securityName")+"','"+resultSet.getString("startPrice")+"','"+resultSet.getString("endPrice")+"','"+resultSet.getString("ZhangFu")+"','"+resultSet.getString("ZhenFu")+"','"+resultSet.getString("Date")+"',");
				}


				for(int j = 0; j<sDataList.size(); j++ ){
					String data = "0";
					if(sDataList.get(j).get(securityCode) !=null){
						data=sDataList.get(j).get(securityCode);
					}else if(j>12 && j<=16){
						data = "0,0";
					}
					insertSQL.append(data+(j==(sDataList.size()-1)?")":","));
				}
			}
			
			
			
			//调用插入方法
			//System.out.println("--------"+insertSQL.toString());
			insert(insertSQL.toString());
			insertSQL.setLength(0);
			sDataList.clear();
		}

		long end = System.currentTimeMillis();
		System.out.println("执行程序用时"+(end-start));
	}

	/**
	 * 传入需要统计的日期区间、不同的阶段执行的sql
	 * @param startDate 统计的开始日期
	 * @param endDate 统计的结束日期
	 * @param flag、标记阶段执行不同的代码提高效率
	 * @return 封装到HashMap中键值对的统计数据
	 * @throws SQLException
	 */
	public HashMap<String, String> getStatisData(String startDate,String endDate,int flag) throws SQLException{
		if(startDate == null || endDate == null){
			System.out.println("日期不正确："+startDate+"--"+endDate);
			return null;
		}
		HashMap<String, String> statisData = new HashMap<String,String>();
		StringBuffer sql = new StringBuffer();
		/*if(flag == 1){
			sql.append("SELECT securityCode,ROUND(sum(ZhangFu),0) AS ZhangFu,sum(ZFDY3) AS ZFDY3,SUM(ZFXY_4) AS ZFXY_4 FROM (");
			sql.append("SELECT securityCode,ZhangFu,if(ZhangFu>0.8,1,0) AS ZFDY3,if(ZhangFu<-3,1,0) AS ZFXY_4 FROM stock_data WHERE date BETWEEN '"+startDate+"' AND '"+endDate+"'");
			sql.append(")t1 GROUP BY securityCode ORDER BY securityCode ;");
		}*/
		if(flag == 2)sql.append("SELECT securityCode,ROUND(SUM(ZhangFu))AS ZhangFu,ROUND((MAX(endPrice)-MIN(endPrice))/MIN(endPrice)*100) AS flag FROM stock_data WHERE date BETWEEN '"+startDate+"' AND '"+endDate+"' GROUP BY securityCode ORDER BY securityCode ;");
		if(flag == 3)sql.append("SELECT securityCode,ROUND(sum(ZhangFu),0) AS ZhangFu FROM stock_data WHERE date BETWEEN '"+startDate+"' AND '"+endDate+"' GROUP BY securityCode ORDER BY securityCode ;");

		PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		ResultSet sData = pstmt.executeQuery();
		while(sData.next()){
			//if(flag == 1)statisData.put(sData.getString("securityCode"), "'"+sData.getString("ZhangFu")+"','"+sData.getString("ZFDY3")+"','"+sData.getString("ZFXY_4")+"'");

			if(flag == 2)statisData.put(sData.getString("securityCode"), "'"+sData.getString("ZhangFu")+"','"+sData.getString("flag")+"'");
			if(flag == 3)statisData.put(sData.getString("securityCode"), "'"+sData.getString("ZhangFu")+"'");
		}
		//System.out.println(statisData.size()+"--"+statisData);
		//System.out.println(sql.toString());
		return statisData;
	}
	/**
	 * 执行传入的sql语句
	 * @param sql
	 */
	public void insert(String sql){
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);  //数据库工具
			pstmt.executeUpdate();
			pstmt.close();
			pstmt = null;
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println(sql);
		} 
	}

	/**
	 * 执行传过来的sql,返回数据库中的结果
	 * @param sql
	 * @return 查询结果
	 * @throws SQLException
	 */
	public static ResultSet getResultSet(String sql) throws SQLException{
		ResultSet resultSet = null;
		PreparedStatement pstmt = conn.prepareStatement(sql);
		resultSet = pstmt.executeQuery();
		return resultSet;
	}


}
