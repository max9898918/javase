package day05;
/*
���� ����һ����������һ��int���͵��������, �������е����ֵ���������еĵ�һλ��

ѡ������(ֱ������)��ʹ��һ��Ԫ�������� ��Ԫ�ذ����Ƚ�һ�Σ�������������λ�á�


*/
class Demo9{
	
	public static void main(String[] args) 
	{
		int[] arr = {12,5,17,8,9};  //����5Ԫ�ص����飬ֻ��Ҫ�ҳ�4�����ֵ�Ϳ��������ˡ�
		selectSort(arr);
	}

	public static void selectSort(int[] arr){
		
		//�����ֵ������λ�á�
		for(int j = 0; j<arr.length-1; j++){  //  ���Ƶ���������
			for(int i = j+1 ; i<arr.length ; i++){ // �ҳ����ֵ
				if(arr[i]>arr[j]){
					//����λ��
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		

/*
		//���϶����ڵڶ���λ��
		for(int i = 2  ; i< arr.length ; i++){
			if(arr[i]>arr[1]){
				int temp = arr[i];
				arr[i] = arr[1];
				arr[1] = temp;
			}
		}
		

		//���������ڵ�����λ��
		for(int i = 3  ; i< arr.length ; i++){
			if(arr[i]>arr[2]){
				int temp = arr[i];
				arr[i] = arr[2];
				arr[2] = temp;
			}
		}

		//�����ķ��ڵ��ĸ�λ��
		for(int i = 4  ; i< arr.length ; i++){
			if(arr[i]>arr[3]){
				int temp = arr[i];
				arr[i] = arr[3];
				arr[3] = temp;
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
