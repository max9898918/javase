package com.stock.txt;

import java.io.*;
public class TxTAddLine {
	
	public static void main(String[] args) throws IOException{
		for(int i= 0;i<7;i++){
			writeTXTLine(getPath(),"INSERT INTO test VALUES("+i+",'����"+i+"');\n");
		}
	}

	/**
	 * ���ļ��������Ҫ������
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

	//�����ļ��к��ļ�
	public static String getPath(){

		//path��ʾ���������ļ���·��
		String path = "d://stock";
		File f = new File(path);
		if(!f.exists()){
			f.mkdirs();
		} 
		// fileName��ʾ�㴴�����ļ�����Ϊtxt���ͣ�
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
	 * ��ȡ�ı��ļ�������
	 */
	public static void readAndRead(String path){	
		if(path == null){
			path="d:\\test.txt";
		}
		
		try{
			FileReader fr = new FileReader(path);//��Ҫ��ȡ���ļ�·��
			BufferedReader br = new BufferedReader(fr);
			String str = br.readLine();	
			while(str!=null)//�����ǰ�в�Ϊ��
			{	
				System.out.println(str);//��ӡ��ǰ��
				str= br.readLine();//��ȡ��һ��
			}
			br.close();//�ر�BufferReader��
			fr.close();	//�ر��ļ���
		}catch(IOException e)//��׽�쳣
		{
			System.out.println("ָ���ļ�������");//�����쳣
		}
	}	
	/**
	 * �ַ�����ִ�ӡ
	 * @param str
	 */
	public static void splitString (String str){
		String[] strArr = str.split("\\+");
		
		for(int i=0;i<strArr.length;i++){
			System.out.println(strArr[i]);
		}
		

	}
}
