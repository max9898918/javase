package day04.���̿������;
/*
����2�� ʵ�ֲ�������Ϸ�� ���û�в¶Կ��Լ���������µ����֣�����¶���ֹͣ����

���ֻ�ܲ����Σ������ʣ�����һ�λ����ʱ��Ҫ�����û���

*/
import java.util.*;
class Demo8 {

	public static void main(String[] args) 
	{
		//����һ�����������
		Random random = new Random();
		//��������������nextInt��������һ�������
		int randomNum = random.nextInt(10)+1; //Ҫ��������� 1~10
		//����һ��ɨ��������
		Scanner scanner = new Scanner(System.in);
		
		while(true){
			System.out.println("��������Ҫ�µ�����:");
			//����ɨ������nextInt����ɨ��һ������
			int guessNum = scanner.nextInt();
			if (guessNum>randomNum){
				System.out.println("�´���..");
			}else if(guessNum<randomNum){
				System.out.println("��С��..");	
			}else{
				System.out.println("��ϲ�㣬�¶���`..");	
				break;
			}
		}
		
	}
}
