package a060_reflect;
import java.lang.reflect.Field;
/**
 * ͨ��������Ʋ���ĳ���������
 * @author Administrator
 *
 */
public class TestReflect008 {
	private String sx = null;//���Ե�ƴ���ĵ�һ����ĸ
	public static void main(String[] args) throws Exception {
		Class<?> clazz = Class.forName("a060_reflect.TestReflect008");
		Object obj = clazz.newInstance();
		// ����ֱ�Ӷ� private �����Ը�ֵ
		Field field = clazz.getDeclaredField("sx");
		field.setAccessible(true);
		field.set(obj, "Java�������");
		System.out.println(field.get(obj));
	}
}