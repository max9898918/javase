package day12.string;
/*
 String �ַ�����:
  
 ������Ŀ��new String("abc")�����˼�������
  �������� һ�������� λ���ַ����������У�һ��������λ�ڶ��ڴ��С�

 */


public class Demo1 {
	
	public static void main(String[] args) {
		
		String str1 = "hello";
		String str2 = "hello";
		String str3 = new String("hello");
		String str4 = new String("hello");
		System.out.println("str1==str2?"+(str1==str2));  // true  
		System.out.println("str2==str3?"+(str2==str3));  //false
		System.out.println("str3==str4?"+(str3==str4));  // false
		System.out.println("str3.equals(str2)?"+(str3.equals(str4))); //true
		//��String����д��Object��equals�������Ƚϵ��������ַ������� ������ �Ƿ�һ�¡�
		// "=="���ڱȽ� ���������������ݵ�ʱ��Ƚϵ����������� ���ڴ��ַ��equals����Ĭ������±Ƚ�Ҳ���������� ���ڴ��ַ��
		
		test(null);
	}
	
	public static void test(String str){
		if("�й�".equals(str))
		{
			System.out.println("�ش���ȷ");
		}else{
			System.out.println("�ش����");
		}
	}
	
}
