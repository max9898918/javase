package day05;
/*
��̬��ʼ����

	��������[][]  ������ = {{Ԫ��1,Ԫ��2...},{Ԫ��1,Ԫ��2...},{Ԫ��1,Ԫ��2...} ..}
*/
class Demo16 
{
	public static void main(String[] args) 
	{
		int[][] arr = {{10,11,9},{67,12},{33,35,39,40}};
		//������ά����
		for(int i = 0;  i <arr.length ; i++){
			for(int j = 0 ; j<arr[i].length ; j++){
				System.out.print(arr[i][j]+",");
			}
			//����
			System.out.println();
		}
	}

	// ����һ����ά���飬Ȼ������ά������ż��Ԫ�ص��ܺ͡�
}
