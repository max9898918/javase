package a110_other;
/**
 * 在java中没有小数点的默认是int类型、有小数点默认是double类型
 * @author Administrator
 *
 */
public class A001_TypeSwitch {

	public static void main(String[] args) {
		//float f = 2.3; //精度不准确,应该用强制类型转换，如下所示：float f=(float)3.4 或float f = 3.4f。
		float f1=(float)3.4;
		float f2 = 3.4f;
		System.out.println("f1="+f1+"  f2="+f2);
		
		short s1 = 1; 
		//s1 = s1+1;  //主要是要证明这句话需要强制类型转换

		s1 =(short) (s1+1);
		s1+=1;//或者使用这种方法
		System.out.println(s1);
	}
}
