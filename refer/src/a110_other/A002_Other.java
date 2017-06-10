package a110_other;

public class A002_Other {
	public static void main(String[] args) {
		A002_Other test = new A002_Other();
		test.operator();
	}
	/**
	 * 位运算符参考代码
	 *
	 * 移位操作的简单计算方法
	 * >>右移操作
	 * x>>y
	 * 就是x除以2的y此方,取整;
	 *
	 * <<左移操作
	 * X<<y
	 * 就是x乘以2的y次方
	 */
	public void operator(){
		System.out.println(5<<6); 	//等于5乘以2的6次方
		System.out.println(1000>>5);//等于1000除以（2的5次方）取整

		System.out.println(0x31 & 0x0f);
		/* 请看java基础或者百度
		 * If(x==33 & ++y>0) y会增长，If(x==33 && ++y>0)不会增长
		 *	&还可以用作位运算符，当&操作符两边的表达式不是boolean类型时，&表示按位与操作，
		 *  我们通常使用0x0f来与一个整数进行&运算，来获取该整数的最低4个bit位，例如，0x31 & 0x0f的结果为0x01。
		 */
	}
}
