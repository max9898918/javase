package day10;
/*

匿名内部类：没有类名的类就称作为匿名内部类。

匿名内部类的好处：简化书写。

匿名内部类的使用前提：必须存在继承或者实现关系才能使用。


匿名内部类一般是用于实参。


*/

abstract class Animal6{
	
	public abstract Animal6 run();

	public abstract void sleep();
}


class Outer6{

	public void print(){
		//需求： 在方法内部定义一个类继承Animal6类，然后调用run方法与sleep()。
		
		/*
		//局部内部类
		class Dog extends Animal6{
			
			public void run(){
				System.out.println("狗在跑..");
			}

			public void sleep(){
				System.out.println("狗趴在睁开眼睛睡..");
			}
		}
		
		//创建对象
		Dog d = new Dog();
		d.run();	
		d.sleep();
		*/	
		//匿名内部类 ：匿名内部类只是没有类名，其他的一概成员都是具备的。
		// 匿名内部类与Animal是继承 的关系。  目前是创建Animal子类的对象. 
	Animal6	a = new Animal6(){  //多态
		
			//匿名内部的成员 
			public Animal6 run(){
				System.out.println("狗在跑..");
				return this;
			}
			
			public void sleep(){
				System.out.println("狗趴在睁开眼睛睡..");
			}

			//特有的方法
			public void bite(){
				System.out.println("狗在咬人..");
			}
	
		};
	
//		((Object) a).bite();
		a.run();
		a.sleep();
		
	}
}



class Demo6 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		
		Outer6 Outer6 = new Outer6();
		Outer6.print();
	
	}
}
