package a010_keyword;
/**
 *   这段代码里面A01_Static类有一个static的int变量I，有两个构造函数，第一个用于初始化I为4，第二个用于初始化i为传进函数的值，
 * 在main中所传的值是5，程序首先声明对象的引用t，然后调用带参数的构造函数实例化对象，此时对象t的成员变量I的值为5，接着声明对象tt，
 * 调用无参数的构造函数，那么就把对象tt的成员变量i的值初始化为4了，注意了，在这里i是static，那就是说该类的所有对象都共享该内存，
 * 那也就是说在实例化对象tt的时候改变了i的值，那么实际上对象t的i值也变了，因为实际上他们引用的是同一个成员变量。最后打印的结果是三个4。
 * 但是把static关键字去掉结果是5、4、5（可以把static关键字去掉分析结果是怎么出来的）
 * 总结：用static修饰的成员变量的值等于最后赋的值
 * 创建时间：2017-01-09
 * @author Administrator
 *
 */
public class A001_Static {
	int i;
	
	public A001_Static(){
		i=4;
	}

	public A001_Static(int j){
		i=j;
	}
	
	public static void main(String[] args) {
		A001_Static t = new A001_Static(5); //声明对象引用，并实例化 
		A001_Static tt = new A001_Static(); //用static修饰的成员变量的值等于最后赋的值（在这里就是无参构造函数赋的值）
		//A01_Static ttt = new A01_Static(10); //像这样用static修饰的成员变量的值等于最后赋的值
		System.out.println(t.i); 
		System.out.println(tt.i); 
		System.out.println(t.i); 
	}
}
