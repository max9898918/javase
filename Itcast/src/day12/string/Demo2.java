package day12.string;
/*
 String �Ĺ��췽����
 
 	String()  ����һ�������� ���ַ�������
 	String(byte[] bytes)  ʹ��һ���ֽ����鹹��һ���ַ�������
 	String(byte[] bytes, int offset, int length) 
 		bytes :  Ҫ���������
 		offset�� ָ�����������Ǹ�����ֵ��ʼ���롣
 		length����Ҫ������Ԫ�ء�
 	
 	String(char[] value)  ʹ��һ���ַ����鹹��һ���ַ�����	
 	String(char[] value, int offset, int count)  ʹ��һ���ַ����鹹��һ���ַ����� ָ����ʼ������ֵ����ʹ���ַ�������
	String(int[] codePoints,int offset,int count)
	String(String original) 

��ס�� ʹ���ֽ���������ַ����鶼���Թ���һ���ַ�������


 */
public class Demo2 {
	
	public static void main(String[] args) {
		String str = new String();
		byte[] buf = {97,98,99};
		
		str = new String(buf); //ʹ��һ���ֽ����鹹��һ���ַ�������
		str = new String(buf,1,2);   //ʹ��һ���ֽ����鹹��һ���ַ�������,ָ����ʼ���� ������ֵ�ͽ���ĸ�����
		
		char[] arr = {'��','��','��','ʥ','��'};
		str = new String(arr); //ʹ���ַ����鹹��һ���ַ���
		str = new String(arr,3,2);
		
		int[] 	buf2 = {65,66,67};
		str = new String(buf2,0,3);
		
		str = new String("abc");
		
		
		System.out.println("�ַ��������ݣ�"+str);
		
		
		
		
	}
	
}
