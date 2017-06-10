package day12.string;
/*
����1���Լ�ʵ��trim�ķ�����

����2�� ��ȡ�ϴ��ļ���  "D:\\20120512\\day12\\Demo1.java"��

����3��	���ַ��������д洢���ַ�����    ���й���     -----> �ù�����

����4�� ��һ���Ӵ��������г��ֵĴ��� �� 
	

*/
public class Demo6 {
	
	public static void main(String[] args) {
		String str  ="        ����        ����             ";	
		System.out.println(myTrim(str));
		
		str =  "D:\\20120512\\day12\\Demo1.java";
		getFileName(str);
		
		str = "���й���";
		System.out.println("��ת����ַ�����"+ reverse(str));
		
		str = "abcjavaabcjavaphpjava";  //java
		getCount(str, "java");
		
	}
	
	
	//ͳ���Ӵ����� �Ĵ���
	public static void getCount(String str,String target){
		int count = 0 ; //���ڼ�¼���ֵĴ���
		int fromIndex  = 0; // ��¼���Ǹ�����ֵ��ʼѰ��Ŀ���Ӵ�
		while((fromIndex = str.indexOf(target, fromIndex))!=-1){
			//���indexof�������� �Ĳ���-1����ô�����Ѿ��ҵ���Ŀ�� Ԫ�ء�
			count++;
			fromIndex = fromIndex+target.length();
		}
		System.out.println("���ֵĴ�����"+ count);
	}
	
	
	
	public static String reverse(String str){
		char[] arr = str.toCharArray();
		for(int startIndex = 0 , endIndex=arr.length-1 ; startIndex<endIndex; startIndex++,endIndex--){
				char temp = arr[startIndex];
				arr[startIndex] = arr[endIndex];
				arr[endIndex] = temp;
		}
		//ʹ���ַ����鹹��һ���ַ�����
		return new String(arr);
	}
	
	
	
	
	
	//����2�� ��ȡ�ϴ��ļ���  "D:\\20120512\\day12\\Demo1.java"��
	public static void getFileName(String path){
		int index = path.lastIndexOf("\\");
		String fileName = path.substring(index+1);
		System.out.println("�ļ�����"+ fileName);
	}
	
	
	
//	����1���Լ�ʵ��trim�ķ�����
	public static String myTrim(String str){
		//��ת�����ַ� ����
		char[] arr = str.toCharArray();
		//�������� ������¼��ʼ����� ������ֵ
		int startIndex = 0 ;
		int endIndex = arr.length -1;
		//ȷ����ʼ ������ֵ
		while(true){
			if(arr[startIndex]==' '){
				startIndex++;
			}else{
				break;
			}
		}
		//ȷ������ ������ֵ��
		while(true){
			if(arr[endIndex]==' '){
				endIndex--;
			}else{
				break;
			}
		}
		//��ȡ�Ӵ�����
		return str.substring(startIndex,endIndex+1);		
	}
	

}
