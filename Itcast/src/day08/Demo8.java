package day08;

/*
疑问： 为什么要调用父类的构造方法啊？这样子做的意义在那？

	调用父类 的构造方法是可以初始化从父类继承下去的属性的。

*/ 
class Fu8{
	
	int x = 10;

	String name;

	public Fu8(String name){
		this.name = name;
		System.out.println("Fu8类d带参的构造方法...");
	}

	public Fu8(){
		System.out.println("Fu8类无参的构造方法...");
	}
}


class Zi8 extends Fu8{

	int x = 20;

	public Zi8(String name){
		super(name); //指定调用父类一个参数的构造函数。
	}


	public void print(){
		System.out.println("x1 = "+ x);
	}

}


class Demo8 
{
	public static void main(String[] args) 
	{
		Zi8 z = new Zi8("大头儿子"); 
		System.out.println("name= "+z.name);

	}
}
