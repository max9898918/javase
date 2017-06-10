package com.stock.insert.daydate;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.jdbc.utils.JdbcUtils;
/**
 * 本类用来读取文件夹中的文本文件获取数据插入到数据库中
 * @author 辉
 *
 */
public class InsertDayData {
	static Connection con = JdbcUtils.getMysqlCon("stock");

	public static void main(String[] args) {
		InsertDayData insertCurrentData = new InsertDayData();
		insertCurrentData.iteratorTXTPath("stock_2019","D:\\stock\\沪深Ａ股.txt","2017-04-28");

	}

	/**
	 * @param path 文件夹所在的路径
	 * 遍历读取到的文本文件并读取里面的内容
	 */
	public void iteratorTXTPath(String stock_dataName,String txtPath,String date){
		System.out.println("开始读取文件并导入到数据库中,请稍等...");
		long start = System.currentTimeMillis();

		try {
			FileReader fr = new FileReader(txtPath);//根据文本文件的路径读取文件里面的内容
			BufferedReader br = new BufferedReader(fr);
			String str = br.readLine();//读取下一行并赋值给变量str
			while(str != null){  //只要不为空就继续读取下一行并赋值给变量str
				dealString(stock_dataName,str,date);
				//System.out.println(str);
				str = br.readLine();  //读取下一行并赋值给变量str	
			}
			br.close();	//关闭BufferReader流
			br = null;
			fr.close();	//关闭文件流
			fr = null;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		long end = System.currentTimeMillis();
		System.out.println("执行程序用时"+(end-start));
	}


	/**
	 * 处理字符串拼接成sql语句并调用方法插入到数据库中（上面的方法是公用的。只有这里的业务逻辑要重新写）
	 * @param 需要处理的字符串
	 */
	StringBuffer sql = new StringBuffer();
	int flag = 1;
	
	public void dealString(String stock_dataName,String str,String date){
		if(str.indexOf("代码") == -1 && str.indexOf("通达信") == -1 ){  //去除表头和数据来源
			String dayData[] = str.split("\\	");
			if(dayData.length<=2)str.split("\\ ");;
			if(dayData.length<7){
				System.out.println(dayData[0]);
				return;
			}
			
			if(flag == 1){ flag++;
				sql.append("INSERT INTO "+stock_dataName+"(securityCode,securityName,startPrice,maxPrice,minPrice,endPrice,ZhangFu,ZhenFu,date) ");
				for(int i=0;i<=7;i++){
					if(dayData[2].indexOf("--") == -1)sql.append( (i==0?"VALUES('":"'")+(dayData[i].indexOf("--")==-1?dayData[i]:"null")+(i==7?"','"+date+"')":"',"));
				}
			}else{
				for(int i=0;i<=7;i++){
					
					if(dayData[2].indexOf("--") == -1)sql.append( (i==0?",('":"'")+(dayData[i].indexOf("--")==-1?dayData[i]:"null")+(i==7?"','"+date+"')":"',"));
				}
			}
		}else if(str.indexOf("通达信") != -1){
			//System.out.println(sql.toString());
			insert(sql.toString());
		}
	}

	/**
	 * 执行传入的sql语句
	 * @param sql
	 */
	public void insert(String sql){
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);  //数据库工具
			pstmt.executeUpdate();
			pstmt.close();
			pstmt = null;
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

}
