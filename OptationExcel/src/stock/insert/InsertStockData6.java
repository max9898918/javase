package stock.insert;

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
 public class InsertStockData6 {
	static Connection con = JdbcUtils.getMysqlCon("stock");

	public static void main(String[] args) {
		InsertStockData6 insert = new InsertStockData6();
		insert.iteratorTXTPath("D:\\stock\\2017");

	}


	/**
	 * 处理字符串拼接成sql语句并调用方法插入到数据库中（上面的方法是公用的。只有这里的业务逻辑要重新写）
	 * @param 需要处理的字符串
	 */
	String code[] = null;
	StringBuffer sql = new StringBuffer();
	ArrayList<String> endPrice = new ArrayList<String>();
	public void dealString(String str){
		if(str.indexOf("日期") == -1 && str.indexOf("通达信") == -1 ){  //去除表头和数据来源


			String dayData[] = null;

			if(str.indexOf("日线") != -1){
				code = str.split(" ");
				if(code.length <= 2)code = str.split("	");
			}else //if(str.indexOf("2016-12-27") == -1) //判断某一天的数据不导入
			{
				dayData = str.split(" ");
				if(dayData.length <= 2)dayData = str.split("	");
				endPrice.add(dayData[4]);
			}
			String securityName = code[1];
			if(code[1].length() <= 2 && code[2].indexOf("日线") == -1){
				securityName += code[2];
			}
			if(dayData == null || endPrice.size()<2)return;
			if(endPrice.size() == 2){
				sql.append("INSERT INTO stock_2017(securityCode,securityName,date,startPrice,maxPrice,minPrice,endPrice,amount,sumMoney,ZhangFu,ZhenFu) VALUES('"+code[0]+"','"+securityName+"'");
			}else{
				
				sql.append(",('"+code[0]+"','"+securityName+"'");
			}
			
			String ZhangFu = getResult(new BigDecimal(endPrice.get(endPrice.size()-2)), new BigDecimal(endPrice.get(endPrice.size()-1)));
			String ZhenFu  = getResult(new BigDecimal(dayData[3]),new BigDecimal(dayData[2]));
			for(int i=0;i<dayData.length;i++){
				sql.append(",'"+dayData[i]+"'");
				if(dayData.length - 1 == i)sql.append(ZhangFu+ZhenFu+")");
			}
		}else{
			//System.out.println(sql.toString());
			if(sql.length()!= 0)insert(sql.toString());
			sql.setLength(0);
			endPrice.clear();//如果是开头和结尾清空装了收盘价的list
		}
	}

	
	/**
	 * big2先减big1后除big1再乘以100
	 * @param big1
	 * @param big2
	 * @return 涨幅
	 */
	public String getResult(BigDecimal big1,BigDecimal big2){
		BigDecimal divideResult = big2.subtract(big1).divide(big1,10,BigDecimal.ROUND_HALF_UP);
		BigDecimal result=  divideResult.multiply(new BigDecimal(100));
		return ",'"+(result.setScale(2,BigDecimal.ROUND_HALF_UP).toString())+"'" ;
	}	

	/**
	 * 此方法获取文件夹中所有.txt文件
	 * @param fileDir  (文件夹)
	 * @param fileType (文件类型)
	 * @return 文件夹中.txt文件名的List集合
	 */
	public List<File> getFiles(File fileDir, String fileType) {
		List<File> lfile = new ArrayList<File>();
		File[] fs = fileDir.listFiles();
		for (File f : fs) {
			if (f.isFile()) {
				if (fileType.equals(f.getName().substring(
						f.getName().lastIndexOf(".") + 1,
						f.getName().length())))
					lfile.add(f);
			} else {  //如果文件中还有文件、获取在获取文件中的所有.txt文件路径
				List<File> ftemps = getFiles(f,fileType);
				lfile.addAll(ftemps);
			}
		}
		return lfile;
	}

	/**
	 * @param path 文件夹所在的路径
	 * 遍历读取到的文本文件并读取里面的内容
	 */
	public void iteratorTXTPath(String path){
		System.out.println("开始读取文件并导入到数据库中,请稍等...");
		long start = System.currentTimeMillis();
		List<File> txtPaths = getFiles(new File(path),"txt");	//在这里改路径和类型

		for(File txtPath:txtPaths){ //遍历文本文件
			try {
				FileReader fr = new FileReader(txtPath);//根据文本文件的路径读取文件里面的内容
				BufferedReader br = new BufferedReader(fr);
				String str = br.readLine();//读取下一行并赋值给变量str

				while(str != null){  //只要不为空就继续读取下一行并赋值给变量str
					dealString(str);  //调用方法拼接成sql     System.out.println(str);
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
		}

		long end = System.currentTimeMillis();
		System.out.println("执行程序用时"+(end-start));
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
