package day05;
/*
���� ����һ����������һ��int���͵��������, �������е����ֵ���������е����һλ��

ð������ð�������˼�����ʹ�����ڵ����� Ԫ�ذ����Ƚ�һ�Σ�������������λ�á�

*/

class Demo10 
{
	public static void main(String[] args) 
	{
		int[] arr = {12,8,17,5,9}; // ��������ֵ: 4   ������5 
 		bubbleSort(arr);
	}

	/**
	 * ���򴫹�ȥ��int���͵����飬����ӡ������̨
	 * @param arr
	 */
	public static void bubbleSort(int[] arr){
		// �����ֵ�������һ��λ��
		for(int j = 0 ; j<arr.length-1 ; j++){ //��������
			for(int i = 0 ; i<arr.length-1-j  ; i++){  // �ҳ�һ�����ֵ  
				//���ڵ�Ԫ�رȽ�
				if(arr[i]>arr[i+1]){
					int temp  = arr[i];
					arr[i] = arr[i+1];
					arr[i+1] = temp;
				}
			}
		}

/*
	
		//���϶����ڵ����ڶ���λ���ϡ�
		for(int i = 0 ;  i <arr.length-1-1 ; i++){
			if(arr[i]>arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}	
		}

	
		//���������ڵ���������λ���ϡ�
		for(int i = 0 ;  i <arr.length-1-2 ; i++){
			if(arr[i]>arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}	
		}

		//�����ķ��ڵ������ĸ�λ���ϡ�
		for(int i = 0 ;  i <arr.length-1-3 ; i++){
			if(arr[i]>arr[i+1]){
				int temp = arr[i];
				arr[i] = arr[i+1];
				arr[i+1] = temp;
			}	
		}

*/


		//�������飬�鿴Ч��
		System.out.print("Ŀǰ��Ԫ�أ�");
		for (int i = 0 ; i<arr.length  ;i++){
			System.out.print(arr[i]+",");
		}
		
	}

}
