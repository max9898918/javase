package com.m17_6;

public class SwitchTest {



	/**

	 * @paramargs add by zxx ,Dec 9, 2008

	 */

	public static void main(String[] args) {
		
		
		//System.out. println (new Tests().test());
		System.out.println(new SwitchTest().test2());
	}


	/**
	 * 也许你的答案是在return之前，但往更细地说，我的答案是在return中间执行，请看下面程序代码的运行结果
	 * 运行结果是1，为什么呢？主函数调用子函数并得到结果的过程，好比主函数准备一个空罐子，当子函数要返回结果时，先把结果放在罐子里，然后再将程序逻辑返回到主函数。所谓返回，就是子函数说，我不运行了，你主函数继续运行吧，这没什么结果可言，结果是在说这话之前放进罐子里的。
	 * @return
	 */
	static int test(){

		int x = 1;

		try{
			System.out.println("try");
			return x;
		}

		finally{
			System.out.println("---"+x);
			++x;
		}

	}

	@SuppressWarnings("finally")
	int test2(){

		try{
			System.out.println("func1");
			return 1;
		}finally{
			System.out.println("func2");
			return 2;
		}
	}

}



