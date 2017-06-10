package a060_reflect;
/**
 * 实例化Class类对象的三种方式
 * @author Administrator
 *
 */
public class TestReflect002 {
	public static void main(String[] args) throws Exception {
		Class<?> class1 = null;
		Class<?> class2 = null;
		Class<?> class3 = null;
		// 一般采用这种形式
		class1 = Class.forName("a060_reflect.TestReflect002");
		class2 = new TestReflect002().getClass();
		class3 = TestReflect002.class;
		
		System.out.println("类名称   " + class1.getName());
		System.out.println("类名称   " + class2.getName());
		System.out.println("类名称   " + class3.getName());
	}

}
