package a060_reflect;
import java.io.IOException;
import java.io.Serializable;
import java.nio.CharBuffer;
public class TestReflect003 implements Serializable,InterfaceTest {
	private static final long serialVersionUID = -2862585049955236662L;
	
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("a060_reflect.TestReflect003");
		
		Class<?> parentClass = clazz.getSuperclass();// ȡ�ø���
		System.out.println("clazz�ĸ���Ϊ��" + parentClass.getName());
		
		
		// ��ȡ���еĽӿ�
		Class<?> intes[] = clazz.getInterfaces();
		System.out.println("clazzʵ�ֵĽӿ��У�");
		for (int i = 0; i < intes.length; i++) {
			System.out.println((i + 1) + "��" + intes[i].getName());
		}
	}
}
