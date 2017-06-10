package stock.insert;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

import com.jdbc.utils.JdbcUtils;

public class Test02 {
	static Connection conn = JdbcUtils.getMysqlCon("stock_data");
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Test02 test02 = new Test02();
		try {
			test02.insertStatisData();
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

		ResultSet days = getResultSet("SELECT DISTINCT date FROM stock_data ORDER BY date DESC");
		while(days.next()){
			dayList.add(days.getString("date"));
		}

		if(dayList.size()-3 < 240){
			System.out.println("请手动检查数据库！数据不够了！");
			return;
		}
		for(int i=0; i<1; i++){
			int index = dayList.indexOf(dayList.get(i));//获取当前日期在List的下标

			for(int j=2; j<=9; j+=3){ //获取前3、6、9天的日期
				sDataList.add(getStatisData(dayList.get(index+j),dayList.get(index),1) );
			}

			for(int j = 20; j<=80; j+=20){
				sDataList.add(getStatisData(dayList.get(index+j),dayList.get(j<=20 ? (i+1):(index+j-19) ),2) );
			}

			for(int j = 60;j<=240;j+=60){
				sDataList.add(getStatisData(dayList.get(index+j-1),dayList.get(index+j-60),3));
				if(j == 120 || j == 240);
			}
			sDataList.add(getStatisData(dayList.get(index+119),dayList.get(index),3));
			sDataList.add(getStatisData(dayList.get(index+239),dayList.get(index),3));

			/*ResultSet resultSet = getResultSet("SELECT * FROM stock.stock_2016 WHERE date = '"+dayList.get(i)+"' ORDER BY securityCode");
			while(resultSet.next()){
				String securityCode = resultSet.getString("securityCode");
				insertSQL.append("INSERT INTO stock_statisdata(securityCode,securityName,startPrice,endPrice,ZhangFu,ZhenFu,Date,ZF1_3,DAY3ZFDY1,DAY3ZFXY_3,ZF1_6,DAY6ZFDY1,DAY6ZFXY_3,ZF1_9,DAY9ZFDY1,DAY9ZFXY_3,");
				insertSQL.append("ZF1_20,ZFTJ1_20,ZF20_20,ZFTJ20_20,ZF40_20,ZFTJ40_20,ZF60_20,ZFTJ60_20,ZF1_60,ZF60_60,ZF120_60,ZF180_60,ZF120,ZF240) ");
				insertSQL.append(" VALUES('"+securityCode+"','"+resultSet.getString("securityName")+"','"+resultSet.getString("startPrice")+"','"+resultSet.getString("endPrice")+"','"+resultSet.getString("ZhangFu")+"','"+resultSet.getString("ZhenFu")+"','"+resultSet.getString("Date")+"',");

				for(int j = 0; j<sDataList.size(); j++ ){
					insertSQL.append(sDataList.get(j).get(securityCode)+(j==(sDataList.size()-1)?")":","));
				}
				insert(insertSQL.toString());
				insertSQL.setLength(0);
			}
			System.out.println(insertSQL.toString());
			sDataList.clear();*/
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
			sql.append("SELECT securityCode,ROUND(sum(ZhangFu),2) AS ZhangFu,sum(ZFDY3) AS ZFDY3,SUM(ZFXY_4) AS ZFXY_4 FROM (");
			sql.append("SELECT securityCode,ZhangFu,if(ZhangFu>0.8,1,0) AS ZFDY3,if(ZhangFu<-3,1,0) AS ZFXY_4 FROM stock_data WHERE date BETWEEN '"+startDate+"' AND '"+endDate+"'");
			sql.append(")t1 GROUP BY securityCode ORDER BY securityCode");
		}

		if(flag == 2){
			sql.append("SELECT securityCode,ROUND(sum(ZhangFu),2) AS ZhangFu,sum(flag) AS flag FROM (");
			sql.append(" SELECT securityCode,ZhangFu,if(ZhangFu<3 AND ZhangFu >-3.2,1,0) AS flag FROM stock_data WHERE date BETWEEN '"+startDate+"' AND '"+endDate+"'");
			sql.append(")t1 GROUP BY securityCode  ORDER BY securityCode");
		}

		if(flag == 3){
			sql.append("SELECT securityCode,ROUND(sum(ZhangFu),2) AS ZhangFu FROM stock_data WHERE date BETWEEN '"+startDate+"' AND '"+endDate+"' GROUP BY securityCode ORDER BY securityCode ");
		}
		/*PreparedStatement pstmt = conn.prepareStatement(sql.toString());
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
		System.out.println(statisData.size()+"--"+statisData);*/
		System.out.println(sql.toString());
		return statisData;
	}
	/**
	 * 执行传入的sql语句
	 * @param sql
	 */
	/*public void insert(String sql){
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);  //数据库工具
			pstmt.executeUpdate();
			pstmt.close();
			pstmt = null;
		} catch (SQLException e) {
			System.err.println(sql);
			//e.printStackTrace();
		} 
	}*/

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
