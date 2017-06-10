package com.jdbc.utils;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 1. 返回连接 2. 关闭
 * 
 * @author Jie.Yuan
 * 
 */
public class JdbcUtils {

	
	/**
	 * @param 传需要操作的表进来,返回连接对象
	 */
	public static Connection getMysqlCon(String database) {
		// 连接参数
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
	 * 传入要操作的表和sql语句获得PreparedStatement对象
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
	 * 关闭
	 */
	public static void closeAll(Connection con, Statement stmt, ResultSet rs) {
		try {
			if (rs != null) {
				rs.close();  // 快速异常捕获 Alt + shift + z 
				rs = null;   // 建议垃圾回收期回收资源
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










