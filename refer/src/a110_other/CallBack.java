package a110_other;
//��ã���д�˸��ܼ򵥵Ĵ��룬��һ����������
public class CallBack {
	int value = 1001;

	public CallBack() {// A�Ĺ��캯����ִ��B��exec()�����������ִ��ж�A��getValue()�������ã�����ͽ����ص�
		B b = new B(this);
		b.exec();
	}

	public int getValue() {
		return value;
	}

	public static void main(String[] args) {
		new CallBack();//���캯�����Ѿ������˻ص������Բ���Ҫ����Ĵ���
	}
}

class B {
	private CallBack a;

	public B(CallBack a) {
		System.out.println("����B���вκ���");
		this.a = a;
	}

	public void exec() {
		System.out.println(a.getValue());// ���������a��getValue()����
	}
}

