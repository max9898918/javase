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
	 * �������
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
	 * �������ݱ����������һ��Ҫ��ȷ����Ϊ��Ҫʹ�û������ݱ������ȥƥ������ͳ�����ݡ�Ȼ��ƴ��SQL���뵽ͳ�Ʊ�����
	 * @param stock_data (�������ݿ�����)
	 * @param date(�����쿪ʼͳ��)
	 * @param inNumber(ͳ�ƶ����������)
	 * @throws SQLException
	 */

	public void insertStatisData(String stock_data,String date,int inNumber) throws SQLException{
		System.out.println("��ʼ��ȡ�ļ������뵽���ݿ���,���Ե�...");
		long start = System.currentTimeMillis();

		ArrayList<String> dayList = new ArrayList<String>();
		StringBuffer insertSQL = new StringBuffer();
		StringBuffer dataSQL = new StringBuffer();
		ArrayList<HashMap<String, String>> sDataList = new ArrayList< HashMap<String, String> >();

		ResultSet days = getResultSet("SELECT DISTINCT date FROM stock_data ORDER BY date DESC;");
		while(days.next()){
			dayList.add(days.getString("date"));
		}

		int index = dayList.indexOf(date);//��ȡ��ǰ������List�е��±�
		if(index-14 < 0){
			System.out.println("��ܰ��ʾ��ǰ������ݲ���15�죡");
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
			
			for(int j=2; j<=9; j+=3){ //��ȡǰ3��6��9�������
				sDataList.add(getStatisData(dayList.get(index+j),dayList.get(index),3) );
			}

			for(int j = 30; j<=90; j+=30){ //��ȡ1~60��ÿ���׶�20�������
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
			
			
			
			//���ò��뷽��
			//System.out.println("--------"+insertSQL.toString());
			insert(insertSQL.toString());
			insertSQL.setLength(0);
			sDataList.clear();
		}

		long end = System.currentTimeMillis();
		System.out.println("ִ�г�����ʱ"+(end-start));
	}

	/**
	 * ������Ҫͳ�Ƶ��������䡢��ͬ�Ľ׶�ִ�е�sql
	 * @param startDate ͳ�ƵĿ�ʼ����
	 * @param endDate ͳ�ƵĽ�������
	 * @param flag����ǽ׶�ִ�в�ͬ�Ĵ������Ч��
	 * @return ��װ��HashMap�м�ֵ�Ե�ͳ������
	 * @throws SQLException
	 */
	public HashMap<String, String> getStatisData(String startDate,String endDate,int flag) throws SQLException{
		if(startDate == null || endDate == null){
			System.out.println("���ڲ���ȷ��"+startDate+"--"+endDate);
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
	 * ִ�д����sql���
	 * @param sql
	 */
	public void insert(String sql){
		try {
			PreparedStatement pstmt = conn.prepareStatement(sql);  //���ݿ⹤��
			pstmt.executeUpdate();
			pstmt.close();
			pstmt = null;
		} catch (SQLException e) {
			e.printStackTrace();
			System.err.println(sql);
		} 
	}

	/**
	 * ִ�д�������sql,�������ݿ��еĽ��
	 * @param sql
	 * @return ��ѯ���
	 * @throws SQLException
	 */
	public static ResultSet getResultSet(String sql) throws SQLException{
		ResultSet resultSet = null;
		PreparedStatement pstmt = conn.prepareStatement(sql);
		resultSet = pstmt.executeQuery();
		return resultSet;
	}


}
