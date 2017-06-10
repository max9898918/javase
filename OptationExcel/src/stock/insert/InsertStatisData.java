package stock.insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import com.jdbc.utils.JdbcUtils;

public class InsertStatisData {
	static Connection conn = JdbcUtils.getMysqlCon("stock_data");
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		InsertStatisData insertStatisData = new InsertStatisData();
		try {
			insertStatisData.insertStatisData();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * @throws SQLException 
	 * 
	 */

	public void insertStatisData() throws SQLException{
		System.out.println("开始读取文件并导入到数据库中,请稍等...");
		long start = System.currentTimeMillis();

		ArrayList<String> dayList = new ArrayList<String>();
		StringBuffer insertSQL = new StringBuffer();
		StringBuffer dataSQL = new StringBuffer();
		ArrayList<HashMap<String, String>> sDataList = new ArrayList< HashMap<String, String> >();

		ResultSet days = getResultSet("SELECT DISTINCT date FROM stock_data WHERE date < '2016-12-01' ORDER BY date DESC;");
		while(days.next()){
			dayList.add(days.getString("date"));
		}

		if(dayList.size()-30 < 240){
			System.out.println("请手动检查数据库！数据不够了！");
			return;
		}
		for(int i=0; i<30; i++){
			int index = dayList.indexOf(dayList.get(i));//获取当前日期在List的下标

			for(int j=2; j<=9; j+=3){ //获取前3、6、9天的日期
				sDataList.add(getStatisData(dayList.get(index+j),dayList.get(index),1) );
			}

			for(int j = 30; j<=120; j+=30){ //获取1~60天每个阶段20天的数据
				sDataList.add(getStatisData(dayList.get(index+j),dayList.get(j<=30 ? (i+1):(index+j-29) ),3) );
			}

			for(int j = 60;j<=240;j+=60){
				sDataList.add(getStatisData(dayList.get(index+j-1),dayList.get(index+j-60),2));
			}
			sDataList.add(getStatisData(dayList.get(index+119),dayList.get(index),3));
			sDataList.add(getStatisData(dayList.get(index+239),dayList.get(index),3));

			ResultSet resultSet = getResultSet("SELECT * FROM stock.stock_2016 WHERE date = '"+dayList.get(i)+"'  ORDER BY securityCode");
			int flag = 1;
			while(resultSet.next()){
				String securityCode = resultSet.getString("securityCode");
				if(flag == 1){
					flag++;
					insertSQL.append("INSERT INTO stock_statisdata(securityCode,securityName,startPrice,endPrice,ZhangFu,ZhenFu,Date,ZF1_3,DAY3ZFDY1,DAY3ZFXY_3,ZF1_6,DAY6ZFDY1,DAY6ZFXY_3,ZF1_9,DAY9ZFDY1,DAY9ZFXY_3,");
					insertSQL.append("ZF1_30,ZF30_30,ZF60_30,ZF90_30,ZF1_60,ZhenFu1_60,ZF60_60,ZhenFu60_60,ZF120_60,ZhenFu120_60,ZF180_60,ZhenFu180_60,ZF120,ZF240) ");
					insertSQL.append(" VALUES('"+securityCode+"','"+resultSet.getString("securityName")+"','"+resultSet.getString("startPrice")+"','"+resultSet.getString("endPrice")+"','"+resultSet.getString("ZhangFu")+"','"+resultSet.getString("ZhenFu")+"','"+resultSet.getString("Date")+"',");
				}else{
					insertSQL.append(",('"+securityCode+"','"+resultSet.getString("securityName")+"','"+resultSet.getString("startPrice")+"','"+resultSet.getString("endPrice")+"','"+resultSet.getString("ZhangFu")+"','"+resultSet.getString("ZhenFu")+"','"+resultSet.getString("Date")+"',");
				}
				
				
				for(int j = 0; j<sDataList.size(); j++ ){
					String data = "0";
					if(sDataList.get(j).get(securityCode) !=null){
						data=sDataList.get(j).get(securityCode);
					}else if(j>6 && j<=10){
						data = "0,0";
					}
					insertSQL.append(data+(j==(sDataList.size()-1)?")":","));
				}
				
			}
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
	 * @return 统计数据
	 * @throws SQLException
	 */
	public HashMap<String, String> getStatisData(String startDate,String endDate,int flag) throws SQLException{
		if(startDate == null || endDate == null)return null;
		HashMap<String, String> statisData = new HashMap<String,String>();
		StringBuffer sql = new StringBuffer();
		if(flag == 1){
			sql.append("SELECT securityCode,ROUND(sum(ZhangFu),0) AS ZhangFu,sum(ZFDY3) AS ZFDY3,SUM(ZFXY_4) AS ZFXY_4 FROM (");
			sql.append("SELECT securityCode,ZhangFu,if(ZhangFu>0.8,1,0) AS ZFDY3,if(ZhangFu<-3,1,0) AS ZFXY_4 FROM stock_data WHERE date BETWEEN '"+startDate+"' AND '"+endDate+"'");
			sql.append(")t1 GROUP BY securityCode ORDER BY securityCode ;");
		}
		if(flag == 2)sql.append("SELECT securityCode,ROUND(SUM(ZhangFu))AS ZhangFu,ROUND((MAX(endPrice)-MIN(endPrice))/MIN(endPrice)*100) AS flag FROM stock_data WHERE date BETWEEN '"+startDate+"' AND '"+endDate+"' GROUP BY securityCode ORDER BY securityCode ;");
		if(flag == 3)sql.append("SELECT securityCode,ROUND(sum(ZhangFu),0) AS ZhangFu FROM stock_data WHERE date BETWEEN '"+startDate+"' AND '"+endDate+"' GROUP BY securityCode ORDER BY securityCode ;");

		PreparedStatement pstmt = conn.prepareStatement(sql.toString());
		ResultSet sData = pstmt.executeQuery();
		while(sData.next()){
			if(flag == 1){
				statisData.put(sData.getString("securityCode"), "'"+sData.getString("ZhangFu")+"','"+sData.getString("ZFDY3")+"','"+sData.getString("ZFXY_4")+"'");
			}
			if(flag == 2){
				statisData.put(sData.getString("securityCode"), "'"+sData.getString("ZhangFu")+"','"+sData.getString("flag")+"'");
			}
			if(flag == 3){
				statisData.put(sData.getString("securityCode"), "'"+sData.getString("ZhangFu")+"'");
			}
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
