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
		char[] StrArr = str.toCharArray();// 把字符串转为字符数组toCharArray  
		/*for (char c : StrArr) {
			System.out.println(str.split(""+c+"").length);
		}*/
		
		HashMap<Character, Integer> map = new HashMap<Character, Integer>();  
		if (!(StrArr == null || StrArr.length == 0))// 先判断字符数组是否为空  
			for (int i = 0; i < StrArr.length; i++)   
				if (null != map.get(StrArr[i]))  
					// 若不为空，说明已经存在相同字符，则Value值在原来的基础上加1  
					map.put(StrArr[i], map.get(StrArr[i]) + 1);  
				else  
					map.put(StrArr[i], 1);  

		// 找map中Value的最大值maxValue，类似于选择排序，寻找最大值的过程：  
		// 先任取一个Value值定义为最大值，然后与之比较  
		int maxValue = map.get(StrArr[0]);  
		char ch = ' ';  
		for (int j = 0; j < StrArr.length; j++)  
			if (maxValue < map.get(StrArr[j])) {  
				maxValue = map.get(StrArr[j]);  
				ch = StrArr[j];  
			}  

		System.out.println("现次数最多的字符：" + ch + " 出现次数：" + maxValue);  

	}


}
