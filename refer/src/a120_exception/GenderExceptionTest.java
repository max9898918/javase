package a120_exception;

import java.util.Scanner;

public class GenderExceptionTest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("����������Ա�");
		String gender = input.next();
		
		if(gender.equals("��") || gender.equals("Ů")){
			System.out.println("��������Ա���ȷ��");
		
		}else{
			try {
				throw new MyException("�Ա�������л���Ů��");
			} catch (MyException e) {
				e.printStackTrace();
			}
		}

	}
}
