package txt.tests;

import java.io.BufferedReader;
import java.io.BufferedWriter;  
import java.io.File;  
import java.io.FileInputStream;
import java.io.FileOutputStream;  
import java.io.FileWriter;  
import java.io.IOException;  
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;  
import java.io.RandomAccessFile;  

/** 
 * 
 * @author malik 
 * @version 2011-3-10 下午10:49:41 
 */  
public class AppendFile {  

	public static void main(String args[]) {
		try {
			InputStreamReader is = new InputStreamReader(new FileInputStream("E:\\a.txt"), "UTF-8");
			BufferedReader br = new BufferedReader(is);
			File f = new File("E:\\b.txt");
			String s;
			while ((s = br.readLine()) != null) {
				BufferedWriter bw = new BufferedWriter(new FileWriter(f, true));
				bw.write(s);
				bw.newLine();
				bw.close();
			}
			System.out.println("成功存入~！");

		} catch (Exception e) {
			System.out.println("error:" + e);
		}
	}


	/*public static void method1(String file, String conent) {     
        BufferedWriter out = null;     
        try {     
            out = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true)));     
            out.write(conent);     
        } catch (Exception e) {     
            e.printStackTrace();     
        } finally {     
            try {     
                if(out != null){  
                    out.close();     
                }  
            } catch (IOException e) {     
                e.printStackTrace();     
            }     
        }     
    }     

	 *//**   
	 * 追加文件：使用FileWriter   
	 *    
	 * @param fileName   
	 * @param content   
	 *//*    
    public static void method2(String fileName, String content) {   
        FileWriter writer = null;  
        try {     
            // 打开一个写文件器，构造函数中的第二个参数true表示以追加形式写文件     
            writer = new FileWriter(fileName, true);     
            writer.write(content);       
        } catch (IOException e) {     
            e.printStackTrace();     
        } finally {     
            try {     
                if(writer != null){  
                    writer.close();     
                }  
            } catch (IOException e) {     
                e.printStackTrace();     
            }     
        }   
    }     

	  *//**   
	  * 追加文件：使用RandomAccessFile   
	  *    
	  * @param fileName 文件名   
	  * @param content 追加的内容   
	  *//*    
    public static void method3(String fileName, String content) {   
        RandomAccessFile randomFile = null;  
        try {     
            // 打开一个随机访问文件流，按读写方式     
            randomFile = new RandomAccessFile(fileName, "rw");     
            // 文件长度，字节数     
            long fileLength = randomFile.length();     
            // 将写文件指针移到文件尾。     
            randomFile.seek(fileLength);     
            randomFile.writeBytes(content);      
        } catch (IOException e) {     
            e.printStackTrace();     
        } finally{  
            if(randomFile != null){  
                try {  
                    randomFile.close();  
                } catch (IOException e) {  
                    e.printStackTrace();  
                }  
            }  
        }  
    }    

    public static void main(String[] args) {  
        try{  
            File file = new File("d://text.sql");  
            if(file.createNewFile()){  
                System.out.println("Create file successed");  
            }  
            method1("d://text.sql", "\r\nINSERT INTO stock_data(securityCode,securityName,date,currentPrice,ZhangFu) VALUES('600000','浦发银行','2016-11-29',17.26,0.4);");  
            method2("d://text.txt", "123");  
            method3("d://text.txt", "123");  
        }catch(Exception e){  
            System.out.println(e);  
        }  
    }*/  
}  