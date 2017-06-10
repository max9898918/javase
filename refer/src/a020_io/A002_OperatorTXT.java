package a020_io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.OutputStreamWriter;

public class A002_OperatorTXT {
	public static void main(String[] args) {
		A002_OperatorTXT operator = new A002_OperatorTXT();
		
		//System.out.println(operator.getPath("d://test","test.txt"));
		for(int i= 0;i<7;i++){
			operator.writeTXT("d://test/test.txt","INSERT INTO test VALUES("+i+",'测试"+i+"');");
		}
		operator.readFileContent(null);
	}
	/**
	 * 往文件后添加想要的内容
	 * @param file（文件的路径）
	 * @param conent（需要添加的内容）
	 */
	public void writeTXT(String filePath, String conent) {
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new OutputStreamWriter( new FileOutputStream(filePath, true)));
			out.write(conent+"\r\n");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 此方法根据传入的
	 * @param path 创建或者读取的路径   如："d://test"
	 * @param fileName 文件名称  如："test.txt"
	 * @return 路径
	 */
	public String getPath(String path,String fileName){
		File filePath = new File(path);
		if(!filePath.exists()){//如果路径不存在就创建此路径
			filePath.mkdirs();
		} 

		File file = new File(filePath,fileName);// fileName表示你创建的文件名；为txt类型；
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		return path+"/"+fileName;
	}

	/**
	 * 根据传入的路径读取文件的内容
	 * @param path（文件的路径）
	 */
	public void readFileContent(String path){	
		if(path == null){
			path="d://test/test.txt";
		}

		try{
			FileReader fr = new FileReader(path);//需要读取的文件路径
			BufferedReader br = new BufferedReader(fr);
			String str = br.readLine();	
			while(str!=null){//如果当前行不为空	
				System.out.println(str);//打印当前行
				str= br.readLine();//读取下一行
			}
			br.close();//关闭BufferReader流
			fr.close();	//关闭文件流
		}catch(IOException e){//捕捉异常
			System.out.println("指定文件不存在");//处理异常
		}
	}	

}
