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
	 * ִ�з���
	 * @param args
	 */
	public static void main(String[] args) {
		readLine();
	}

	public static void readLine(){
		System.out.println("��ʼ��ȡ�ļ������뵽���ݿ���,���Ե�...");
		long start = System.currentTimeMillis();

		String sql = "INSERT INTO stock_data(securityCode,securityName,date,currentPrice,ZhangFu) VALUES(?,?,?,?,?);";
		ReadTxTFileInfo readTxTFileInfo = new ReadTxTFileInfo();
		List<File> txtPaths = readTxTFileInfo.getFiles(new File("d:\\test"),"txt");
		List<String> endPriceList = new ArrayList<String>();

		for(File txtPath:txtPaths){  //�����ļ������е�txt�ļ�
			//System.out.println(txtPath);//���԰��������еĴ���ע�͵� ��֤�ļ����ǲ��ǳɹ���ȡ����

			try{
				FileReader fr = new FileReader(txtPath);//��Ҫ��ȡ���ļ�·��
				BufferedReader br = new BufferedReader(fr);
				PreparedStatement pstmt = con.prepareStatement(sql);  //���ݿ⹤��

				String str = br.readLine();	
				String securityCode = "";
				String securityName = "";
				while(str!=null){//�����ǰ�в�Ϊ��,	
					//System.out.println(s);//��ӡ��ǰ��,�߼�����д���������s= br.readLine();�м�

					if(str.indexOf("����") == -1 && str.indexOf("ͨ����") == -1 ){  //ȥ����ͷ��������Դ
						String[] code = null;
						String[] info = null;
						
						
						if(str.indexOf("����") != -1){   //��ȡ���������
							code = str.split("\\	");
							if(code.length <2)code = str.split("\\ ");
							securityCode = code[0];
							securityName = code[1];
						
						}
						if(str.length() > 37){ //��ȡ���ں����̼�
							info = str.split("\\	");
							if(info.length <2)info = str.split("\\ ");
							/*System.out.println("INSERT INTO stock_data(securityCode,securityName,date,currentPrice,ZhangFu) " +
									"VALUES('"+securityCode+"','"+securityName+"','"+info[0]+"',"+info[4]+",0.4);");*/

							endPriceList.add(info[4]);  //�Ѽ۸���ӵ�list��
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

					str= br.readLine();//��ȡ��һ��,�߼�����һ��Ҫд������������
				}
				//System.out.println(endPriceList.size());
				br.close();	//�ر�BufferReader��
				br = null;
				fr.close();	//�ر��ļ���
				fr = null;
				pstmt.close();
				pstmt = null;
			}catch(IOException e){
				System.out.println("ָ���ļ�������");//�����쳣
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		long end = System.currentTimeMillis();
		System.out.println("ִ�г�����ʱ"+(end-start));
	}

	/**
	 * big2�ȼ�big1���big1�ٳ���100
	 * @param big1
	 * @param big2
	 * @return �Ƿ�
	 */
	public static String getResult(BigDecimal big1,BigDecimal big2){
		BigDecimal divideResult = big2.subtract(big1).divide(big1,10,BigDecimal.ROUND_HALF_UP);
		BigDecimal result=  divideResult.multiply(new BigDecimal(100));
		return result.setScale(2,BigDecimal.ROUND_HALF_UP).toString();
	}
}
