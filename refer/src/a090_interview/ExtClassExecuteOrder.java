package a090_interview;
/**
 * 1���Ȼ�ִ�и������ش���
 * 2����̬�����ִ�е�����˳����ߡ���new����Ĵ����޹ء�ֻ��ִ��һ��
 * 3�����������ִ��˳����ڹ��캯����new���ٸ�����ͻ�ִ�ж��ٴ�
 * 4����ִ���길��Ĺ������顢����ִ�й��������Ż�ִ����������Ĵ���
 * 5��������Ծ�̬����顢�������顢��������ִ��˳��
 * @author max98
 *
 */
public class ExtClassExecuteOrder extends B{
	public static void main(String[] args) {
		new ExtClassExecuteOrder();
		new ExtClassExecuteOrder();
	}
	
	public ExtClassExecuteOrder(){
		System.out.println("Son");
	}
	static{
		System.out.println("static Son");
	}
	
	{
		System.out.println("�������� Son");
	}
}

class B extends A{

	public B(){
		System.out.println("B");
	}
	static{
		System.out.println("static B");
	}
	{
		System.out.println("��������B");
	}
}

class A {

	public A(){
		System.out.println("A");
	}
	static{
		System.out.println("static A");
	}
	{
		System.out.println("�������� A");
	}
}