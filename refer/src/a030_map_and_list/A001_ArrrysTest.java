package a030_map_and_list;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.junit.Test;
/**
 * ������Ҫ�ܽ���ArrayListʵ��������ַ�����ʹ��.��������ơ���������
 * ����ʱ��:2017-01-15
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
		Collections.sort(list);// ����(list��ArrayListʵ��)
		System.out.println("����������ArrayListʵ������"+list);
		// �۰���ҵ�ǰ��������õ�Ԫ��
		/*System.out.println("ʹ��Collections.binarySearch�����±�"+ Collections.binarySearch( list , 3 ) );  // �Ҳ�������-�����-1
		System.out.println("ʹ��ArrayList��indexOf���������±꣺"+list.indexOf(3));*/
		Collections.reverse( list );// ���򼯺����
		System.out.println("����������ArrayListʵ������"+list );
		System.out.println("���ֵ:"+Collections.max(list ));   // �����ֵ
		System.out.println("��Сֵ:"+Collections.min(list));
		
		/*Collections.fill( list, 5 );// fill() ʹ��ָ����Ԫ���滻ָ�������е�����Ԫ��
		System.out.println( list );*/
		
		Integer is[] = new  Integer[]{9,6,7,8};// ������ת��Ϊ����
		List<Integer> list2 =  Arrays.asList(is);
		list.addAll( list2 );//
		System.out.println("addAll��ʹ�ã�"+list);

		// ��Listת��Ϊ����
		Object [] ins =  list.toArray();
		System.out.println("��Listת��Ϊ���飺"+ Arrays.toString( ins ) );

	}

}