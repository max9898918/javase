package day05;
/*
��������������⣺
	
	1. NullPointerException ��ָ���쳣
	ԭ�� �������ͱ���û��ָ���κζ��󣬶������˶�������Ի����ǵ����˶���ķ�����\

	2. ArrayIndexOutOfBoundsException ����ֵԽ�硣
	ԭ�򣺷����˲����ڵ�����ֵ��
*/
class Demo6 
{
	public static void main(String[] args) 
	{
		/*
		int[] arr = new int[2];
		arr = null ;  //null �øñ�����Ҫ�����κεĶ��� ��Ҫ��¼�κ� ���ڴ��ַ��
		arr[1] = 10;
		System.out.println(arr[1]);
		
		*/

		int[] arr = new int[4];
		arr[0] = 10;
		arr[1] = 30;
		arr[2]  =40;
		arr[3] = 50;
		//System.out.println(arr[4]); //��������ֵΪ4���ڴ�ռ�洢��ֵ��
			
		for(int index = 0 ; index<=arr.length ; index++){
			System.out.print(arr[index]+",");
		}


	}
}
