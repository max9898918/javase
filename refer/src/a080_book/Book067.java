package a080_book;
/*
 * 1����Ҫ˵��int ��û�ж�̬���Եĵ�
 * �����췽����ִ�����౻���Ƿ�������Ĵ���ġ�
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
//�����࣡
public class Book067 {
	public static void main(String[] args) {
		Base b = new Derived();
		b.f();
		b.g();
		System.out.println(b.i);
	}
}
