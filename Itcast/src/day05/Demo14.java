package day05;
/*
toString();
����sort��
��Ԫ���������е�λ��(���ֲ��ҷ�)  binarySearch

����Ĺ����ࣨArrays����


��ҵ1�� �Զ�ʵ��һ��Arrays��toString������

*/
import java.util.*;
class Demo14 
{
	
	public static void main(String[] args) 
	{
		int[] arr = {12,3,1,10,8};
		//����ķ���
		Arrays.sort(arr);  
		String info = Arrays.toString(arr);
		System.out.println("�����Ԫ�أ�"+ info);

		// 1, 3, 8, 10, 12  
		int index = Arrays.binarySearch(arr,3);// ���ַ����� : ��������������ҵ���Ӧ ��Ԫ�أ���ô�ͷ��ظ����ݵ�����ֵ�����û���ҵ���ô�ͷ���һ��������ʾ��
		System.out.println("�ҵ�������ֵ��"+ index);
		
	}
}
