package a090_interview;

import java.util.Scanner;
/**
 * 该程序主要是判断输入的数是否是回文
 * */
public class Interview08 {
	public static void main(String[] args) {
		ish();
	}
	
	public static void ish(){
		int number,x;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入你要测试的整数！");
		number = input.nextInt();
		x = reverse(number);
		//判断输入的数是否大于两位
		if(number >=10 || number <= -10){
			
			if(x == number){
				System.out.println("你输入了"+number+" 是回文");
			}else{
				System.out.println("你输入了："+number+" 不是回文");
			}
		
		}else{
			System.out.println("你输入的数只有一位、没有测试的意义。请重新输入！");
			ish();
		}
		
	}
	//把输入的数倒过来
	public static int reverse(int number){
		int n1=0,n2 = number ;
		while(n2 != 0){
			n1 = n1*10 + n2%10;
			n2 = n2/10;
		}
		
		return n1;
	}
}
