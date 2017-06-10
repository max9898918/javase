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
			operator.writeTXT("d://test/test.txt","INSERT INTO test VALUES("+i+",'����"+i+"');");
		}
		operator.readFileContent(null);
	}
	/**
	 * ���ļ��������Ҫ������
	 * @param file���ļ���·����
	 * @param conent����Ҫ��ӵ����ݣ�
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
	 * �˷������ݴ����
	 * @param path �������߶�ȡ��·��   �磺"d://test"
	 * @param fileName �ļ�����  �磺"test.txt"
	 * @return ·��
	 */
	public String getPath(String path,String fileName){
		File filePath = new File(path);
		if(!filePath.exists()){//���·�������ھʹ�����·��
			filePath.mkdirs();
		} 

		File file = new File(filePath,fileName);// fileName��ʾ�㴴�����ļ�����Ϊtxt���ͣ�
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
	 * ���ݴ����·����ȡ�ļ�������
	 * @param path���ļ���·����
	 */
	public void readFileContent(String path){	
		if(path == null){
			path="d://test/test.txt";
		}

		try{
			FileReader fr = new FileReader(path);//��Ҫ��ȡ���ļ�·��
			BufferedReader br = new BufferedReader(fr);
			String str = br.readLine();	
			while(str!=null){//�����ǰ�в�Ϊ��	
				System.out.println(str);//��ӡ��ǰ��
				str= br.readLine();//��ȡ��һ��
			}
			br.close();//�ر�BufferReader��
			fr.close();	//�ر��ļ���
		}catch(IOException e){//��׽�쳣
			System.out.println("ָ���ļ�������");//�����쳣
		}
	}	

}
