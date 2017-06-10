package stock.insert;

import java.util.HashMap;

public class Test01 {
	
	public static void main(String[] args) {
		/*String str = "('603990','麦迪科技','54.8','55.06','0.79','5.71','2016-12-30','13.87','2','0','43.86','5','0','73.85','8','0','143.13','0',null,null,null,'143.92',null,null,null,'143.92','143.92')";
		testStr(str);*/
		testMap();
		
	}
	
	public static void testMap(){
		HashMap<String, String> map = new HashMap<String,String>();
		map.put("aaa", "aaaaaa");
		System.out.println(map.get("bbb")==null);
	}
	
	/**
	 * 测试StringBuffer
	 */
	public static void testStr(String str){
		/*String str = "('000001','平安银行','9.08','9.1','0.22','0.44','2016-12-30','0.22','0','0','-0.44','0','0','-1.09','0','0','-5.51','20','5.05','20','0.78','20','-4.38','20','0.43','3.39','1.52','-2.59','3.82','2.75')";
		StringBuffer strBuf = new StringBuffer();
		int i = 0;
		for(i=0;i<10000;i++){
			strBuf.append(str);
		}
		System.out.println(i+strBuf.toString());*/
		String[] split = str.split("\\,");
		for(int i =0;i<split.length;i++){
			System.out.println(i+"--- "+split[i]);
		}
	}
	
}
