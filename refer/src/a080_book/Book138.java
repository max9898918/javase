package a080_book;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Book138 {
	public static void test1(){
		System.out.println("Use defind class as key;");
		HashMap<String,String> hm = new HashMap<String,String>();
		//HashMap hm = new HashMap();
		hm.put("aaa","bbb");
		hm.put("aaa","ccc");
		
		Iterator i = hm.entrySet().iterator();
		while(i.hasNext()){
			Map.Entry e = (Map.Entry)i.next();
			String key = (String)e.getKey();
			String value = (String)e.getValue();
			System.out.println(key+"  "+value);
			
		}
		
	}
	public static void main(String[] args) {
		System.out.println("aa");
		test1();
	
	}

}
