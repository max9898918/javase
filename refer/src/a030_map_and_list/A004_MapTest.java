package a030_map_and_list;
import java.util.Collection;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

import org.junit.Test;
/**
 * ����Map�����ַ�ʽ
 * @author Administrator
 *
 */
public class A004_MapTest {
	public static void main(String[] args) {
		A004_MapTest mapTest = new A004_MapTest();
		mapTest.get_keySetMap(); //1.ʹ��keySet����map
		mapTest.get_values();//�ڶ��ֱ�����ʹ��values����map
		mapTest.getEntry03();//�����ַ�ʽ

	}
	
	/**
	 * ��һ�֣�map.keySet()
	 * ��Mapת��Set���ϣ�keySet()����ͨ��Set�ĵ�����ȡ��Set�����е�ÿһ��Ԫ�أ�Iterator������Map�����е����еļ�����ͨ��get������ȡ����Ӧ��ֵ��
	 */
	@Test
	public void get_keySetMap(){
		System.out.println("ʹ��map.keySet()����map");
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(3, "cccc");
		map.put(1, "aaaa");
		map.put(2, "bbbb");
		
		System.out.println(map);
		// ��ȡ������
		// ��һ�ַ�ʽ: ʹ��keySet
		// ��Ҫ�ֱ��ȡkey��value��û����������˼��
		// Set<K> keySet() �������е�key�����Set����
		Set<Integer> ks = map.keySet();
		Iterator<Integer> it = ks.iterator();
		while (it.hasNext()) {
			Integer key = it.next();//�����õ�key
			String value = map.get(key);
			System.out.print("key=" + key + " value=" + value+"     ");
		}
		System.out.println("\n");
	}

	/**
	 * �ڶ��֣�
	 * map.values(); ��ȡ����ֵ,���ܻ�ȡ��key����
	 */
	@Test
	public void get_values(){
		System.out.println("map.values(); ��ȡ����ֵ");
		Map<Integer, String> map = new HashMap<Integer, String>();
		map.put(1, "aaaa");
		map.put(2, "bbbb");
		map.put(3, "cccc");
		
		System.out.println(map);
		Collection<String> vs = map.values();
		Iterator<String> it = vs.iterator();
		while (it.hasNext()) {
			String value = it.next();
			System.out.print("value=" + value+"     ");
		}
		System.out.println("\n\n");
	}


	/**
	 * �����ַ�ʽ:Map.Entry<K, V>
	 * map.entrySet()  LinkedHashMap�����Ž�ȥ�������ó������������Ĳ�һ��
	 * for( Map.Entry<Integer,String> entry:map.entrySet()){evtry.getKey()}
	 */
	@Test
	public void getEntry03(){
		System.out.println("ʹ��  Map.Entry<Integer,String> entry:map.entrySet() ����map");
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(4, "dddddd");
		map.put(3, "cccc");
		map.put(3, "������");
		map.put(2, "bbbb");
		map.put(1, "aaaa");
		System.out.println(map);
		// �����ַ�ʽ�� Map.Entry���� �Ƽ�ʹ��
		System.out.println("ʹ����ǿfor����map.entrySet()");
		Set<Entry<Integer, String>> entrySet = map.entrySet();

		for(Map.Entry<Integer, String> entry:map.entrySet()){
			System.out.print("key=" +entry.getKey()+" value=" +entry.getValue()+"     ");
		}
		System.out.println();

		// ���ص�Map.Entry�����Set���� Map.Entry������key��value����
		System.out.println("����һ�ַ�������map");
		Set<Map.Entry<Integer, String>> es = map.entrySet();
		Iterator<Entry<Integer, String>> it = es.iterator();

		while (it.hasNext()) {
			// ���ص��Ƿ�װ��key��value�����Map.Entry����
			Map.Entry<Integer, String> en = it.next();
			// ��ȡMap.Entry�����з�װ��key��value����
			Integer key = en.getKey();
			String value = en.getValue();
			System.out.print("key=" + key + " value=" + value+"     ");
		}

	}
	
	/**
	 * 1������������Hashtable��key-value�಻����nullֵ��
	 * 2����HashMap�ǿ���Ϊnull�ģ�key�ǲ����ظ��ģ�value�����ж����null
	 * 
	 */
	@Test
	public void run1(){
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		hashtable.put("1", "a");//Hashtable�ļ���ֵ�಻��Ϊnull
		System.out.println(hashtable);
		System.out.println("\n\n\n");
		
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put(null, null);
		System.out.println(hashMap);
	}
}

