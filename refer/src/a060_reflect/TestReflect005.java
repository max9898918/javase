package a060_reflect;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class TestReflect005 extends Father implements Serializable{
	private static final long serialVersionUID = -2862585049955236662L;
	protected int age = 19;
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("a060_reflect.TestReflect005");
		System.out.println("===============本类属性===============");
		// 取得本类的全部属性
		Field[] field = clazz.getDeclaredFields();
		for (int i = 0; i < field.length; i++) {
			int mo = field[i].getModifiers();// 权限修饰符
			String priv = Modifier.toString(mo);
			Class<?> type = field[i].getType();// 属性类型
			System.out.println(priv + " " + type.getName() + " " +
					field[i].getName() + ";");
		}

		System.out.println("==========实现的接口或者父类的公共属性==========");
		// 取得实现的接口或者父类的属性
		Field[] filed1 = clazz.getFields();
		for (int j = 0; j < filed1.length; j++) {
			// 权限修饰符
			int mo = filed1[j].getModifiers();
			String priv = Modifier.toString(mo);
			// 属性类型
			Class<?> type = filed1[j].getType();
			System.out.println(priv + " " + type.getName() + " " + filed1[j].getName() + ";");
		}

	}
}
