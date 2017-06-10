package a010_keyword;

import org.junit.Test;
/**
 * 本类证明：
 *   1、静态代码块最先执行、不过new多少次对象、只会执行一次。
 *   2、构造代码块仅次于静态代码块执行、优先于构造函数执行、new多少次对象就执行多少次。
 *   3、在静态方法中不能调用非静态方法、但是在非静态方法中可以调用静态方法。
 * @author Administrator
 * 创建时间：2017-04-01
 */
public class A001_Statis03 {
	
	
	
	public static void main(String[] args) {
		new A001_Statis03();
		new A001_Statis03();
		new A001_Statis03();
	}
	
	public A001_Statis03(){
		super();
		System.out.println("构造函数！");
	}
	
	
	{
		System.out.println("构造代码块！");
	}
	
	static {
		System.out.println("静态代码块！");
	}
	
	@Test
	public void run1(){
		run2();//在非静态方法中可以调用静态方法
	}

	public static void run2(){
		System.out.println("run2");
	}
	
	
}
