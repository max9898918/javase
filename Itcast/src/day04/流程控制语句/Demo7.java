package day04.���̿������;
/*
����1:����1-100,7�ı����ܺ͡� 7  14 21


��β���һ���������

���裺	
	1. ����һ�����������
	2. ��������������nextInt������
	3. ������
*/
class Demo7 {

	public static void main(String[] args){
		int num = 1;
		int sum = 0;	//����һ���������ڱ���ÿ����ӵ��ܺ͡�
	
		while(num<=100){ // num = 1
			
			if(num%7==0){
				sum = sum+num;
				
			}
			num++;	
			
			
		}

		System.out.println("�ܺ��ǣ�"+ sum);
		
	}
}
