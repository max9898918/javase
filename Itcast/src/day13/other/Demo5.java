package day13.other;
import java.util.Random;
/*
�������
Random


���� ��дһ���������������λ����֤�롣

 */

public class Demo5 {

	public static void main(String[] args) {
		
		Random random = new Random();
		int randomNum = random.nextInt(100)+1; //���� �� ���������0-10֮��
		System.out.println("�������"+ randomNum);
		
		/*char[] arr = {'��','��','��','a','Q','f','B'};
		StringBuilder sb = new StringBuilder();
		Random random = new Random();
		//��Ҫ�ĸ��������ͨ���������ȡ�ַ������е��ַ���
		for(int i  = 0 ; i< 4 ; i++){
			int index = random.nextInt(arr.length);  //������ ��������������������ֵ��Χ֮�ڵġ�
			sb.append(arr[index]);
		}
		System.out.println("��֤�룺"+ sb);*/
		
		
	}
	
}
