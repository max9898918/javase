package day04.���̿������;
/*
break�� 

break���÷�Χ��ֻ������switch������ѭ������С�

break���ã�
	1. break����switch���������ǽ���һ��switch��䡣
	2. break����ѭ������е������ǽ�����ǰ���ڵ�ѭ����䡣

������Ŀ��breakĿǰλ���ڲ��forѭ������β�����break��������� ��forѭ����
	���Ա�ǽ��


��ǵ�����ֻҪ���ϱ�ʶ�����������򼴿ɡ�




*/
class Demo17 
{
	public static void main(String[] args) 
	{
		aaa:for(int j = 0 ; j<3 ; j++){ // j=0 ���forѭ��
			bbb:for(int i = 0 ; i< 2 ; i++){  // i=0 �ڲ�forѭ��
				System.out.println("hello world"); // 1	
				break bbb;
			}
			
		}


	}
}
