package day06;


/*
���� Ŀǰ�������飺int[] arr = {0,0,12,1,0,4,6,0} ����дһ������
���ո����飬Ȼ��Ѹ������0��գ�Ȼ�󷵻�һ��������0Ԫ�ص����顣

���裺
	1. �����������ĳ��ȡ�  ԭ�������鳤��-0�ĸ���


*/
import java.util.*;
class Demo7 
{
	public static void main(String[] args) 
	{
		int[] arr = {0,0,12,1,0,4,6,0};
		arr = clearZero(arr);
		System.out.println("�����Ԫ�أ�"+Arrays.toString(arr));
	}


	public static  int[] clearZero(int[] arr){
		//ͳ��0�ĸ���
		int count = 0;	//����һ��������¼0�ĸ���
		for(int i = 0 ; i<arr.length ; i++){
			if(arr[i]==0){
				count++;
			}
		}

		//����һ���µ�����
		int[] newArr = new int[arr.length-count];
			
		int index  =0 ; //������ʹ�õ�����ֵ
		//�ѷǵ����ݴ洢���������С�
		for(int i = 0; i<arr.length ; i++){
			if(arr[i]!=0){
				newArr[index] = arr[i];
				index++;
			}
		}
		return newArr;
	}
}
