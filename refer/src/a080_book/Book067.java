package a080_book;
/*
 * 1、主要说明int 是没有多态特性的的
 * 而构造方法是执行子类被覆盖方法里面的代码的。
 * */
class Base{
	public int i =1;
	public Base(){
		g();
	}
	public void f(){
		System.out.println("Base f()");
	}
	public void g(){
		System.out.println("Base g()");
	}
}
class Derived extends Base{
	public int i =2;
	public void f(){
		System.out.println("Derived f()");
		
	}
	public void g(){
		System.out.println("Derived g()");
	}
}
//测试类！
public class Book067 {
	public static void main(String[] args) {
		Base b = new Derived();
		b.f();
		b.g();
		System.out.println(b.i);
	}
}
