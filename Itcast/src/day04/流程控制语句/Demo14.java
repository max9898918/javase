package day04.���̿������;
/*
���� ��ӡһ��������ֱ�������Ρ�

*****
****
***
**
*

5��

�����ᷢ���仯
					  j<(5-i)
	i= 0 ; i<5; j=0 ; j<5 ;	����Ǻ�
	i = 1; i<5; j=0 ; j<4; 	�ĸ��Ǻ�
	i = 2; i<5; j=0 ; j<3; 	�����Ǻ�


*/

class Demo14 
{
	public static void main(String[] args) 
	{
		for(int i = 0 ; i<5;  i++){
			for (int j = 0 ; j<(5-i)  ;j++ ){
				System.out.print("*");
			}
			//����
			System.out.println();
		}
	}
}
