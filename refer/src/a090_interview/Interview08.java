package a090_interview;

import java.util.Scanner;
/**
 * �ó�����Ҫ���ж���������Ƿ��ǻ���
 * */
public class Interview08 {
	public static void main(String[] args) {
		ish();
	}
	
	public static void ish(){
		int number,x;
		Scanner input = new Scanner(System.in);
		System.out.println("��������Ҫ���Ե�������");
		number = input.nextInt();
		x = reverse(number);
		//�ж���������Ƿ������λ
		if(number >=10 || number <= -10){
			
			if(x == number){
				System.out.println("��������"+number+" �ǻ���");
			}else{
				System.out.println("�������ˣ�"+number+" ���ǻ���");
			}
		
		}else{
			System.out.println("���������ֻ��һλ��û�в��Ե����塣���������룡");
			ish();
		}
		
	}
	//���������������
	public static int reverse(int number){
		int n1=0,n2 = number ;
		while(n2 != 0){
			n1 = n1*10 + n2%10;
			n2 = n2/10;
		}
		
		return n1;
	}
}
