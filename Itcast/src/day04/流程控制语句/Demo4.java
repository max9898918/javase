package day04.���̿������;
/*
���� ���ܼ���¼��һ���·ݣ� ���ݶ�Ӧ���·������Ӧ�ļ��ڡ�
	
	345  ����
	678 ����
	9 10 11 ����
	1 2 12 ����

Ҫ��ʹ��switch���ʵ�֡�


*/
import java.util.*;
class Demo4 
{
	public static void main(String[] args) 
	{
		System.out.println("������һ���·ݣ�");
		//����һ��ɨ����
		Scanner scanner = new Scanner(System.in);
		//����ɨ������nextInt����
		int month = scanner.nextInt();
		switch(month){
			case 3:
			case 4:
			case 5:
				System.out.println("����");
				break;
			case 6:
			case 7:
			case 8:
				System.out.println("����");
				break;
			case 9:
			case 10:
			case 11:
				System.out.println("����");
				break;
			case 12:
			case 1:
			case 2:
				System.out.println("����");
				break;
			default:
				System.out.println("û�ж�Ӧ�ļ���");
				break;
		}
		

	}
}
