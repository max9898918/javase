package a090_interview;
import java.util.Scanner;
public class Demo {
	/*
	 * ������ʵ������������������
	 * */
	
	public void test01(){
		int n=0,number;
		Scanner input = new Scanner(System.in);
		System.out.println("������λ��������λ��������");
		number = input.nextInt();                              
		while(number != 0){
			n = n * 10 + number%10;
			number = number/10;
		}
		System.out.println(n);
	}
	
	
	
	public void test02(){
		/*����˹̹����������һ����Ȥ����ѧ�⣺��һ�������ݣ�
		 * ÿ����2�ף����ʣ1�ף���ÿ����3�ף����ʣ2�ף���ÿ����5�ף�
		 * ���ʣ4�ף���ÿ����6�ף����ʣ5�ף�ֻ��ÿ����7�ף����һ��Ҳ��ʣ��
		 * ���ʸý��������ж��ٽס���дһ��Java�����������⡣
		 * */
		int number = 7,x=0;
		for(int j = 0 ;j < 50 ;j++){
			x = number * j;
			if((x%2 == 1) && (x%3 == 2) && (x%5 == 4) && (x%6 ==5) ){
				break;
			}
		}
			System.out.println("�Y���ǣ�"+x);
	}

	
	public void test1(){
		/*һά��������
		 * n���������������ѭ��n-1 �ڲ�ѭ��n-1-i��i�����ѭ����ı����� 
		 * ���ڲ�ѭ������ı�����ȡ���������ֵ����λ����
		 * */
		int[] array = {6,8,2,1,5};
		for(int i=0;i<array.length-1;i++){
			for(int j=0;j<array.length-1-i;j++){
				if(array[j]>array[j+1]){
					int v = array[j];
					array[j]=array[j+1];
					array[j+1] = v;
				}
			}
		}
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+"  ");
		}
	}
	
	public void isString(){
		/*��һ���ַ������뵽һά�����У����ж����ַ������ֽ�*/
		String str = "������1������";
		
		
	
	}
	
}
