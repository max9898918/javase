package day16.itcast.genrictiry;

import java.util.ArrayList;

//���ϳ���Աд �ġ�  jdk1.4��ʱ��д�ġ�
public class MyUtil {
	
	public static ArrayList getList(){
		
		return new ArrayList();
	}
	
	public static void print(ArrayList list){
	
		for (int i = 0; i < list.size() ; i++) {
			System.out.println(list.get(i));
		}
	}
	
}
