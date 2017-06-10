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
public class InsertDayData {
	static Connection con = JdbcUtils.getMysqlCon("stock");

	public static void main(String[] args) {
		InsertDayData insertCurrentData = new InsertDayData();
		insertCurrentData.iteratorTXTPath("D:\\stock\\2017\\2017-01-04.txt");

	}


	/**
	 * �����ַ���ƴ�ӳ�sql��䲢���÷������뵽���ݿ��У�����ķ����ǹ��õġ�ֻ�������ҵ���߼�Ҫ����д��
	 * @param ��Ҫ�������ַ���
	 */
	StringBuffer sql = new StringBuffer();
	int flag = 1;
	
	public void dealString(String str){
		if(str.indexOf("����") == -1 && str.indexOf("ͨ����") == -1 ){  //ȥ����ͷ��������Դ
			String dayData[] = str.split("\\	");
			if(dayData.length<=2)str.split("\\ ");;
			if(dayData.length<7){
				System.out.println(dayData[0]);
				return;
			}
			
			if(flag == 1){ flag++;
				sql.append("INSERT INTO stock_2017(securityCode,securityName,startPrice,maxPrice,minPrice,endPrice,ZhangFu,ZhenFu,date) ");
				for(int i=0;i<=7;i++){
					if(dayData[2].indexOf("--") == -1)sql.append( (i==0?"VALUES('":"'")+(dayData[i].indexOf("--")==-1?dayData[i]:"null")+(i==7?"','2017-01-04')":"',"));
				}
			}else{
				for(int i=0;i<=7;i++){
					
					if(dayData[2].indexOf("--") == -1)sql.append( (i==0?",('":"'")+(dayData[i].indexOf("--")==-1?dayData[i]:"null")+(i==7?"','2017-01-04')":"',"));
				}
			}
		}else if(str.indexOf("ͨ����") != -1){
			//System.out.println(sql.toString());
			insert(sql.toString());
		}
	}

	/**
	 * @param path �ļ������ڵ�·��
	 * ������ȡ�����ı��ļ�����ȡ���������
	 */
	public void iteratorTXTPath(String txtPath){
		System.out.println("��ʼ��ȡ�ļ������뵽���ݿ���,���Ե�...");
		long start = System.currentTimeMillis();

		try {
			FileReader fr = new FileReader(txtPath);//�����ı��ļ���·����ȡ�ļ����������
			BufferedReader br = new BufferedReader(fr);
			String str = br.readLine();//��ȡ��һ�в���ֵ������str
			while(str != null){  //ֻҪ��Ϊ�վͼ�����ȡ��һ�в���ֵ������str
				dealString(str);
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