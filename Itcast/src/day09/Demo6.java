package day09;


/*
һ�������ֻ����һ��ֱ�ӵĸ��ࡣ�����ж����ӵĸ��ࡣ

java�ǵ��̳С�

*/

class Ye{

	String name;
	Ye(){
		System.out.println("үү");
	}

}

class Fu extends Ye{
	Fu(){
		System.out.println("����");
	}
}

//
class  Zi extends Fu{
	Zi(){
		System.out.println("����");
	}
}

class Demo6 
{
	public static void main(String[] args) 
	{
		System.out.println("ע�⿴�̳е�ִ��˳��!");
		Zi zi =new Zi();
	}
}
