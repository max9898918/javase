package day12.string;

import java.util.Arrays;

/*
2.3	�жϷ���
	boolean endsWith(String str) �Ƿ���ָ���ַ�����
	boolean isEmpty()�Ƿ񳤶�Ϊ0 �磺���� null V1.6
	boolean contains(CharSequences) �Ƿ����ָ������ Ӧ�ã�����
	boolean equals(Object anObject) �Ƿ����
	boolean equalsIgnoreCase(String anotherString) ���Դ�Сд�Ƿ����

2.4	ת������     
char[] toCharArray()  ���ַ���ת��Ϊ�ַ�����
byte[]	getBytes();

�ֽ��������ַ����顢�ַ�����������֮���ǿ��Ի���ת����

*/
public class Demo4 {
	
	public static void main(String[] args) {
		String str = "Demo.java";
		System.out.println("�Ƿ���ָ�� ���ַ�������:"+ str.endsWith("ja"));
		//str = "";
		System.out.println("�ж��ַ����Ƿ�Ϊ�����ݣ�"+str.isEmpty());
		System.out.println("�ж��ַ����Ƿ����ָ�������ݣ�"+ str.contains("Demo"));
		System.out.println("�ж����� �ַ����������Ƿ�һ�£�"+ "DEMO.JAVA".equals(str));
		System.out.println("�ж������ַ����������Ƿ�һ��(���Դ�Сд�Ƚ�):"+ "DEMO.JAVA".equalsIgnoreCase(str));
		
		
		//ת���ķ���
		char[] buf = str.toCharArray();  //���ַ���ת���ַ�����
		System.out.println("�ַ����飺"+ Arrays.toString(buf));
		byte[] buf2 = str.getBytes();	//���ַ���ת�ֽ�����
		System.out.println("�ֽ����飺"+ Arrays.toString(buf2));
	}

}
