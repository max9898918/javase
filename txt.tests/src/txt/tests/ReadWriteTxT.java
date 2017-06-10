package txt.tests;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class ReadWriteTxT {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String sql = "INSERT INTO stock_data(securityCode,securityName,date,currentPrice,ZhangFu) VALUES('600000','浦发银行','2016-11-29',17.26,0.4);";
		
		for(int i = 1;i<20;i++){
			sql+= "\r\nINSERT INTO stock_data(securityCode,securityName,date,currentPrice,ZhangFu) VALUES('600000','浦发银行','2016-12-"+(i<10?("0"+i):i)+"',17.26,0.4);";
		}
		
		write(sql);
	}

	public static void read(){
		String FileContent = ""; // 文件很长的话建议使用StringBuffer 
		try { 
			FileInputStream fis = new FileInputStream("d:\\test.txt"); 
			InputStreamReader isr = new InputStreamReader(fis, "UTF-8"); 
			BufferedReader br = new BufferedReader(isr); 
			String line = null; 
			while ((line = br.readLine()) != null) { 
				FileContent += line; 
				FileContent += "\r\n"; // 补上换行符 
				System.out.println(FileContent);
			} 
		} catch (Exception e) { 
			e.printStackTrace(); 
		}
	}

	public static void write(String FileContent){
		//FileContent = "INSERT INTO stock_data(securityCode,securityName,date,currentPrice,ZhangFu) VALUES('600000','浦发银行','2016-11-29',17.26,0.4);"; 
		
		try { 
			FileOutputStream fos = new FileOutputStream("d:\\test.sql"); 
			OutputStreamWriter osw = new OutputStreamWriter(fos, "UTF-8"); 
			osw.write(FileContent); 
			osw.flush(); 
		} catch (Exception e) { 
			e.printStackTrace(); 
		}


	}

}
