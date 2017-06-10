package a090_interview;

import org.junit.Test;

/**
 * 这个类主要是用来测试打印三角形的
 * 创建时间：2017-01-10
 * @author Administrator
 *
 */
public class A01_PrintPolygon {
	
	@Test
	public void run1(){
		test(5);
	}

	public void test(int row){
		if(row<3){
			System.out.println("传入的行数必须大于3");
			return;
		}
		if(row%2 == 0){
			System.out.println("输入的数字必须为单数");
			return;
		}
		System.out.println("打印行数为"+row+"行的实心菱形\n");
		for(int i = 1;i <= row; i++){  
			if(i <= row/2 + 1){  
				for(int k = 1;k <= row/2 + 1- i;k++){  
					System.out.print(" ");  
				}  
				for(int k = 1;k <= i;k++){  
					System.out.print("* ");  
				}  
				System.out.println();  
			}else{  
				for(int k =1;k <= (i -(row/2 + 1));k++){  
					System.out.print(" ");  
				} 
				for(int k = 1;k <= (2 *(row/2 + 1) - i);k++){  
					System.out.print("* ");  
				}  
				System.out.println();  
			}     
		}  
	}

	//测试方法
	public static void main(String[] args) {
		A01_PrintPolygon printPolygon= new A01_PrintPolygon();
		printPolygon.triangleSolid(3);		// 打印正立的实心三角形
		/*  printPolygon.downTriangleSolid(3);  // 打印倒立的实心三角形
		printPolygon.triangleHollow(9);		//打印空心三角形    
		printPolygon.rhombusSolid(5);		//传入指定行数答应菱形
		printPolygon.rhombusHollow(7);		//打印空心菱形                           */		
		
		//printPolygon.test(9);
		
	}
	
	/**
	 * 传入行数打印正立的三角形
	 * @param row（需要打印的行数）
	 */
	public void triangleSolid(int row) {
		System.out.println("打印行数为"+row+"行的上小下大的实心三角形\n");
		for (int i = 1; i <= row; i++) {
			// 控制打印空格
			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}
			// 控制打印*
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	 * 传入行数打印倒立的三角形
	 * @param row（需要打印的行数）
	 */
	public void downTriangleSolid(int row){
		System.out.println("\n\n打印行数为"+row+"行的上大下小的实心三角形\n");
		for (int i = row; i >= 1; i--) {
			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");// 控制打印空格
			}
			// 控制打印*
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	 * 打印空心三角形
	 * @param row（需要打印的行数）
	 */
	public void triangleHollow(int row) {
		System.out.println("\n\n打印行数为"+row+"行的上小下大的空心三角形\n");
		// 控制打印行数
		for (int i = 1; i <= row; i++) {
			// 控制打印空格
			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}
			// 控制打印*
			for (int k = 1; k <= 2 * i - 1; k++) {
				// 第一行,最后一行全部打印*
				if (i == 1 || i == row) {
					System.out.print("*");
				} else {
					// 第一个和最后一个打印*其余打印空格
					if (k == 1 || k == 2 * i - 1) {
						System.out.print("*");
					} else {
						System.out.print(" ");
					}
				}
			}
			System.out.println();
		}
	}
	
	/**
	 * 传入指定行数打印实心菱形
	 * @param row（需要打印的行数）
	 */
	public void rhombusSolid(int row){
		if(row<3){
			System.err.println("传入的行数必须大于3");
			return;
		}
		System.out.println("\n\n打印行数为"+row+"行的实心菱形\n");
		for(int i = 1;i <= row;i++){  
			if(i <= row/2 + 1){  
				for(int k = 1;k <= row/2 + 1- i;k++){  
					System.out.print(" ");  
				}  
				for(int k = 1;k <= i;k++){  
					System.out.print("* ");  
				}  
				System.out.println();  
			}else{  
				for(int k =1;k <= (i -(row/2 + 1));k++){  
					System.out.print(" ");  
				}  
				for(int k = 1;k <= (2 *(row/2 + 1) - i);k++){  
					System.out.print("* ");  
				}  
				System.out.println();  
			}     
		}  
	}
	
	/**
	 * 传入指定行数打印空心菱形
	 * @param row（需要打印的行数）
	 */
	public void rhombusHollow(int row){
		int yiban = row / 2 + 1;  
		int yibanduo = row / 2;  
		System.out.println("\n\n打印行数为"+row+"行的空心菱形\n");
		//打印上半截菱形
		for(int k = 1;k <= yiban;k++){  
			for(int i = 1;i <= (yiban - k);i++){  
				System.out.print(" ");  
			}  
			System.out.print("*");  
			for(int i = 1;i <= ( (k - 2) * 2 + 1);i++){  
				System.out.print(" ");  
			}  
			if(k != 1){  
				System.out.print("*");    
			}  
			System.out.println();  
		}  
		//打印下半截菱形
		for(int k = yibanduo;k >=1;k--){  
			for(int i = 1;i <= (yiban - k);i++){  
				System.out.print(" ");  
			}  
			System.out.print("*");  
			for(int i = 1;i <= ( (k - 2) * 2 + 1);i++){  
				System.out.print(" ");  
			}  
			if(k != 1){  
				System.out.print("*");    
			}  
			System.out.println();  
		}  
		
	}
	
}
