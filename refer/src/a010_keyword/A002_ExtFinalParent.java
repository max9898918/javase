package a010_keyword;

import org.junit.Test;

/**
 * ����֤����
 * 	1�����ӿڿ��Լ̳нӿڣ�����������Լ̳�ʵ���ࡢ�����಻�ܱ�final���Ρ�
 *  2��final���ε�ʵ���಻�ܱ��̳С�final��private���εĵķ������ܱ���д����д�ķ��������η�����͸���һ�»��ߴ��ڸ���ķ���Ȩ��
 *  3���м̳й�ϵ��������ִ�е������ϲ㸸��Ĺ��췽����Ȼ������ִ������Ĺ��췽�������о�̬������ʱ������ִ�е��Ǿ�̬����顢�й��������ʱ��ִ���길��Ĺ��췽��ִ�й���������ִ�б���Ĺ��췽��
 *  4�����󷽷�������д�����������ͨ������ʵ���෽��������һ����
 *  5�����صķ����в�ͬ�Ĳ����������߲�ͬ�Ĳ������͡��뷵��ֵ�����޹ء�
 * @author Administrator
 * ����ʱ�䣺2017-04-01
 */
public class A002_ExtFinalParent extends A002_FinalParent {
	public static void main(String[] args) {
		A002_ExtFinalParent extFinalClass = new A002_ExtFinalParent();
		extFinalClass.finalMethod();
		extFinalClass.method("���������");
		extFinalClass.method2("���������");
		extFinalClass.method();
		System.out.println("".equals(""));
	}

	A002_ExtFinalParent(){
		System.out.println("A002_ExtFinalParent \n");
	}
	
	/* //final���εķ������ܱ���д
	public final void finalMethod(){

	}*/
	
	/**
	 * ʹ��final�ؼ�������һ������ʱ����ָ���ñ������ܱ䣬���ñ�����ָ��Ķ����е����ݻ��ǿ��Ըı�ġ�
	 */
	public void method(){
		StringBuffer stringBuffer = new StringBuffer();
		stringBuffer.append("123");
		stringBuffer.append("456");
		System.out.println(stringBuffer);
		
	}
	
	@Override
	public void method(String str){
		System.out.println("��������д����ķ�����ͬ�������ˣ�����Ϊ��"+str);
	}
	
	@Override
	public void method2(String str){
		System.out.println("��������д����ķ�����ͬ�������ˣ�����Ϊ��"+str);
	}

	public void method(String str,int i){
		System.out.println("���صķ����в�ͬ�Ĳ����������߲�ͬ�Ĳ������͡��뷵��ֵ�����޹أ�");
	}
	
	public String method(String str,String str2){
		System.out.println("���صķ����в�ͬ�Ĳ����������߲�ͬ�Ĳ������͡��뷵��ֵ�����޹أ�");
		return "���صķ����в�ͬ�Ĳ����������߲�ͬ�Ĳ������͡��뷵��ֵ�����޹أ�";
	}
	
	/*static{
		System.out.println("��̬����飡");
	}
	{
		System.out.println("�������飡");
	}*/
}
