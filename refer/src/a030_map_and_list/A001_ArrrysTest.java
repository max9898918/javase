package a030_map_and_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
/**
 * 本类主要总结了ArrayList实例对象各种方法的使用.如果不完善。请继续添加
 * 创建时间:2017-01-15
 * @author Administrator
 *
 */
public class A001_ArrrysTest {

	public static void main(String[] args) {
		//sort();
	}
	@Test
	public void sort(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(4);
		list.add(3);
		list.add(1);
		list.add(2);
		list.add(3);
		Collections.sort(list);// 排序(list是ArrayList实例)
		System.out.println("正序排序后的ArrayList实例对象："+list);
		// 折半查找的前提是排序好的元素
		/*System.out.println("使用Collections.binarySearch查找下标"+ Collections.binarySearch( list , 3 ) );  // 找不到返回-插入点-1
		System.out.println("使用ArrayList的indexOf方法查找下标："+list.indexOf(3));*/
		Collections.reverse( list );// 反序集合输出
		System.out.println("反序排序后的ArrayList实例对象："+list );
		System.out.println("最大值:"+Collections.max(list ));   // 求最大值
		System.out.println("最小值:"+Collections.min(list));
		
		/*Collections.fill( list, 5 );// fill() 使用指定的元素替换指定集合中的所有元素
		System.out.println( list );*/
		
		Integer is[] = new  Integer[]{9,6,7,8};// 将数组转换为集合
		List<Integer> list2 =  Arrays.asList(is);
		list.addAll( list2 );//
		System.out.println("addAll的使用："+list);

		// 将List转换为数组
		Object [] ins =  list.toArray();
		System.out.println("将List转换为数组："+ Arrays.toString( ins ) );

	}

}