package day13.other;

import java.io.IOException;

import javax.management.RuntimeErrorException;

/*
 RunTime   ��������Ҫ������Ӧ�ó������еĻ�����
 	
 	getRuntime()  ���ص�ǰӦ�ó�������л�������
 	exec(String command)  ����ָ����·��ִ�ж�Ӧ�Ŀ�ִ���ļ���
 	freeMemory()   ���� Java ������еĿ����ڴ������� ���ֽ�Ϊ��λ
 	maxMemory()    ���� Java �������ͼʹ�õ�����ڴ�����
 	totalMemory()    ���� Java ������е��ڴ�����
 	
 	
 
 */
public class Demo2 {

	public static void main(String[] args) throws IOException, InterruptedException {
		Runtime runtime = Runtime.getRuntime();
//		Process process = runtime.exec("C:\\Windows\\notepad.exe");
//		Thread.sleep(3000); //�õ�ǰ����ֹͣ3�롣
//		process.destroy();
		System.out.println(" Java������еĿ����ڴ�����"+runtime.freeMemory());
		System.out.println("Java �������ͼʹ�õ�����ڴ���:"+ runtime.maxMemory());
		System.out.println("���� Java ������е��ڴ�����:"+ runtime.totalMemory());
	}
}
