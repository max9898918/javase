package a110_other;
//你好，我写了个很简单的代码，你一看就明白了
public class CallBack {
	int value = 1001;

	public CallBack() {// A的构造函数，执行B的exec()方法，里面又带有对A的getValue()方法调用，这个就叫做回调
		B b = new B(this);
		b.exec();
	}

	public int getValue() {
		return value;
	}

	public static void main(String[] args) {
		new CallBack();//构造函数里已经发生了回调，所以不需要更多的代码
	}
}

class B {
	private CallBack a;

	public B(CallBack a) {
		System.out.println("调用B的有参函数");
		this.a = a;
	}

	public void exec() {
		System.out.println(a.getValue());// 这里调用了a的getValue()方法
	}
}

