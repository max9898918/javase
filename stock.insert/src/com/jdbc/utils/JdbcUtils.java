package com.jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 1. �������� 2. �ر�
 * 
 * @author Jie.Yuan
 * 
 */
public class JdbcUtils {

	
	/**
	 * @param ����Ҫ�����ı����,�������Ӷ���
	 */
	public static Connection getMysqlCon(String database) {
		// ���Ӳ���
		// private String url = "jdbc:mysql://localhost:3306/jdbc_demo";
		if(database.trim()==null || "".equals(database.trim())){
			database="test";
		}
		
		String url = "jdbc:mysql:///"+database+"";
		String user = "root";
		String password = "x5";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			return DriverManager.getConnection(url, user, password);
		} catch (Exception e) {
			throw new RuntimeException(e);
		}
	}
	/**
	 * ����Ҫ�����ı��sql�����PreparedStatement����
	 * @param table
	 * @param sql
	 * @return
	 * 		PreparedStatement
	 */
	public static PreparedStatement getMysqlPstmt(String database,String sql){
		PreparedStatement pstmt = null;
		Connection conn = getMysqlCon(database);
		try {
			pstmt = conn.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pstmt;
	}

	/**
	 * �ر�
	 */
	public static void closeAll(Connection con, Statement stmt, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();  // �����쳣���� Alt + shift + z 
				rs = null;   // �������������ڻ�����Դ
			}
			if (stmt != null) {
				stmt.close();
				stmt = null;
			}
			if (con != null && !con.isClosed()) {
				con.close();
				con = null;
			}
		} catch (SQLException e) {
			throw new RuntimeException(e);
		}
	}
	public static void main(String[] args) {
		/*if("  ".trim().equals("")){
		System.out.println(1);
		}*/
		
		System.out.println(getMysqlCon(""));
	}
}










