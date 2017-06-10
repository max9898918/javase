package day07;
public class Calculator{

	private int num1; //操作数1

	private int num2;  //操作数2
 
	private	char option ; //运算符
	

	

	//提供公共的方法设置属性值....					
	public void initCalculator(int n1 , int n2 , char o){
		num1 = n1;
		num2 = n2;
		if(o=='+'||o=='-'||o=='*'||o=='/'){
			option = o;
		}else{
			option = '+';	
		}
	}


	//计算的功能
	public void calculate(){
		switch(option){
			case '+':
				System.out.println("做加法运算,结果是："+(num1+num2));
				break;
			case '-':
				System.out.println("做减法运算,结果是："+(num1-num2));
				break;
			case '*':
				System.out.println("做乘法运算,结果是："+(num1*num2));
				break;
			case '/':
				System.out.println("做除法运算,结果是："+(num1/num2));
				break;
		}
	}


}