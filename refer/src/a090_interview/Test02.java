package a090_interview;


public class Test02 {
	public void sum() {
		// 质数：大于1，除了1和自身外，不能被任何数整除，也就是除以1和自身会有余数
		// 写一个程序，计算1到一百之间的质数之和
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
		System.out.println("结果为：" + sum);
	}

	// row的值是多少就打印有多少行的倒立的三角形
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

	// 打印三角形
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
		// 写一个程序，计算1到一百之间的质数之和//结果是1060
		System.out.println(sum);
	}
}
