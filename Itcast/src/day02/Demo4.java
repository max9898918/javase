package day02;
/*
软件 = 数据+ 指令+ 文档

常量: 常量就是程序在运行过程中其值不能发生改变的量。

常量的类别：
		整数常量   10 12
		小数常量	3.14
		布尔常量   布尔常量只有两个值： true(正确). false(错误)
		字符常量   字符常量就是单个字符使用单引号引起来的内容我们称作为字符常量。
		字符串产量  字符串常量就是使用双引号引起来的内容称作为字字符串常量。


整数常量的表现形式：整数的表现形式主要是以不同的进制(二进制、八进制、十六进制)表现出来。

进制： 十进制（0~9） 、 星期（七进制 0~6）、 小时(12进制(0-11)、 24进制(0~23))

进制：用有限的数字符号代表所有的数值。

计算机的出现是为了服务于人类的，那么人类在现实生活中使用的数据基本上都是
十进制的数据，那么计算机是否有可以存储现实生活中的数据呢？如果可以存储
又以哪种形式存储呢？

二进制由来。


电脑记录我们现实生活中的数据都是使用二进制进行记录的，那么我们
就要懂得如何把十进制数据转换成二进制。

		
		十进制与二进制之间的转换：
			
			十进制转二进制的方法：使用十进制的数据不断除以2，直到商为0为止。从下往上取余数就是
			对应的二进制。

			10(十进制)-------->1010(二进制）

			二进制转十进制:使用二进制的每一位乘以2的n次方，n从0开始，每次递增1，然后把各部分的数据
			相加即可。
			
			 1110(二进制) ---------> 14(十进制)
		
		二进制的弊端： 二进制的书写太长了，不方便人类记忆。

		二进制的数据特点： 由0~1组成。

		解决方案：每三个二进制位就就记录一个数字。

		1000（十进制）------> 001,111,101,000（二进制） = 1,7,5,0
	
	一个八进制的数据就是相当于三个二进制位。

		
	十进制与八进制之间的转换：

			十进制转八进制:使用十进制的数据不断除以8，直到商为0为止。从下往上取余数就是
			对应的八进制。
				
				45(十进制)------>  55 （八进制）

			八进制转十进制：使用八进制的每一位乘以8的n次方，n从0开始，每次递增1，然后把各部分的数据
			相加即可。
						
				23(八进制)------>    (十进制)
	
	八进制数据的特点： 只有0~7这八个字符组成的。
	
	十六进制的数据: 0~9 , a（10）\b (11),c(12),d(13), e(14),f(15)， 四个二进制位就是一个十六进制的数据.

	十六进制的数据是有0~9、a-f这几个字符组成的。

	
		十进制转换成十六进制:使用十进制的数据不断除以16，直到商为0为止。从下往上取余数就是
			对应的十六进制。

			38(十进制)---->26  （十六进制）

		十六进制转十进制：使用十六进制的每一位乘以16的n次方，n从0开始，每次递增1，然后把各部分的数据
		相加即可。

			34(十六进制)-----> 52（十进制）

*/
class Demo4{

	public static void main(String[] args){
		/*
		System.out.println(12); //整数常量
		System.out.println(3.14); //小数常量
		System.out.println(false); //布尔常量
		System.out.println('1'); //字符常量
		System.out.println("hello world"); //字符串常量

		如果一个数据没有加上任何的标识之前，默认就是十进制的数据。
		*/
		System.out.println(10);// 十进制
		System.out.println(0b10); //二进制 , 如果一个数据要表示二进制，那么要在该数据的前面加上0b开头。
		System.out.println(010); //八进制数据， 八进制的数据需要以0开头
		System.out.println(0x10); //十六进制数据， 十六进制的数据需要以0x开头
	}
}
