package day04.���̿������;

/*
���� ʹ��do-while���1-100֮��ż�����ܺ͡�

*/
class Demo10 
{
	public static void main(String[] args) 
	{
		int num = 1;
		int sum = 0;	//����һ���������ڱ���ÿ����ӵ��ܺ�
		do{
			if(num%2==0){
				sum += num;
			}
			num++;
		}while(num<101);

		System.out.println("sum = "+ sum);
	}
}
