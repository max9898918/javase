package a060_reflect;

import java.lang.reflect.Method;
import java.util.ArrayList;
/**
 * ������Ƶ�Ӧ��ʵ��
 *	�ڷ���ΪInteger��ArrayList�д��һ��String���͵Ķ���
 * @author Administrator
 *
 */
public class TestReflect010 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<Integer>();
        Method method = list.getClass().getMethod("add", Object.class);
        method.invoke(list, "Java�������ʵ����");
        System.out.println(list.get(0));
    }
}