package a060_reflect;

import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;

public class TestReflect005 extends Father implements Serializable{
	private static final long serialVersionUID = -2862585049955236662L;
	protected int age = 19;
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("a060_reflect.TestReflect005");
		System.out.println("===============��������===============");
		// ȡ�ñ����ȫ������
		Field[] field = clazz.getDeclaredFields();
		for (int i = 0; i < field.length; i++) {
			int mo = field[i].getModifiers();// Ȩ�����η�
			String priv = Modifier.toString(mo);
			Class<?> type = field[i].getType();// ��������
			System.out.println(priv + " " + type.getName() + " " +
					field[i].getName() + ";");
		}

		System.out.println("==========ʵ�ֵĽӿڻ��߸���Ĺ�������==========");
		// ȡ��ʵ�ֵĽӿڻ��߸��������
		Field[] filed1 = clazz.getFields();
		for (int j = 0; j < filed1.length; j++) {
			// Ȩ�����η�
			int mo = filed1[j].getModifiers();
			String priv = Modifier.toString(mo);
			// ��������
			Class<?> type = filed1[j].getType();
			System.out.println(priv + " " + type.getName() + " " + filed1[j].getName() + ";");
		}

	}
}
