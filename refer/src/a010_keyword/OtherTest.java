package a010_keyword;

import org.junit.Test;

public class OtherTest {

	@Test
	public void run3(){
		System.out.println(testSwitch3(2));
	}
	/**
	 * switch只要条件成立了、没有加break的情况下、后面的代码多会执行
	 * @param i
	 */
	public int testSwitch3(int i){
		int ret = 0;
		switch(i){
		case 1:
			ret = ret +1;
		case 2: 
			ret = ret + i * 2;
		case 3: 
			ret = ret + i * 3;
		default :
			ret = ret + i *10;
		}
		return ret;
	}

	@Test
	public void run2(){
		testSwitch(2);
	}
	/**
	 * switch只要条件成立了、没有加break的情况下、后面的代码多会执行
	 * @param i
	 */
	public void testSwitch(int i){
		int ret = 0;
		switch(i){
		case 2: 
			System.out.println("2  "+i);
		case 6: 
			System.out.println("6  "+i);
			break;
		case 1:
			System.out.println(i);
			break;
		case 3: 
			System.out.println("3  "+i);
			break;
		case 4:
			System.out.println("4  "+i);
			break;
		case 5: 
			System.out.println("5  "+i);
			break;
		case 0:
			System.out.println(123);
			break;
		}
	}

	@Test
	public void run1(){
		String str1 = "abc";
		String str2 = new String("abc");
		System.out.println(str1 == str2);
	}
}
