package day09;
/*
ֵ����: ����һ��������ʱ�򣬴��ݸ������Ĳ��� ��ʵ���ϴ��ݱ������洢��ֵ��

*/
import java.util.*;
class Person{

	int x =10;
}


class Demo5 
{
	public static void main(String[] args) 
	{
		/*
		int a = 3;
		int b = 5; 
		changeValue(a,b);
		System.out.println("����֮���ֵ��a = "+a +" b="+b); 

		int[] arr = {23,10,9};
		changeArr(arr,1,2);
		System.out.println("����Ԫ�أ�"+ Arrays.toString(arr));// 9 ,10
			*/
		Person p = new Person();
		changeObj(p,20);
		System.out.println("x = "+ p.x);
	}
	
	public static void changeObj(Person p ,int x){
		p.x = x;
	}



	
	//����2�� ����һ�������������������� Ԫ�ص�λ�á�
	public  static void changeArr(int[] arr , int index1,  int  index2){
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	
	}



	//����1������һ���������������������ͱ�����ֵ�� 
	public static void changeValue(int a , int b){
		int temp = a;
		a = b;
		b = temp;
		System.out.println("�����ڲ�������ֵ��a = "+a +" b="+b);
	}

}
