package day05;
/*
���� ����һ����������һ��int���͵���������ҳ���������� �����Ԫ�ط��ظ������ߡ�

*/

class Demo8 
{
	public static void main(String[] args) 
	{
		int[] arr = {-12,-14,-5,-26,-4};
		int max = getMax(arr);
		System.out.println("���ֵ��"+ max); 
	}


	public static int  getMax(int[] arr){
		int max = arr[0]; //���ڼ�¼���ֵ
		for(int i = 1 ; i < arr.length ; i++){
			if(arr[i]>max){  //���������Ԫ�ر�max����ômax�����ͼ�¼��Ԫ�ء�
				max = arr[i];
			}
		}
		return max;
	}


}
