package a090_interview;
import java.io.BufferedReader;  
import java.io.IOException;  
import java.io.InputStreamReader;  

public class Interview02 {  
	public static void main(String args[]) {  
		print();  

	}  

	public static int[] write() {  
		BufferedReader[] buf = new 
				BufferedReader[10];/* ���뻺������ */ 
		int n;/* ������ �� �м��� */ 
		int array[] = new int[10];  
		for (int i = 0; i < 10; i++)/* ��ֵ */ 
		{  
			buf[i] = new BufferedReader(new 
					InputStreamReader(System.in));  
			/* ��ÿ������������ */ 
			do/* �ж��Ƿ��ǿմ����������������� */ 
			{  
				n = 1;  
				System.out.print("�������" + (i + 1) + "������:");  
				try /* ����һ���쳣���� */ 
				{  
					array[i] = Integer.parseInt
							(buf[i].readLine());/* ִ�д������� */ 
					/*  
					 * Integer.parseInt(str) - str
ת�� int�� buf[i].readLine() -  
					 * ��ϵͳ���뻺���������ַ�����
buf�������������ַ���  
					 */ 
				} catch (NumberFormatException e)/* �����쳣 */ 
				{  
					System.out.println("���������������������");/* �����쳣 */ 
					n = 0;  
				} catch (IOException e) {  
					e.printStackTrace();  
				}  
			} while (n == 0);  
		}  
		return array;  

	}  

	public static void print() {  
		int[] ary = write();  
		int s;  
		System.out.println("\n�������������:");  
		for (int i = 0; i < 10; i++)/* ���ԭ���� */ 
		{  
			System.out.print(ary[i] + " ");  
		}  
		for (int i = 0; i < 5; i++)/* �Ի� */ 
		{  
			s = ary[i];  
			ary[i] = ary[9 - i];  
			ary[9 - i] = s;  
		}  

		System.out.println("\n�Ի����������:");  
		for (int i = 0; i < 10; i++)/* ����Ի������� */ 
		{  
			System.out.print(ary[i] + " ");  
		}  
		System.out.println();  
	}  

} 