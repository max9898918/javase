package a030_map_and_list;

import java.util.HashMap;
import java.util.Map;

public class MapTest {

	public static void main(String[] args) {
		/*HashMap<String, Integer> hashMap = new HashMap<String,Integer>();
		Integer flag = hashMap.put("1", 1);
		System.out.println();
		System.out.println(hashMap.put("1", 2));*/
		
		String str = "aaaaaabbbbbc";  
		char[] StrArr = str.toCharArray();// ���ַ���תΪ�ַ�����toCharArray  
		/*for (char c : StrArr) {
			System.out.println(str.split(""+c+"").length);
		}*/
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();  
		if (!(StrArr == null || StrArr.length == 0))// ���ж��ַ������Ƿ�Ϊ��  
			for (int i = 0; i < StrArr.length; i++)   
				if (null != map.get(StrArr[i]))  
					// ����Ϊ�գ�˵���Ѿ�������ͬ�ַ�����Valueֵ��ԭ���Ļ����ϼ�1  
					map.put(StrArr[i], map.get(StrArr[i]) + 1);  
				else  
					map.put(StrArr[i], 1);  

		// ��map��Value�����ֵmaxValue��������ѡ������Ѱ�����ֵ�Ĺ��̣�  
		// ����ȡһ��Valueֵ����Ϊ���ֵ��Ȼ����֮�Ƚ�  
		int maxValue = map.get(StrArr[0]);  
		char ch = ' ';  
		for (int j = 0; j < StrArr.length; j++)  
			if (maxValue < map.get(StrArr[j])) {  
				maxValue = map.get(StrArr[j]);  
				ch = StrArr[j];  
			}  

		System.out.println("�ִ��������ַ���" + ch + " ���ִ�����" + maxValue);  

	}


}
