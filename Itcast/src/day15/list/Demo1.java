package day15.list;

import java.util.ArrayList;
import java.util.List;

/*
 ���ϵ���ϵ��
 
 ----------| Collection ���м��� �ĸ��ӿ�
 --------------|  List  �����ʵ����List�ӿڵļ����࣬�ü�����߱����ص㣺���򣬿��ظ���
 --------------|  Set   �����ʵ����Set�ӿڵļ����࣬�ü�����߱����ص㣺 ���򣬲����ظ���

���� ���ϵ�������ָ��Ȼ˳�򣬶���ָ��ӽ�ȥ��˳����Ԫ�س�����˳����һ�µġ�

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

	����
		listIterator() 
 
 */
public class Demo1 {

	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		list.add("����");
		System.out.println("���ϵ�Ԫ�أ�"+ list);
		
		
	}
	
}
