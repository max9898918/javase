package a110_other;

public class A003_ArraySort {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		arraySort();
	}

	/**
	 * ��������
	 */
	public static void arraySort(){
		int[] array=new int[]{9,3,7,10,8};
		//����ֻ�ǽ���λ�ã���
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
		 * ��������Ч�ʸ���
		 * n���������������ѭ��n-1,�ڲ�n-1-i ʹ���ڲ�ѭ���ı�����Ϊif�жϵ�ֵ
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
		System.out.println("\n------------��һ�ַ�ʽ��ӡ-------------");
		for(int i:array){
			System.out.print(i+"  ");
		}

	}
}
