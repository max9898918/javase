package day09;


/*
一个类最多只能有一个直接的父类。但是有多个间接的父类。

java是单继承。

*/

class Ye{

	String name;
	Ye(){
		System.out.println("爷爷");
	}

}

class Fu extends Ye{
	Fu(){
		System.out.println("父亲");
	}
}

//
class  Zi extends Fu{
	Zi(){
		System.out.println("孩子");
	}
}

class Demo6 
{
	public static void main(String[] args) 
	{
		System.out.println("注意看继承的执行顺序!");
		Zi zi =new Zi();
	}
}
