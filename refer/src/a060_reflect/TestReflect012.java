package a060_reflect;
import java.lang.reflect.Array;
/**
 * ͨ����������޸�����Ĵ�С
 * @author Administrator
 *
 */
public class TestReflect012 {
	public static void main(String[] args) throws Exception {
		int[] temp = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int[] newTemp = (int[]) arrayInc(temp, 15);
		print(newTemp);
		String[] atr = { "a", "b", "c" };
		String[] str1 = (String[]) arrayInc(atr, 8);
		print(str1);
	}
	/**
	 * �޸������С
	 * @param obj ����
	 * @param len ����
	 * @return ������
	 */
	public static Object arrayInc(Object obj, int len) {
		Class<?> arr = obj.getClass().getComponentType();
		Object newArr = Array.newInstance(arr, len);
		int co = Array.getLength(obj);
		System.arraycopy(obj, 0, newArr, 0, co);
		return newArr;
	}
	/**
	 * ��ӡ������
	 * @param obj ����
	 */
	public static void print(Object obj) {
		Class<?> c = obj.getClass();
		if (!c.isArray()) {
			return;
		}
		System.out.println("���鳤��Ϊ�� " + Array.getLength(obj));
		for (int i = 0; i < Array.getLength(obj); i++) {
			System.out.print(Array.get(obj, i) + " ");
		}
		System.out.println();
	}
}