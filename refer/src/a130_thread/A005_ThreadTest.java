package a130_thread;

public class A005_ThreadTest extends Thread{
	public static void main(String[] args) {
		Thread t = new A005_ThreadTest();
		t.run();
		System.out.print("world");
	}
	
	public void run(){
		say();
	}
	
	static void say(){
		System.out.print("hello");
	}
}
