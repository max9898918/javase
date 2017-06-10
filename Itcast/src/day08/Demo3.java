package day08;
/*
���󣺱�дһ������Ĺ����ࡣ
	Arrays.toString����   [1,2,3,4];
	sort()
 */

//���鹤����
class ArrayTool{
	
	/*public static String toString(int[] arr){
		String result  = "";
		for(int i = 0;  i < arr.length ; i++){
			if (i==0){
				result+="["+arr[i]+",";
			}else if(i==(arr.length-1)){
				result+= arr[i]+"]";
			}else{
				result+=arr[i]+",";
			}
		}
		return result;
	}*/
	public  static  String toString(int [] arr){
		String result="";
		for(int i=0;i<arr.length;i++){
			if(i==0){
				result="["+arr[i]+","+result;
			}else if(i==(arr.length-1)){
				result=arr[i]+"]";
			}else{
				result=arr[i]+","+result;
			}
		}
		return result;
	}

	public static void sort(int[] arr){
		for(int i = 0; i < arr.length-1 ; i++){
			for(int j = i+1 ; j<arr.length ; j++){
				if(arr[i]>arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}	
	}

}



class Demo3 
{
	public static void main(String[] args) 
	{
		int[] arr = {12,1,456,165};
		//ArrayTool tool = new ArrayTool();

		ArrayTool.sort(arr);
		String info = ArrayTool.toString(arr);
		System.out.println("�����Ԫ�أ�"+ info);
	}
}
