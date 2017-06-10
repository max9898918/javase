package a090_interview;

public class Interview07 {
	/*爱因斯坦曾出过这样一道有趣的数学题：有一个长阶梯，
	 * 每步上2阶，最后剩1阶；若每步上3阶，最后剩2阶；若每步上5阶，
	 * 最后剩4阶；若每步上6阶，最后剩5阶；只有每步上7阶，最后一阶也不剩。
	 * 请问该阶梯至少有多少阶。编写一个Java程序解决该问题。
	 * */
	public static void main(String[] args) {      
		int number = 7,result =0;
		for(int i=0;i<50;i++){
			//
			if((result%2 == 1) && (result%3 == 2) && 
					(result%5 == 4) && (result%6 == 5)){
				break;
			}
			result = number*i;
		}
		System.out.println("结果为：" + result);
	}
}
