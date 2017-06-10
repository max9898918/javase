package a060_reflect;
/**
 * 主要学习java反射、这是一个很简单的例子
 * 创建时间：2017-01-17
 * 资料网址：   http://www.cnblogs.com/lzq198754/p/5780331.html
 * @author Administrator
 *
 */
public class TestReflect001 {
	public static void main(String[] args) throws Exception {
		TestReflect001 testReflect = new TestReflect001();
       
		System.out.println(testReflect.getClass().getName());
        // 结果 a060_reflect.TestReflect001
    }
}
