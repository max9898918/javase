package a090_interview;


public class Test02 {
	public void sum() {
		// ����������1������1�������⣬���ܱ��κ���������Ҳ���ǳ���1�������������
		// дһ�����򣬼���1��һ��֮�������֮��
		int sum = 0;
		for (int i = 2; i < 101; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
					break;
				}
			}
			if (flag) {
				sum += i;
			}
		}
		System.out.println("���Ϊ��" + sum);
	}

	// row��ֵ�Ƕ��پʹ�ӡ�ж����еĵ�����������
	public void print() {
		int i, j;
		int row = 3;
		for (i = 1; i <= row; i++) {
			for (j = 1; j <= i - 1; j++) {
				System.out.print(" ");
			}
			for (j = 1; j <= row + 1 - i; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

	// ��ӡ������
	public void print02() {
		System.out.println("*");
		int i, j;
		int row = 5;
		
		for (i = 1; i < row; i++) {
			for (j = 1; j <= i*row; j++) {
				System.out.print("*");
			}
				System.out.println();
		}
		
		for(int x=row; x>0;x--){
			for(int y = 1; y<=x*row;y++){
				System.out.print("*");
			}
			System.out.println();
		}
			System.out.println("*");
		
	}

	public void sum100() {
		int sum = 0;
		for (int i = 2; i < 100; i++) {
			boolean flag = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {

					flag = false;
					break;
				}
			}
			if (flag) {

				sum += i;
			}
		}
		// дһ�����򣬼���1��һ��֮�������֮��//�����1060
		System.out.println(sum);
	}
}
