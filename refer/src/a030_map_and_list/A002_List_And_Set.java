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
 * ������ʾ����
 * List��Set ����� add(Element e)��
 * ��ָ���±����Listʵ������  addAll(index,list)��
 * �滻 set(index,Element e)��
 * ɾ�� remove(index)
 * @author Administrator
 * ����ʱ�䣺2017-01-16
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
	 * Set��������������ظ���Ԫ�ء���Ϊ������ظ���Ԫ��Set�Ḳ����ǰ��Ԫ�ء�
	 */
	@Test
	public void setTest01(){
		Set<String> set = new HashSet<String>();
		set.add("1_�������");
		set.add("2_����֪ʶ");
		
		set.add("3_����֪ʶ");
		set.add("3_����֪ʶ");
		set.add("3_����֪ʶ");
		set.add("3_����֪ʶ");
		set.add("3_����֪ʶ");
		set.add("3_����֪ʶ");
		
		set.add("4_���ͷ���");

		System.out.println("����Set��"+set);//�����[1�������, 4���ͷ���, 3����֪ʶ, 2����֪ʶ]
		
		Iterator<String> it = set.iterator();
		while (it.hasNext()) {
			System.out.println(it.next()+"    ");
		}
		System.out.println("\n\n");
	}

	/**
	 * ʹ��LinkedList��descendingIterator����ʵ���������LinkedList
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
		//Collections.sort(list);����List
		System.out.println("ʹ��LinkedListʵ�� .descendingIterator��������"+list);
		Iterator<String> dit = list.descendingIterator();
		
		while (dit.hasNext()) {
			System.out.print(dit.next()+"  ");
		}
		
		System.out.println("\n\n");
	}

	/**
	 * 1��ArrayList����� add(Element e)��
	 * 2����ָ���±����Listʵ������  addAll(index,list)��
	 * 3���滻 set(index,Element e)��ɾ�� remove(index)��
	 */
	@Test
	public void operatorArrayList03(){
		List<String> list = new ArrayList<String>();
		// ���ӣ�add() ��ָ������洢��������
		list.add("1���������");
		list.add("2�ִ�����ϵͳ");
		list.add("3java���˼��");
		list.add("4java���ļ���");
		list.add("5java���Գ������");
		//System.out.println("ͨ���±��ȡԪ�أ�"+ list.get(2));
		System.out.println(list);
		
		// �޸�2�±�λ�õ��飬���ص�ԭ��2�Ǳ�λ�õ���
		System.out.println("�±�2���滻��Ԫ��Ϊ��"+list.set(3, "�滻���±�2��Ԫ��")); //java���˼��
		System.out.println("�滻���ArrayListΪ��"+list); 
		
		// ɾ��0�±�Ԫ��
		System.out.println("ɾ����0�±�Ԫ��Ϊ�� "+ list.remove(0));
		System.out.println("ɾ�����listΪ��"+list);


		List<String> list2 = new ArrayList<String>();
		list2.add("ʷ��(list2)");
		list2.add("����ͨ��(list2)");
		list2.add("ȫ��ͨʷ(list2)");
		// ��list2���ϵ�1�±�λ�����list����Ԫ��
		System.out.println("\n��list2���ϵ�1�±�λ�����list����Ԫ�أ�"+list2.addAll(list));
		System.out.println("ʹ��addAll���list��Ԫ��Ϊ��"+list2);
		
		
		ListIterator<String> lit = list2.listIterator();
		while (lit.hasNext()) {
			String next = (String) lit.next();
			System.out.print(next+"    ");
		}

		System.out.println("\n\n �������--------------------------------------");
		while (lit.hasPrevious()) {
			String next = (String) lit.previous();
			System.out.print(next+"    ");
		}
		
		//forѭ������������
		System.out.println("\n\n ---------------ʹ��for����������-------------------");
		for (Iterator<String> it = list2.iterator(); it.hasNext();) {
			//��������next��������ֵ������Object������Ҫ�ǵ�����ת����
			String next = (String) it.next();
			System.out.print(next+"    ");
		}
		
		System.out.println("\n\n ---------------ʹ��for�����±��ȡԪ��-------------------");
		for(int i=0;i<list2.size();i++){
			System.out.print(list2.get(i)+"    ");
		}
	}

}
