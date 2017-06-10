package day15.list;

import java.util.Iterator;
import java.util.LinkedList;
/*

���ϵ���ϵ��
----------| Collection  ���м��ϵĸ��ӿ�
----------------| List ���ʵ����List�ӿڵļ����࣬�߱����ص㣺 ���򣬿��ظ���
--------------------| ArrayList   ArrayList �ײ���ά����һ��Object����ʵ�� �ģ� �ص�: ��ѯ�ٶȿ죬��ɾ����
ʲôʱ��ʹ��ArrayList: ���Ŀǰ�������ǲ�ѯ�Ƚ϶࣬��ɾ�Ƚ��ٵ�ʱ����ô��ʹ��ArrayList�洢�������ݡ�  ���� ����У�� ͼ���

--------------------| LinkedList   LinkedList�ײ���ʹ�����������ݽṹʵ�ֵģ�  �ص㣺 ��ѯ�ٶ�������ɾ�졣

--------------------| Vector(�˽⼴��)

----------------| Set  ���ʵ����Set�ӿڵļ����࣬ �߱����ص㣺 ���򣬲����ظ���

Linkedlist���еķ�����
	1����������
	            addFirst(E e) 
				addLast(E e) 
		
				getFirst() 
				getLast() 
				
				removeFirst() 
				removeLast() 
	
	2�����ݽṹ
				1��ջ ��1.6��  : ��Ҫ������ʵ�ֶ�ջ���ݽṹ�Ĵ洢��ʽ��
					�Ƚ����
					push() 
					pop()
				2�����У�˫�˶���1.5���� ��Ҫ��Ϊ�������ǿ���ʹ��LinkedListģ��������ݽṹ�Ĵ洢��ʽ��
					�Ƚ��ȳ�
					offer()
					poll()
					
	3����������ĵ���������      
			descendingIterator()   ��������ĵ���������
*/

public class Demo8 {
	
	public static void main(String[] args) {
		LinkedList list= new LinkedList();
		list.add("����");
		list.add("����");
		list.add("����");
/*
		list.addFirst("����"); //��Ԫ����ӵ����ϵ���λ���ϡ�
		list.addLast("��ʣ");  //��Ԫ����ӵ����ϵ�ĩβ����
		

		System.out.println("��ȡ��������λ�õ�Ԫ��:"+list.getFirst());
		System.out.println("��ȡ������ĩβ��Ԫ�أ�"+ list.getLast());
	
		System.out.println("ɾ�������е���λ��Ԫ�ز����أ�"+ list.removeFirst());
		System.out.println("ɾ�������е�ĩβ�ز����أ�"+ list.removeLast());
			
		
		list.push("����");   //����Ԫ�ز���˼��ϵĿ�ͷ���� 
		System.out.println("ɾ�����ϵ���Ԫ�أ�"+list.pop()); // �Ƴ������ؼ����еĵ�һ��Ԫ�� 

		
		list.offer("��ʣ");
		System.out.println("ɾ�����ϵ���Ԫ��: "+list.poll());
	
		System.out.println("�����е�Ԫ�أ�"+ list);
		*/	
		Iterator  it = list.descendingIterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
	}

}
