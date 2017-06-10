package a090_interview;

public class Demo01 {
	public static void main(String[] args){
		String str = "mÂòÂôÂòÂòÂò1";
		int n = 3,count=0;
		
	   	String[] arr = new String[str.length()];
		for(int i=0;i<arr.length;i++){
			arr[i] = str.substring(i,(i+1));
		}
		
		for(int i = 0; i<arr.length;i++){
			Boolean flag = arr[i].matches("[\u4e00-\u9fa5]");
			if(flag){
				count = count + 2;
			}else {
				count = count + 1;
			}
			if(count<n){
				System.out.print(arr[i]);
			}else if (count == n){
				System.out.println(arr[i]);
				count = 0;
			}else {
				count = 0;
				System.out.println();
			}
			
		}
		
		
	}
}
