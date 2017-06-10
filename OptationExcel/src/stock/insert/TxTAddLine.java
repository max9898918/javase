package stock.insert;

import java.io.*;
public class TxTAddLine {
	
	public static void main(String[] args) throws IOException{
		for(int i= 0;i<7;i++){
			writeTXTLine(getPath(),"INSERT INTO test VALUES("+i+",'测试"+i+"');\n");
		}
	}

	/**
	 * 往文件后添加想要的内容
	 * @param file
	 * @param conent
	 */
	public static void writeTXTLine(String file, String conent) {
		BufferedWriter out = null;
		try {
			out = new BufferedWriter(new OutputStreamWriter(
					new FileOutputStream(file, true)));
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

	//创建文件夹和文件
	public static String getPath(){

		//path表示你所创建文件的路径
		String path = "d://stock";
		File f = new File(path);
		if(!f.exists()){
			f.mkdirs();
		} 
		// fileName表示你创建的文件名；为txt类型；
		String fileName="test.sql";
		File file = new File(f,fileName);
		if(!file.exists()){
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		return path+"/"+fileName;
	}

	/**
	 * 读取文本文件的内容
	 */
	public static void readAndRead(String path){	
		if(path == null){
			path="d:\\test.txt";
		}
		
		try{
			FileReader fr = new FileReader(path);//需要读取的文件路径
			BufferedReader br = new BufferedReader(fr);
			String str = br.readLine();	
			while(str!=null)//如果当前行不为空
			{	
				System.out.println(str);//打印当前行
				str= br.readLine();//读取下一行
			}
			br.close();//关闭BufferReader流
			fr.close();	//关闭文件流
		}catch(IOException e)//捕捉异常
		{
			System.out.println("指定文件不存在");//处理异常
		}
	}	
	/**
	 * 字符串拆分打印
	 * @param str
	 */
	public static void splitString (String str){
		String[] strArr = str.split("\\+");
		
		for(int i=0;i<strArr.length;i++){
			System.out.println(strArr[i]);
		}
		

	}
}
