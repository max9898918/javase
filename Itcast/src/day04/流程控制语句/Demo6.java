package day04.���̿������;
/*
���� ����1+2+3+....+ 100���ܺ͡�




*/
class Demo6{

	public static void main(String[] args) 
	{
		int num = 1;
		int sum  = 0;	//����һ���������ڱ���ÿ����ӵĽ��
		while(num<=100){
			sum = sum+num; //  sum = 1  
			num++;
		}

		System.out.println("sum = "+ sum);
	}
}
