package day03.�����;

/*
�Լ��� ������-1.

ǰ�Լ�: --λ�ڲ�������ǰ�档  --������

ǰ�Լ��� ���Լ�����ʹ�á�

----------------------------------------------

���Լ���--λ�ڲ������ĺ��档 ������--��

���Լ��� ��ʹ�ã����Լ���

*/
class Demo5 
{
	public static void main(String[] args) 
	{	
		/*
		int i = 1;
		int sum = --i;  //ǰ�Լ�   i = i-1 , sum = i;
		int sum = i--; // ���Լ�   sum = i ; i = i-1;
		System.out.println("sum = "+ sum);  // 0  1 
		*/

		int num = 10;
		//int sum = 10* num++; //������
		int sum = 10* ++num; //ǰ���� 
		System.out.println("sum = "+ sum);

	}
}
