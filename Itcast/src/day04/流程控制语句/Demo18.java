package day04.���̿������;
/*
continue�ؼ���

continue�����÷�Χ�� continueֻ������ѭ����䡣

continue�����ã�continue���������������ε�ѭ�������ݡ�������һ�Ρ�

continueҪע������
	1. ��һ������£�continue���治�ܸ���������䣬��Ϊ����Զ���޷�ִ�е���
	2. continue Ҳ������ϱ��ʹ�õġ�

*/

class Demo18 
{
	public static void main(String[] args) 
	{
		/*
		for(int i = 0 ; i<5 ; i++){ // i=1  2
			if(i==1){
				continue;
			}
			System.out.println("hello "+i);
		}

		
		
		outer:for(int i = 0 ; i<3; i++){ // i= 0;  i =1 i=2 3
			inner:for(int j = 0 ; j<2 ; j++){ //j=0
				System.out.println("hello"); //1 2 3
				continue outer;
			}
		}

		���� ����1-100��ż���ܺ�.
		*/
		
		int sum = 0 ;
		for(int num = 1 ; num<=100 ; num++){
			if(num%2!=0){
				continue;  //�������������������ѭ����
			}
			
			sum  = sum+num;
		}

		System.out.println("�ܺͣ�"+ sum);


	}
}
