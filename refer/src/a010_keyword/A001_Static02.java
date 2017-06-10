package a010_keyword;

/**
 * 静态变量和实例变量的区别
 * 在程序运行时的区别：实例变量属于某个对象的属性，必须创建了实例对象，
 * 其中的实例变量才会被分配空间，才能使用这个实例变量。静态变量不属于某
 * 个实例对象，而是属于类，所以也称为类变量，只要程序加载了类的字节码，
 * 不用创建任何实例对象，静态变量就会被分配空间，静态变量就可以被使用了。
 * 总之，实例变量必须创建对象后才可以通过这个对象来使用，静态变量则可以
 * 直接使用类名来引用。例如，对于下面的程序，无论创建多少个实例对象，
 * 永远都只分配了一个staticInt变量，并且每创建一个实例对象，这个staticInt就会加1；
 * 但是，每创建一个实例对象，就会分配一个Int,即可能分配多个Int，并且每个Int的值都只自加了1次。
 * 创建时间：2017-01-09
 * @author Administrator
 *
 */

public class A001_Static02 {
	private static int staticInt = 0;
	private int Int = 0;
	/**
	 * 静态变量可以直接使用类名来引用。例如，对于下面的程序，无论创建多少个实例对象，
	 * 永远都只分配了一个staticInt变量，并且每创建一个实例对象，这个staticInt就会加1；
	 * 但是，每创建一个实例对象，就会分配一个Int,即可能分配多个Int，并且每个Int的值都只自加了1次。
	 */
	public A001_Static02() {
		staticInt++;
		Int++;
		System.out.println("staticInt = "+staticInt+"  Int = "+Int);
	}

	public static void main(String[] args) {
		A001_Static02 test = new A001_Static02();
		//每次staticInt会加一，但是Int是自身加一（因为static修饰的staticInt永远只分配了一个staticInt变量）
		A001_Static02 test2 = new A001_Static02();
		A001_Static02 test3 = new A001_Static02();
	}
}
