package day03.process;

/*
���� ����¼��һ�����������ݷ��������Ӧ�ĵȼ���

���磺 100-90  A�ȼ�    89-80  B�ȼ� ..... E�ȼ�


���ܼ���¼�����ݵĲ��裺
	1. ����һ��ɨ��������
	2. ����ɨ���������nextInt����ɨ�����ݡ�
	3. �������
*/
import java.util.*;
class Demo3 
{
	public static void main(String[] args) 
	{
		
	
		//����һ��ɨ����
		Scanner scanner = new Scanner(System.in);
		//����ɨ����ɨ�����¼�������
		
		System.out.println("�����뿼�Ե÷֣����򽫶Է�������������");
		int score = scanner.nextInt(); //������һ��num��������ɨ�赽���ݡ�
		
		if(score>=90&&score<=100){
			System.out.println("A�ȼ�");
		}else if(score>=80&&score<=89){

			System.out.println("B�ȼ�");
		}else if(score>=70&&score<=79){
			
			System.out.println("C�ȼ�");
		}else if(score>=60&&score<=69){
			
			System.out.println("D�ȼ�");
		}else if(score>=0&&score<=59){
			
			System.out.println("E�ȼ�");
		}else{
			System.out.println("����..");
		}
		
	
	}
}
