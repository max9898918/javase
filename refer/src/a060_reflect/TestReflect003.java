package a060_reflect;
import java.io.IOException;
import java.io.Serializable;
import java.nio.CharBuffer;
public class TestReflect003 implements Serializable,InterfaceTest {
	private static final long serialVersionUID = -2862585049955236662L;
	
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("a060_reflect.TestReflect003");
		
		Class<?> parentClass = clazz.getSuperclass();// 取得父类
		System.out.println("clazz的父类为：" + parentClass.getName());
		
		
		// 获取所有的接口
		Class<?> intes[] = clazz.getInterfaces();
		System.out.println("clazz实现的接口有：");
		for (int i = 0; i < intes.length; i++) {
			System.out.println((i + 1) + "：" + intes[i].getName());
		}
	}
}
