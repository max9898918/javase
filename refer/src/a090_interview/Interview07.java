package a090_interview;

public class Interview07 {
	/*����˹̹����������һ����Ȥ����ѧ�⣺��һ�������ݣ�
	 * ÿ����2�ף����ʣ1�ף���ÿ����3�ף����ʣ2�ף���ÿ����5�ף�
	 * ���ʣ4�ף���ÿ����6�ף����ʣ5�ף�ֻ��ÿ����7�ף����һ��Ҳ��ʣ��
	 * ���ʸý��������ж��ٽס���дһ��Java�����������⡣
	 * */
	public static void main(String[] args) {      
		int number = 7,result =0;
		for(int i=0;i<50;i++){
			//
			if((result%2 == 1) && (result%3 == 2) && 
					(result%5 == 4) && (result%6 == 5)){
				break;
			}
			result = number*i;
		}
		System.out.println("���Ϊ��" + result);
	}
}
