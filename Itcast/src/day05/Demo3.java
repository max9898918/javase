package day05;
/*
���� ����һ���������ӷ����ܡ�

���������أ���һ�����г������������������ϵ�ͬ���������������Ϊ���������ء�

�������ص����ã� ͬһ�����������Գ����˲�ͬ�ĺ�������Ӧ�Բ�ͬ�������߲�ͬ�������͵Ĳ�����

�������ص�Ҫ��
	1. ������һ�¡�
	2. �β��б�һ�¡�����ʽ�����ĸ��������Ƕ�Ӧ���������Ͳ�һ�£�
	3. �뺯���ķ���ֵ�������޹صġ�

*/
class Demo3 
{
	public static void main(String[] args) 
	{
		System.out.println("�����֪ʶ���Ƿ�������д�����ݲ����Ĳ�ͬ���ò�ͬ������");
		add(1,2);
		add(1,2.0);
	}

// ��Щ�������������ӷ����㡣
	public static double add(int a, int b){
		System.out.println("�����������ܺ�: "+ (a+b));
		return 3.14;
	}
	
	//�ظ�����
	public static int add(int a, double b){
		System.out.println("double�������ܺ�: "+ (a+b));
		return 12;
	}

	
	
	public static void add(int a , int b , int c){
		System.out.println("�����������ܺ�: "+ (a+b+c));
	}


	public static void add(int a , int b , int c,int d){
		System.out.println("�ĸ��������ܺ�: "+ (a+b+c+d));
	}


}
