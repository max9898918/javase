package day16.itcast.genrictiry;
/*
 ���� ����һ���������Խ����������͵Ĳ��������ҷ���ֵ���ͱ��� Ҫ��ʵ�ε�����һ�¡�
 
 �Զ��巺�ͣ�  �Զ��巺�;���һ���������͵�ռλ��������һ���������͵ı�����
 
 �������Զ��巺�ͣ�
 	
 	���η�  	<�����Զ���ķ���>����ֵ����    ������(ʹ���Զ��巺�� ...){
 	
 	}

 
�ڷ����в���ʹ�û����������ͣ������Ҫʹ�û����������ͣ���ô��ʹ�û����������Ͷ�Ӧ�İ�װ���͡�

 byte----> Byte
 short---> Short 
 int----> Integer
 long----> Long 
 
 double ----> Double 
 float -----> Float
 
 boolean-----Boolean
 
 char-------�� Character 
 
 
 ��������ע������
 	1. �ڷ������Զ��巺�ͣ�����Զ��巺�͵ľ��������������ڵ��ø� ������ʱ����ʵ��ʱȷ��������������͵ġ�
 	2. �Զ��巺��ֻҪ���ϱ�ʶ�� ���������򼴿�, �����Զ��巺������һ�㶼ϰ��ʹ��һ����д��ĸ��ʾ��  T Type  E Element
 	
 */


public class Demo2 {

	public static void main(String[] args) {
		String str = getData("abc");
		Integer i = getData(123);
	}
	
	
	public static <abc>abc getData(abc o){
		
		return o;
	}
}
