package com.stock.insert.statisdata;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

import com.jdbc.utils.JdbcUtils;

public class A02InsertOutData {
	static Connection conn = JdbcUtils.getMysqlCon("stock");
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A02InsertOutData insertOutData = new A02InsertOutData();
		try {
			insertOutData.insertStatisData("2017-01-20");
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 基础数据表里面的数据一定要正确、因为需要使用基础数据表的数据去匹配其它统计数据、然后拼成SQL插入到统计表里面
	 * @throws SQLException
	 * 创建时间：2017-03-27
	 */

	public void insertStatisData(String appointDate) throws SQLException{
		System.out.println("开始读取文件并导入到数据库中,请稍等...");
		long start = System.currentTimeMillis();
		ArrayList<String> dayList = new ArrayList<String>();//保存所有日期
		PreparedStatement pstmt = conn.prepareStatement("SELECT DISTINCT date FROM stock_data.stock_data WHERE date<='"+appointDate+"' ORDER BY date DESC;");
		ResultSet days = pstmt.executeQuery();
		while(days.next()){ dayList.add(days.getString("date")); }

		//System.out.println(dayList.size()-240);
		for(int i=0;i<2;i++){
			if(dayList.size()<(239+i)){
				System.out.println("从 "+dayList.get(i)+" 开始数据量不够240条了");
				break;
			}
			pstmt = conn.prepareStatement(getOutDataSQL( dayList.get(i), dayList.get(2+i) , dayList.get(5+i) , dayList.get(10+i), dayList.get(39+i) , dayList.get(69+i), dayList.get(dayList.size()<(239+i)?dayList.size()-1:(239+i)))   );
			pstmt.executeUpdate();
			pstmt.close();
			pstmt = null;
		}

		long end = System.currentTimeMillis();
		System.out.println("执行程序用时"+(end-start));
	}

	public String getOutDataSQL(String appointDate,String start3,String start6,String start10,String start30,String start70,String start240){
		//System.out.println(appointDate+"--"+start3+"--"+start6+"--"+start10+"--"+start30+"--"+start70+"--"+start240);
		StringBuffer sql = new StringBuffer();
		sql.append(" INSERT INTO stock_outData(count,securityCode,ZhangFu,ZF3,ZF6,ZF10,ZF30,ZF70,ZF240,RATE30,RATE70,endPrice,AVG10,AVG30,AVG70,AVG240,ZhenFu70,MAXZF10,MAXZF30,S10,S30,MAX10,MAX30,MAX70,MIN70,date)");
		sql.append(" 	SELECT count,securityCode,ZhangFu,ZF3,ZF6,ZF10,ZF30,ZF70,ZF240,ROUND(ZF240/ZF30,2) AS RATE30,ROUND(ZF240/ZF70,2) AS RATE70,endPrice,AVG10,AVG30,AVG70,AVG240,ROUND((MAX70-MIN70)/MIN70*100) AS ZhenFu70,MAXZF10,MAXZF30,S10,S30,MAX10,MAX30,MAX70,MIN70,'"+appointDate+"' as date FROM (");
		sql.append("	SELECT COUNT(securityCode)AS count,securityCode,ROUND(MAX(CASE WHEN date='"+appointDate+"' THEN endPrice END),2) AS endPrice,");
		
		sql.append(" ROUND(MAX(CASE WHEN date='"+appointDate+"' THEN ZhangFu END),2) AS ZhangFu,ROUND(SUM(CASE WHEN date>='"+start3+"' AND date<='"+appointDate+"' THEN ZhangFu END)) AS ZF3,ROUND(SUM(CASE WHEN date>='"+start6+"' AND date<='"+appointDate+"' THEN ZhangFu END)) AS ZF6,");
		sql.append(" ROUND(MAX(CASE WHEN date>='"+start10+"' AND date<='"+appointDate+"' THEN ZhangFu END)) AS MAXZF10,ROUND(MAX(CASE WHEN date>='"+start30+"' AND date<='"+start10+"' THEN ZhangFu END)) AS MAXZF30,");
		sql.append(" ROUND(SUM(CASE WHEN date>='"+start10+"' AND date<='"+appointDate+"' AND ZhangFu>5 THEN 1 END)) AS S10,ROUND(SUM(CASE WHEN date>='"+start30+"' AND date<='"+start10+"' AND ZhangFu>5 THEN 1 END)) AS S30,");
		
		sql.append(" ROUND(SUM(CASE WHEN date>='"+start10+"' AND date<='"+appointDate+"' THEN ZhangFu END)) AS ZF10,ROUND(SUM(CASE WHEN date>='"+start30+"' AND date<='"+start10+"' THEN ZhangFu END)) AS ZF30,");
		sql.append(" ROUND(SUM(CASE WHEN date>='"+start70+"' AND date<='"+appointDate+"' THEN ZhangFu END)) AS ZF70,ROUND(SUM(CASE WHEN date>='"+start240+"' AND date<='"+appointDate+"' THEN ZhangFu END)) AS ZF240,");
		sql.append(" ROUND(MAX(CASE WHEN date>'"+start10+"' AND date<='"+appointDate+"' THEN endPrice END),2) AS MAX10,ROUND(MAX(CASE WHEN date>='"+start30+"' AND date<='"+start10+"' THEN endPrice END),2) AS MAX30,");
		sql.append(" ROUND(MAX(CASE WHEN date>='"+start70+"' AND date<='"+appointDate+"' THEN endPrice END),2) AS MAX70,ROUND(MIN(CASE WHEN date>='"+start70+"' AND date<='"+appointDate+"' THEN endPrice END),2) AS MIN70,");
		sql.append(" ROUND(AVG(CASE WHEN date>'"+start10+"' AND date<='"+appointDate+"' THEN endPrice END),2) AS AVG10,ROUND(AVG(CASE WHEN date>='"+start30+"' AND date<='"+start10+"' THEN endPrice END),2) AS AVG30,");
		sql.append(" ROUND(AVG(CASE WHEN date>='"+start70+"' AND date<='"+appointDate+"' THEN endPrice END),2) AS AVG70,ROUND(AVG(CASE WHEN date>='"+start240+"' AND date<='"+appointDate+"' THEN endPrice END),2) AS AVG240");
		sql.append(" FROM stock_data.stock_data WHERE date<='"+appointDate+"' GROUP BY securityCode ORDER BY date DESC			)T1 ORDER BY securityCode;");
		//System.out.println(sql);
		return sql.toString();
	}
}
