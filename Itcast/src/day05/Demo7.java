package day05;
/* 
����ĳ�ʼ����ʽ��
	
	��̬��ʼ��:
		��������[] ������ = new ��������[����];

	��̬��ʼ����	
		��������[] ������ = {Ԫ��1��Ԫ��2.....};


�������һ��ʼ����Ѿ�ȷ�������ݣ���ô��ʱ����ʹ�þ�̬��ʼ�������
����һ��ʼ����̫��ȷ����ʱ��ͽ���ʹ�ö�̬��ʼ����


*/
class Demo7 
{


	


	public static void main(String[] args) 
	{	
		//��̬��ʼ��
		//int[] arr = new int[10];
	
		//��̬��ʼ��
		int[] arr = {10,20,30,40,50};
		for(int index = 0 ; index<arr.length ; index++){
			 System.out.print(arr[index]+",");
		}


	/*
		int[] arr = new int[50];
		Scanner scanner = new Scanner(System.in);
		for(int i  = 0 ; i< arr.length ; i++){
			arr[i] = scanner.nextInt();
		}
		*/
	}
}
