package a060_reflect;
import java.lang.reflect.Field;
/**
 * 通过反射机制操作某个类的属性
 * @author Administrator
 *
 */
public class TestReflect008 {
	private String sx = null;//属性的拼音的第一个字母
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("a060_reflect.TestReflect008");
		Object obj = clazz.newInstance();
		// 可以直接对 private 的属性赋值
		Field field = clazz.getDeclaredField("sx");
		field.setAccessible(true);
		field.set(obj, "Java反射机制");
		System.out.println(field.get(obj));
	}
}