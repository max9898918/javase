package a010_keyword;

import org.junit.Test;
/**
 * ����֤����
 *   1����̬���������ִ�С�����new���ٴζ���ֻ��ִ��һ�Ρ�
 *   2��������������ھ�̬�����ִ�С������ڹ��캯��ִ�С�new���ٴζ����ִ�ж��ٴΡ�
 *   3���ھ�̬�����в��ܵ��÷Ǿ�̬�����������ڷǾ�̬�����п��Ե��þ�̬������
 * @author Administrator
 * ����ʱ�䣺2017-04-01
 */
public class A001_Statis03 {
	
	
	
	public static void main(String[] args) {
		new A001_Statis03();
		new A001_Statis03();
		new A001_Statis03();
	}
	
	public A001_Statis03(){
		super();
		System.out.println("���캯����");
	}
	
	
	{
		System.out.println("�������飡");
	}
	
	static {
		System.out.println("��̬����飡");
	}
	
	@Test
	public void run1(){
		run2();//�ڷǾ�̬�����п��Ե��þ�̬����
	}

	public static void run2(){
		System.out.println("run2");
	}
	
	
}
