package day12.string;

import java.util.Arrays;

/*
 ��������
	String replace(String oldChar, String newChar) �滻
	String[] split(String regex) �и�
	
	String substring(int beginIndex)   ָ����ʼ ������ֵ��ȡ�Ӵ�
	String substring(int beginIndex, int endIndex)ָ����ʼ �����������ֵ��ȡ�Ӵ�
	
	String toUpperCase() ת��д
	String toLowerCase() תСд
	String trim() ȥ���ַ�����β�Ŀո�
	


	
*/

public class Demo5 {
	
	public static void main(String[] args) {
		String str = "�������ϲ�����";
		System.out.println("ָ���������滻�� ������:"+ str.replace("��", "Ҫ�ú�"));
		str = "���-��-��-��";
		String[] arr = str.split("-"); //����ָ�����ַ������и� ��
		System.out.println("�ַ�����������ݣ�"+ Arrays.toString(arr));
		str = "���ݴ��ǲ���";
		System.out.println("ָ����ʼ������ֵ��ȡ�Ӵ�:"+ str.substring(2));
		System.out.println("ָ����ʼ������ֵ��ȡ�Ӵ�:"+ str.substring(2,6)); //��ͷ����β  ע�⣺��ȡ�������ǰ�����ʼ������ֵ������������������ֵ�� ��ȡ��λ���ǽ���������ֵ-1.
		
		str = "abC�й�";
		System.out.println("ת��д��" + str.toUpperCase());
		str = "AbdfSDD"; 
		System.out.println("תСд��"+ str.toLowerCase());
		
		str = "         ������        ���ǳ�Ŭ��            ";
		System.out.println("ȥ���ַ�����β�Ŀո�"+ str.trim());
		
		
	}
	
	


}
