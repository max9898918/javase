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
 * 遍历Map的三种方式
 * @author Administrator
 *
 */
public class A004_MapTest {
	public static void main(String[] args) {
		A004_MapTest mapTest = new A004_MapTest();
		mapTest.get_keySetMap(); //1.使用keySet遍历map
		mapTest.get_values();//第二种遍历：使用values遍历map
		mapTest.getEntry03();//第三种方式

	}
	
	/**
	 * 第一种：map.keySet()
	 * 将Map转成Set集合（keySet()），通过Set的迭代器取出Set集合中的每一个元素（Iterator）就是Map集合中的所有的键，再通过get方法获取键对应的值。
	 */
	@Test
	public void get_keySetMap(){
		System.out.println("使用map.keySet()遍历map");
		Map<Integer, String> map = new TreeMap<Integer, String>();
		map.put(3, "cccc");
		map.put(1, "aaaa");
		map.put(2, "bbbb");
		
		System.out.println(map);
		// 获取方法：
		// 第一种方式: 使用keySet
		// 需要分别获取key和value，没有面向对象的思想
		// Set<K> keySet() 返回所有的key对象的Set集合
		Set<Integer> ks = map.keySet();
		Iterator<Integer> it = ks.iterator();
		while (it.hasNext()) {
			Integer key = it.next();//依次拿到key
			String value = map.get(key);
			System.out.print("key=" + key + " value=" + value+"     ");
		}
		System.out.println("\n");
	}

	/**
	 * 第二种：
	 * map.values(); 获取所有值,不能获取到key对象
	 */
	@Test
	public void get_values(){
		System.out.println("map.values(); 获取所有值");
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
	 * 第三种方式:Map.Entry<K, V>
	 * map.entrySet()  LinkedHashMap怎样放进去就怎样拿出来、和其它的不一样
	 * for( Map.Entry<Integer,String> entry:map.entrySet()){evtry.getKey()}
	 */
	@Test
	public void getEntry03(){
		System.out.println("使用  Map.Entry<Integer,String> entry:map.entrySet() 遍历map");
		Map<Integer, String> map = new LinkedHashMap<Integer, String>();
		map.put(4, "dddddd");
		map.put(3, "cccc");
		map.put(3, "看代码");
		map.put(2, "bbbb");
		map.put(1, "aaaa");
		System.out.println(map);
		// 第三种方式： Map.Entry对象 推荐使用
		System.out.println("使用增强for遍历map.entrySet()");
		Set<Entry<Integer, String>> entrySet = map.entrySet();

		for(Map.Entry<Integer, String> entry:map.entrySet()){
			System.out.print("key=" +entry.getKey()+" value=" +entry.getValue()+"     ");
		}
		System.out.println();

		// 返回的Map.Entry对象的Set集合 Map.Entry包含了key和value对象
		System.out.println("另外一种方法遍历map");
		Set<Map.Entry<Integer, String>> es = map.entrySet();
		Iterator<Entry<Integer, String>> it = es.iterator();

		while (it.hasNext()) {
			// 返回的是封装了key和value对象的Map.Entry对象
			Map.Entry<Integer, String> en = it.next();
			// 获取Map.Entry对象中封装的key和value对象
			Integer key = en.getKey();
			String value = en.getValue();
			System.out.print("key=" + key + " value=" + value+"     ");
		}

	}
	
	/**
	 * 1、本方法测试Hashtable的key-value多不能是null值、
	 * 2、而HashMap是可以为null的，key是不能重复的，value可以有多个是null
	 * 
	 */
	@Test
	public void run1(){
		Hashtable<String, String> hashtable = new Hashtable<String, String>();
		hashtable.put("1", "a");//Hashtable的键和值多不能为null
		System.out.println(hashtable);
		System.out.println("\n\n\n");
		
		HashMap<String, String> hashMap = new HashMap<String, String>();
		hashMap.put(null, null);
		System.out.println(hashMap);
	}
}

