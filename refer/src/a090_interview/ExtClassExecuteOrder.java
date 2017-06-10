package a090_interview;
/**
 * 1、先会执行父类的相关代码
 * 2、静态代码块执行的优先顺序最高、与new对象的次数无关、只会执行一次
 * 3、构造代码块的执行顺序高于构造函数、new多少个对象就会执行多少次
 * 4、先执行完父类的构造代码块、接着执行构造器。才会执行子类里面的代码
 * 5、本类测试静态代码块、构造代码块、构造器的执行顺序
 * @author max98
 *
 */
public class ExtClassExecuteOrder extends B{
	public static void main(String[] args) {
		new ExtClassExecuteOrder();
		new ExtClassExecuteOrder();
	}
	
	public ExtClassExecuteOrder(){
		System.out.println("Son");
	}
	static{
		System.out.println("static Son");
	}
	
	{
		System.out.println("构造代码块 Son");
	}
}

class B extends A{

	public B(){
		System.out.println("B");
	}
	static{
		System.out.println("static B");
	}
	{
		System.out.println("构造代码块B");
	}
}

class A {

	public A(){
		System.out.println("A");
	}
	static{
		System.out.println("static A");
	}
	{
		System.out.println("构造代码块 A");
	}
}