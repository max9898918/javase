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
 * ����������ȡ�ļ����е��ı��ļ���ȡ���ݲ��뵽���ݿ���
 * @author ��
 *
 */
 public class InsertStockData6 {
	static Connection con = JdbcUtils.getMysqlCon("stock");

	public static void main(String[] args) {
		InsertStockData6 insert = new InsertStockData6();
		insert.iteratorTXTPath("D:\\stock\\2017");

	}


	/**
	 * �����ַ���ƴ�ӳ�sql��䲢���÷������뵽���ݿ��У�����ķ����ǹ��õġ�ֻ�������ҵ���߼�Ҫ����д��
	 * @param ��Ҫ������ַ���
	 */
	String code[] = null;
	StringBuffer sql = new StringBuffer();
	ArrayList<String> endPrice = new ArrayList<String>();
	public void dealString(String str){
		if(str.indexOf("����") == -1 && str.indexOf("ͨ����") == -1 ){  //ȥ����ͷ��������Դ


			String dayData[] = null;

			if(str.indexOf("����") != -1){
				code = str.split(" ");
				if(code.length <= 2)code = str.split("	");
			}else //if(str.indexOf("2016-12-27") == -1) //�ж�ĳһ������ݲ�����
			{
				dayData = str.split(" ");
				if(dayData.length <= 2)dayData = str.split("	");
				endPrice.add(dayData[4]);
			}
			String securityName = code[1];
			if(code[1].length() <= 2 && code[2].indexOf("����") == -1){
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
			endPrice.clear();//����ǿ�ͷ�ͽ�β���װ�����̼۵�list
		}
	}

	
	/**
	 * big2�ȼ�big1���big1�ٳ���100
	 * @param big1
	 * @param big2
	 * @return �Ƿ�
	 */
	public String getResult(BigDecimal big1,BigDecimal big2){
		BigDecimal divideResult = big2.subtract(big1).divide(big1,10,BigDecimal.ROUND_HALF_UP);
		BigDecimal result=  divideResult.multiply(new BigDecimal(100));
		return ",'"+(result.setScale(2,BigDecimal.ROUND_HALF_UP).toString())+"'" ;
	}	

	/**
	 * �˷�����ȡ�ļ���������.txt�ļ�
	 * @param fileDir  (�ļ���)
	 * @param fileType (�ļ�����)
	 * @return �ļ�����.txt�ļ�����List����
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
			} else {  //����ļ��л����ļ�����ȡ�ڻ�ȡ�ļ��е�����.txt�ļ�·��
				List<File> ftemps = getFiles(f,fileType);
				lfile.addAll(ftemps);
			}
		}
		return lfile;
	}

	/**
	 * @param path �ļ������ڵ�·��
	 * ������ȡ�����ı��ļ�����ȡ���������
	 */
	public void iteratorTXTPath(String path){
		System.out.println("��ʼ��ȡ�ļ������뵽���ݿ���,���Ե�...");
		long start = System.currentTimeMillis();
		List<File> txtPaths = getFiles(new File(path),"txt");	//�������·��������

		for(File txtPath:txtPaths){ //�����ı��ļ�
			try {
				FileReader fr = new FileReader(txtPath);//�����ı��ļ���·����ȡ�ļ����������
				BufferedReader br = new BufferedReader(fr);
				String str = br.readLine();//��ȡ��һ�в���ֵ������str

				while(str != null){  //ֻҪ��Ϊ�վͼ�����ȡ��һ�в���ֵ������str
					dealString(str);  //���÷���ƴ�ӳ�sql     System.out.println(str);
					str = br.readLine();  //��ȡ��һ�в���ֵ������str	
				}
				br.close();	//�ر�BufferReader��
				br = null;
				fr.close();	//�ر��ļ���
				fr = null;
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}

		long end = System.currentTimeMillis();
		System.out.println("ִ�г�����ʱ"+(end-start));
	}

	/**
	 * ִ�д����sql���
	 * @param sql
	 */
	public void insert(String sql){
		try {
			PreparedStatement pstmt = con.prepareStatement(sql);  //���ݿ⹤��
			pstmt.executeUpdate();
			pstmt.close();
			pstmt = null;
		} catch (SQLException e) {
			e.printStackTrace();
		} 
	}

 }
