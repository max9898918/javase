package day15.list;

import java.util.ArrayList;
import java.util.List;


/*
List�ӿ������з�����
	���
		add(int index, E element) 
		addAll(int index, Collection<? extends E> c) 
	��ȡ��
		get(int index) 
		indexOf(Object o) 
		lastIndexOf(Object o) 
		subList(int fromIndex, int toIndex) 
		
	�޸ģ�
		set(int index, E element) 
	
List�ӿ������еķ����߱����ص㣺 �����ķ�������������ֵ��	

ֻ��List�ӿ�����ļ�����ž߱�����ֵ�������ӿ�����ļ����඼û������ֵ��
	
	
		
ctrl + shift + /  ��Ӷ���ע��

ctrl  + shift + \  ȡ������ע��.
*/
public class Demo2 {
	
	public static void main(String[] args) {
		List list=  new ArrayList();
		list.add("����");
		list.add("��ʣ");
		list.add("����");  //��Ԫ����ӵ����ϵ�ĩβ����
		list.add("����");
		
		/*	
	       //��ӷ���
		list.add(1, "�Ա�ɽ"); // ��Ԫ����ӵ������е�ָ������ֵλ���ϡ�
		List list2 = new ArrayList();
		list2.add("��ɽ");
		list2.add("С����");
		list.addAll(2,list2); //��list2��Ԫ����ӵ�list����ָ������ֵ��λ���ϡ�
		 */
		
		/*
//		��ȡ�ķ��� 
		System.out.println("get������ȡԪ�أ�"+list.get(1)); //��������ֵ��ȡ�����е�Ԫ��
		ʹ��get�����������ϵ�Ԫ�أ�
		for (int i = 0; i < list.size() ; i++) {
			System.out.print(list.get(i)+",");
		}
		
		System.out.println("�ҳ�ָ��Ԫ�ص�һ�γ����ڼ����� ������ֵ��"+ list.indexOf("��ɽ"));
		System.out.println("��ָ����Ԫ�����һ�γ����ڼ����е�����ֵ��"+list.lastIndexOf("����"));
		List subList = list.subList(1, 3); //ָ����ʼ�����������ֵ��ȡ�����е�Ԫ�ء�
		System.out.println("�Ӽ��ϵ�Ԫ���ǣ�"+ subList);
	 */	
		list.set(3, "�Ա�ɽ"); //ʹ��ָ����Ԫ���滻ָ������ֵλ�õ�Ԫ�ء�
		
		
		System.out.println("���ϵ�Ԫ�أ�"+list);
		
		
		
		
	}

}
