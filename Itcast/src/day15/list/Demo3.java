package day15.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
����
	listIterator() 
	

ListIterator���еķ�����
	
	��ӣ�
		hasPrevious()  �ж��Ƿ������һ��Ԫ�ء�
		previous()    ��ǰָ���������ƶ�һ����λ��Ȼ����ȡ����ǰָ��ָ���Ԫ�ء�
		
		next();  ��ȡ����ǰָ��ָ���Ԫ�أ�Ȼ��ָ�������ƶ�һ����λ��
		
---------------------------	
	
		add(E e)   �ѵ�ǰ��Ԫ�ز��뵽��ǰָ��ָ���λ���ϡ�
		set(E e)   �滻���������һ�η��ص�Ԫ�ء�
		
	
*/
public class Demo3 {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("����"); 
		list.add("��ʣ");
		list.add("����");
		list.add("����");
		
		ListIterator it = list.listIterator(); //���ص���һ��List�ӿ������еĵ�����
		/*System.out.println("����һ��Ԫ����"+ it.hasPrevious());
		System.out.println("��ȡ��һ��Ԫ�أ�"+it.previous());
		it.next();
		System.out.println("��ȡ��һ��Ԫ�أ�"+ it.previous());
		
		
		while(it.hasNext()){
			it.next();
		}
		
		while(it.hasPrevious()){
			System.out.println("Ԫ�أ�"+ it.previous());
		}
		
		
		it.next();
		it.next();
		it.add("����");
		*/
		it.next();
		it.next();
		it.set("����");
		
		
		System.out.println("���ϵ�Ԫ�أ�"+ list);
		
		
	}

}
