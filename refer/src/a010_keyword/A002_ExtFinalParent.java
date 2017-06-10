package a010_keyword;

import org.junit.Test;

/**
 * 本类证明：
 * 	1、（接口可以继承接口）、抽象类可以继承实体类、抽象类不能被final修饰。
 *  2、final修饰的实体类不能被继承、final和private修饰的的方法不能被重写。重写的方法的修饰符必须和父类一致或者大于父类的访问权限
 *  3、有继承关系的类最先执行的是最上层父类的构造方法、然后依次执行子类的构造方法。在有静态代码块的时候最先执行的是静态代码块、有构造代码块的时候执行完父类的构造方法执行构造代码块再执行本类的构造方法
 *  4、抽象方法必须重写、抽象类的普通方法和实体类方法的特性一样。
 *  5、重载的方法有不同的参数个数或者不同的参数类型、与返回值类型无关。
 * @author Administrator
 * 创建时间：2017-04-01
 */
public class A002_ExtFinalParent extends A002_FinalParent {
	public static void main(String[] args) {
		A002_ExtFinalParent extFinalClass = new A002_ExtFinalParent();
		extFinalClass.finalMethod();
		extFinalClass.method("子类参数！");
		extFinalClass.method2("子类参数！");
		extFinalClass.method();
		System.out.println("".equals(""));
	}

	A002_ExtFinalParent(){
		System.out.println("A002_ExtFinalParent \n");
	}
	
	/* //final修饰的方法不能被重写
	public final void finalMethod(){

	}*/
	
	/**
	 * 使用final关键字修饰一个变量时，是指引用变量不能变，引用变量所指向的对象中的内容还是可以改变的。
	 */
	public void method(){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("123");
		stringBuffer.append("456");
		System.out.println(stringBuffer);
		
	}
	
	@Override
	public void method(String str){
		System.out.println("方法被重写后父类的方法如同被屏蔽了！参数为："+str);
	}
	
	@Override
	public void method2(String str){
		System.out.println("方法被重写后父类的方法如同被屏蔽了！参数为："+str);
	}

	public void method(String str,int i){
		System.out.println("重载的方法有不同的参数个数或者不同的参数类型、与返回值类型无关！");
	}
	
	public String method(String str,String str2){
		System.out.println("重载的方法有不同的参数个数或者不同的参数类型、与返回值类型无关！");
		return "重载的方法有不同的参数个数或者不同的参数类型、与返回值类型无关！";
	}
	
	/*static{
		System.out.println("静态代码块！");
	}
	{
		System.out.println("构造代码块！");
	}*/
}
