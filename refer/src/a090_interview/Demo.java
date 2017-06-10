package a090_interview;
import java.util.Scanner;
public class Demo {
	/*
	 * 本方法实现输入的整数倒着输出
	 * */
	
	public void test01(){
		int n=0,number;
		Scanner input = new Scanner(System.in);
		System.out.println("请输入位数高于两位任意整数");
		number = input.nextInt();                              
		while(number != 0){
			n = n * 10 + number%10;
			number = number/10;
		}
		System.out.println(n);
	}
	
	
	
	public void test02(){
		/*爱因斯坦曾出过这样一道有趣的数学题：有一个长阶梯，
		 * 每步上2阶，最后剩1阶；若每步上3阶，最后剩2阶；若每步上5阶，
		 * 最后剩4阶；若每步上6阶，最后剩5阶；只有每步上7阶，最后一阶也不剩。
		 * 请问该阶梯至少有多少阶。编写一个Java程序解决该问题。
		 * */
		int number = 7,x=0;
		for(int j = 0 ;j < 50 ;j++){
			x = number * j;
			if((x%2 == 1) && (x%3 == 2) && (x%5 == 4) && (x%6 ==5) ){
				break;
			}
		}
			System.out.println("結果是："+x);
	}

	
	public void test1(){
		/*一维数组排序：
		 * n个数组来排序，外层循环n-1 内层循环n-1-i（i是外层循环里的变量） 
		 * 用内层循环里面的变量来取数组里面的值做换位操作
		 * */
		int[] array = {6,8,2,1,5};
		for(int i=0;i<array.length-1;i++){
			for(int j=0;j<array.length-1-i;j++){
				if(array[j]>array[j+1]){
					int v = array[j];
					array[j]=array[j+1];
					array[j+1] = v;
				}
			}
		}
		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+"  ");
		}
	}
	
	public void isString(){
		/*把一个字符串存入到一维数组中，并判断是字符还是字节*/
		String str = "买买买1买买买";
		
		
	
	}
	
}
