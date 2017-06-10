package day09;
/*
���� ����һ��ͼ�Ρ�Բ�Ρ� ���������ࡣ��������ͼ�ζ���߱��������
���ܳ�����Ϊ������ÿ��ͼ�μ���ķ�ʽ��һ�¶��ѡ�

�����������淶��ȫ����ĸ��д�������뵥�� ֮�� ʹ���»��߷ָ���


abstract���������¹ؼ��ֹ�ͬ����һ��������
	1. abstract������private��ͬ����һ��������
	2. abstract ������static��ͬ����һ��������
	3. abstract ������final��ͬ����һ��������

*/
//abstract ����

//ͼ����
abstract class MyShape4{ 

	String name;

	public MyShape4(String name){
		this.name = name;
	}

	public  abstract void getArea();
	
	public abstract void getLength();
}

//Բ�� ������ͼ�����һ��
class Circle4 extends MyShape4{
	
	double r;

	public static final double PI = 3.14;

	public Circle4(String name,double r){
		super(name);
		this.r =r;
	}

	public  void getArea(){
		System.out.println(name+"������ǣ�"+PI*r*r);
	}
	
	public  void getLength(){
		System.out.println(name+"���ܳ��ǣ�"+2*PI*r);
	}
}

/*class Circle4_1 extends MyShape4(){
	
	double r;
	
	public static final double PI=3.14;
	
	public Circle4_1(String name,double r){
	super(name);
	this.r=r;
	}
	public void getArea(){
	System.out.println(name+"������ǣ�"+PI*r*r);
	}
	public void getLength(){
	System.out.println(name+"���ܳ��ǣ�"+2*PI*r);
	}
}*/

//���� ����ͼ���е� һ��
class Rect4 extends MyShape4{

	int width;

	int height;

	public Rect4(String name,int width, int height){
		super(name);
		this.width = width;
		this.height = height;
	}

	public  void getArea(){
		System.out.println(name+"������ǣ�"+width*height);
	}
	
	public  void getLength(){
		System.out.println(name+"���ܳ��ǣ�"+2*(width+height));
	}
}

class Demo4 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
	
		Circle4 c = new Circle4("Բ��",4.0);
		c.getArea();
		c.getLength();

		//����
		Rect4 r = new Rect4("����",3,4);
		r.getArea();
		r.getLength();
	
	}
}
