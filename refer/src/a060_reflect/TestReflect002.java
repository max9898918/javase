package a060_reflect;
/**
 * ʵ����Class���������ַ�ʽ
 * @author Administrator
 *
 */
public class TestReflect002 {
	public static void main(String[] args) throws Exception {
		Class<?> class1 = null;
		Class<?> class2 = null;
		Class<?> class3 = null;
		// һ�����������ʽ
		class1 = Class.forName("a060_reflect.TestReflect002");
		class2 = new TestReflect002().getClass();
		class3 = TestReflect002.class;
		
		System.out.println("������   " + class1.getName());
		System.out.println("������   " + class2.getName());
		System.out.println("������   " + class3.getName());
	}

}
