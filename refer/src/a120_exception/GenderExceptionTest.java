package a120_exception;

import java.util.Scanner;

public class GenderExceptionTest {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你的性别！");
		String gender = input.next();
		
		if(gender.equals("男") || gender.equals("女")){
			System.out.println("你输入的性别正确！");
		
		}else{
			try {
				throw new MyException("性别必须是男或者女！");
			} catch (MyException e) {
				e.printStackTrace();
			}
		}

	}
}
