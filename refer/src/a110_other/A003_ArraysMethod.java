package a110_other;

import java.util.Arrays;

public class A003_ArraysMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array1={3,9,6,5,7};
		int[] array2=Arrays.copyOf(array1, 5);
		//对数组进行填充，通过下面toString转换成字符串并打印出来
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.equals(array1, array2));
		//比较两个数组是否相等
		Arrays.fill(array2, 7);
		//对array2进行填充，填充为7
		System.out.println(Arrays.toString(array2));
		Arrays.sort(array1);
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.binarySearch(array1, 8));
		//查找数组数标，当没有时为-1
	}

}
