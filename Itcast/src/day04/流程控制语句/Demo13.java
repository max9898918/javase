package day04.���̿������;
/*
���� �ڿ���̨�ϴ�ӡһ��������ֱ�������� ��

*
**
***
****
*****

���ж��е�ͼ�Ρ�

���� 5��

������ �ᷢ���仯 ��.

��������:
	
	i = 0 ; i<5; j=0 ; j<=i 	1���Ǻ�
	i = 1 ; i<5 ;j=0 ; j<=1 	2���Ǻ�
	i = 2 ; i<5; j=0 ; j<=2    3���Ǻ�
	.....




*/
class Demo13 
{
	public static void main(String[] args) 
	{
		for(int i = 0 ; i< 5 ; i++){
			for(int j = 0 ; j<=i ; j++){ //�������� 
				System.out.print("*");
			}
			//����
			System.out.println();
		}
	}
}
