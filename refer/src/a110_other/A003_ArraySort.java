package a110_other;

public class A003_ArraySort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		arraySort();
	}

	/**
	 * 数组排序
	 */
	public static void arraySort(){
		int[] array=new int[]{9,3,7,10,8};
		//这种只是交换位置，慢
		for(int i=0;i<array.length;i++){
			for(int j=0;j<array.length;j++){
				if(array[i]>array[j]){
					int h=array[j];
					array[j]=array[i];
					array[i]=h;
				}
			}
		}

		for(int i=0;i<array.length;i++){
			System.out.print(array[i]+"  ");
		}
		
		/*
		 * 这种排序效率更高
		 * n个数组来排序，外层循环n-1,内层n-1-i 使用内层循环的变量作为if判断的值
		 */
		for(int i=0;i<array.length-1;i++){
			for(int j=0;j<array.length-1-i;j++){
				if(array[j]>array[j+1]){
					int number = array[j];
					array[j] =array[j+1];
					array[j+1]=number;
				}
			}
		}
		System.out.println("\n------------另一种方式打印-------------");
		for(int i:array){
			System.out.print(i+"  ");
		}

	}
}
