package a040_socket;

import java.io.*;
import java.net.Socket;

public class A005_Client {
	public static void main(String[] args) throws IOException {
		//�ͻ���
		//1�������ͻ���Socket��ָ����������ַ�Ͷ˿�
		Socket socket =new Socket("localhost",10086);
		//2����ȡ���������������˷�����Ϣ
		OutputStream os = socket.getOutputStream();//�ֽ������
		PrintWriter pw =new PrintWriter(os);//���������װ�ɴ�ӡ��
		pw.write("�û�����admin�����룺123");
		pw.flush();
		socket.shutdownOutput();
		//3����ȡ������������ȡ�������˵���Ӧ��Ϣ
		InputStream is = socket.getInputStream();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		String info = null;
		while((info=br.readLine()) != null){
			System.out.println("���ǿͻ��ˣ�������˵��"+info);
		}

		//4���ر���Դ
		br.close();
		is.close();
		pw.close();
		os.close();
		socket.close();
	}
}
