package a110_other;

import java.util.Arrays;

public class A003_ArraysMethod {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] array1={3,9,6,5,7};
		int[] array2=Arrays.copyOf(array1, 5);
		//�����������䣬ͨ������toStringת�����ַ�������ӡ����
		System.out.println(Arrays.toString(array2));
		System.out.println(Arrays.equals(array1, array2));
		//�Ƚ����������Ƿ����
		Arrays.fill(array2, 7);
		//��array2������䣬���Ϊ7
		System.out.println(Arrays.toString(array2));
		Arrays.sort(array1);
		System.out.println(Arrays.toString(array1));
		System.out.println(Arrays.binarySearch(array1, 8));
		//�����������꣬��û��ʱΪ-1
	}

}
