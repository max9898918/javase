package a090_interview;

import org.junit.Test;

/**
 * �������Ҫ���������Դ�ӡ�����ε�
 * ����ʱ�䣺2017-01-10
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
			System.out.println("����������������3");
			return;
		}
		if(row%2 == 0){
			System.out.println("��������ֱ���Ϊ����");
			return;
		}
		System.out.println("��ӡ����Ϊ"+row+"�е�ʵ������\n");
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

	//���Է���
	public static void main(String[] args) {
		A01_PrintPolygon printPolygon= new A01_PrintPolygon();
		printPolygon.triangleSolid(3);		// ��ӡ������ʵ��������
		/*  printPolygon.downTriangleSolid(3);  // ��ӡ������ʵ��������
		printPolygon.triangleHollow(9);		//��ӡ����������    
		printPolygon.rhombusSolid(5);		//����ָ��������Ӧ����
		printPolygon.rhombusHollow(7);		//��ӡ��������                           */		
		
		//printPolygon.test(9);
		
	}
	
	/**
	 * ����������ӡ������������
	 * @param row����Ҫ��ӡ��������
	 */
	public void triangleSolid(int row) {
		System.out.println("��ӡ����Ϊ"+row+"�е���С�´��ʵ��������\n");
		for (int i = 1; i <= row; i++) {
			// ���ƴ�ӡ�ո�
			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}
			// ���ƴ�ӡ*
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	 * ����������ӡ������������
	 * @param row����Ҫ��ӡ��������
	 */
	public void downTriangleSolid(int row){
		System.out.println("\n\n��ӡ����Ϊ"+row+"�е��ϴ���С��ʵ��������\n");
		for (int i = row; i >= 1; i--) {
			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");// ���ƴ�ӡ�ո�
			}
			// ���ƴ�ӡ*
			for (int k = 1; k <= 2 * i - 1; k++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	/**
	 * ��ӡ����������
	 * @param row����Ҫ��ӡ��������
	 */
	public void triangleHollow(int row) {
		System.out.println("\n\n��ӡ����Ϊ"+row+"�е���С�´�Ŀ���������\n");
		// ���ƴ�ӡ����
		for (int i = 1; i <= row; i++) {
			// ���ƴ�ӡ�ո�
			for (int j = 1; j <= row - i; j++) {
				System.out.print(" ");
			}
			// ���ƴ�ӡ*
			for (int k = 1; k <= 2 * i - 1; k++) {
				// ��һ��,���һ��ȫ����ӡ*
				if (i == 1 || i == row) {
					System.out.print("*");
				} else {
					// ��һ�������һ����ӡ*�����ӡ�ո�
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
	 * ����ָ��������ӡʵ������
	 * @param row����Ҫ��ӡ��������
	 */
	public void rhombusSolid(int row){
		if(row<3){
			System.err.println("����������������3");
			return;
		}
		System.out.println("\n\n��ӡ����Ϊ"+row+"�е�ʵ������\n");
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
	 * ����ָ��������ӡ��������
	 * @param row����Ҫ��ӡ��������
	 */
	public void rhombusHollow(int row){
		int yiban = row / 2 + 1;  
		int yibanduo = row / 2;  
		System.out.println("\n\n��ӡ����Ϊ"+row+"�еĿ�������\n");
		//��ӡ�ϰ������
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
		//��ӡ�°������
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
