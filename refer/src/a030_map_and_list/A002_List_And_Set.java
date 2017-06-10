package a030_map_and_list;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.junit.Test;
/**
 * 本类演示集合
 * List和Set 的添加 add(Element e)、
 * 在指定下标添加List实例对象  addAll(index,list)、
 * 替换 set(index,Element e)、
 * 删除 remove(index)
 * @author Administrator
 * 创建时间：2017-01-16
 */
public class A002_List_And_Set {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		A002_List_And_Set list_and_set = new A002_List_And_Set();
		list_and_set.setTest01();
		list_and_set.descending02();
		list_and_set.operatorArrayList03();
	}
	
	
	/**
	 * Set保存的是无序无重复的元素、因为添加了重复的元素Set会覆盖以前的元素。
	 */
	@Test
	public void setTest01(){
		Set<String> set = new HashSet<String>();
		set.add("1_世界军事");
		set.add("2_兵器知识");
		
		set.add("3_舰船知识");
		set.add("3_舰船知识");
		set.add("3_舰船知识");
		set.add("3_舰船知识");
		set.add("3_舰船知识");
		set.add("3_舰船知识");
		
		set.add("4_汉和防务");

		System.out.println("遍历Set："+set);//结果：[1世界军事, 4汉和防务, 3舰船知识, 2兵器知识]
		
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next()+"    ");
		}
		System.out.println("\n\n");
	}

	/**
	 * 使用LinkedList的descendingIterator方法实现逆序遍历LinkedList
	 */
	@Test
	public void descending02(){
		LinkedList<String> list = new LinkedList<String>();
		
		list.add("2");
		list.add("3");
		list.add("4");
		list.add("0");
		list.add("1");
		list.add("5");
		//Collections.sort(list);排序List
		System.out.println("使用LinkedList实例 .descendingIterator逆序排序："+list);
		Iterator<String> dit = list.descendingIterator();
		
		while (dit.hasNext()) {
			System.out.print(dit.next()+"  ");
		}
		
		System.out.println("\n\n");
	}

	/**
	 * 1、ArrayList的添加 add(Element e)。
	 * 2、在指定下标添加List实例对象  addAll(index,list)。
	 * 3、替换 set(index,Element e)、删除 remove(index)。
	 */
	@Test
	public void operatorArrayList03(){
		List<String> list = new ArrayList<String>();
		// 增加：add() 将指定对象存储到容器中
		list.add("1计算机网络");
		list.add("2现代操作系统");
		list.add("3java编程思想");
		list.add("4java核心技术");
		list.add("5java语言程序设计");
		//System.out.println("通过下标获取元素："+ list.get(2));
		System.out.println(list);
		
		// 修改2下标位置的书，返回的原来2角标位置的书
		System.out.println("下标2被替换的元素为："+list.set(3, "替换后下标2的元素")); //java编程思想
		System.out.println("替换后的ArrayList为："+list); 
		
		// 删除0下标元素
		System.out.println("删除的0下标元素为： "+ list.remove(0));
		System.out.println("删除后的list为："+list);


		List<String> list2 = new ArrayList<String>();
		list2.add("史记(list2)");
		list2.add("资治通鉴(list2)");
		list2.add("全球通史(list2)");
		// 在list2集合的1下标位置添加list集合元素
		System.out.println("\n在list2集合的1下标位置添加list集合元素："+list2.addAll(list));
		System.out.println("使用addAll添加list的元素为："+list2);
		
		
		ListIterator<String> lit = list2.listIterator();
		while (lit.hasNext()) {
			String next = (String) lit.next();
			System.out.print(next+"    ");
		}

		System.out.println("\n\n 逆序输出--------------------------------------");
		while (lit.hasPrevious()) {
			String next = (String) lit.previous();
			System.out.print(next+"    ");
		}
		
		//for循环遍历迭代器
		System.out.println("\n\n ---------------使用for遍历迭代器-------------------");
		for (Iterator<String> it = list2.iterator(); it.hasNext();) {
			//迭代器的next方法返回值类型是Object，所以要记得类型转换。
			String next = (String) it.next();
			System.out.print(next+"    ");
		}
		
		System.out.println("\n\n ---------------使用for根据下标获取元素-------------------");
		for(int i=0;i<list2.size();i++){
			System.out.print(list2.get(i)+"    ");
		}
	}

}
