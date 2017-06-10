package stock.insert;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import com.jdbc.utils.*;

public class InsertStockData {
	static Connection con = JdbcUtils.getMysqlCon("stock");

	/**
	 * 执行方法
	 * @param args
	 */
	public static void main(String[] args) {
		readLine();
	}

	public static void readLine(){
		System.out.println("开始读取文件并导入到数据库中,请稍等...");
		long start = System.currentTimeMillis();

		String sql = "INSERT INTO stock_data(securityCode,securityName,date,currentPrice,ZhangFu) VALUES(?,?,?,?,?);";
		ReadTxTFileInfo readTxTFileInfo = new ReadTxTFileInfo();
		List<File> txtPaths = readTxTFileInfo.getFiles(new File("d:\\test"),"txt");
		List<String> endPriceList = new ArrayList<String>();

		for(File txtPath:txtPaths){  //遍历文件夹所有的txt文件
			//System.out.println(txtPath);//可以把下面所有的代码注释掉 验证文件夹是不是成功读取到了

			try{
				FileReader fr = new FileReader(txtPath);//需要读取的文件路径
				BufferedReader br = new BufferedReader(fr);
				PreparedStatement pstmt = con.prepareStatement(sql);  //数据库工具

				String str = br.readLine();	
				String securityCode = "";
				String securityName = "";
				while(str!=null){//如果当前行不为空,	
					//System.out.println(s);//打印当前行,逻辑代码写到这句代码和s= br.readLine();中间

					if(str.indexOf("日期") == -1 && str.indexOf("通达信") == -1 ){  //去除表头和数据来源
						String[] code = null;
						String[] info = null;
						
						
						if(str.indexOf("日线") != -1){   //获取代码和名称
							code = str.split("\\	");
							if(code.length <2)code = str.split("\\ ");
							securityCode = code[0];
							securityName = code[1];
						
						}
						if(str.length() > 37){ //获取日期和收盘价
							info = str.split("\\	");
							if(info.length <2)info = str.split("\\ ");
							/*System.out.println("INSERT INTO stock_data(securityCode,securityName,date,currentPrice,ZhangFu) " +
									"VALUES('"+securityCode+"','"+securityName+"','"+info[0]+"',"+info[4]+",0.4);");*/

							endPriceList.add(info[4]);  //把价格添加到list中
							String zhangFu = "0";
							if(endPriceList.size() > 1){
								String backPrice = endPriceList.get(endPriceList.size()-2);
								String currentPrice = endPriceList.get(endPriceList.size()-1);
								if(Double.parseDouble(backPrice) != 0 )zhangFu = getResult(new BigDecimal(backPrice), new BigDecimal(currentPrice));

								pstmt.setString(1, securityCode);
								pstmt.setString(2, securityName);
								pstmt.setString(3, info[0]);
								pstmt.setString(4, info[4]);
								pstmt.setString(5, zhangFu);
								pstmt.executeUpdate();
							}
						}
					}else{
						endPriceList.clear();
					}

					str= br.readLine();//读取下一行,逻辑代码一定要写到这句代码上面
				}
				//System.out.println(endPriceList.size());
				br.close();	//关闭BufferReader流
				br = null;
				fr.close();	//关闭文件流
				fr = null;
				pstmt.close();
				pstmt = null;
			}catch(IOException e){
				System.out.println("指定文件不存在");//处理异常
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("执行程序用时"+(end-start));
	}

	/**
	 * big2先减big1后除big1再乘以100
	 * @param big1
	 * @param big2
	 * @return 涨幅
	 */
	public static String getResult(BigDecimal big1,BigDecimal big2){
		BigDecimal divideResult = big2.subtract(big1).divide(big1,10,BigDecimal.ROUND_HALF_UP);
		BigDecimal result=  divideResult.multiply(new BigDecimal(100));
		return result.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
	}
}
