package a080_book;

public class Book096 {
	public static void main(String[] args) {
		/*byte a = 5;
		int b =10;
		 由于加号的优先级高于位运算符；
		 * 所以相当于int c = a >> (2 + b) >> 2;所以为零
		
		int c = a >> 2 + b >> 2;
		System.out.println(c);*/
		
		//下面的代码段在95页
		short s = 128;
		byte by  = (byte) s;
		
		System.out.println(by);
	}
}
