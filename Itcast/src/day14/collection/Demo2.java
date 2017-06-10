package day14.collection;

import java.util.ArrayList;
import java.util.Collection;

/*
 ���ϣ������Ǵ洢�������ݵļ���������
 
���ϱ���������ƣ�
	1. ���Ͽ��Դ洢�������͵Ķ������ݣ�����ֻ�ܴ洢ͬһ���������� �����ݡ�
	2. ���ϵĳ����ǻᷢ���仯�ģ�����ĳ����ǹ̶��ġ�
	
 
-------| Collection  �������ϵĸ��ӿڡ� 
 ----------| List  �����ʵ����List�ӿڵļ����࣬�߱����ص㣺 ���򣬿��ظ���
 ----------| Set   �����ʵ����Set�ӿڵļ����࣬�߱��ص㣺 ���򣬲����ظ���

Collection�ӿ��еķ�����
	
	����
		add(E e)  ��ӳɹ�����true����� ʧ�ܷ���false.
		addAll(Collection c)  ��һ������ ��Ԫ����ӵ�����һ��������ȥ��
	
	ɾ��
		clear() 
		remove(Object o) 
		
		removeAll(Collection  c) 
		retainAll(Collection  c) 
	
	�鿴
		size() 

	
	�ж�
		isEmpty() 
		contains(Object o) 
		containsAll(Collection<?> c) 
	
	����
		toArray() 
		iterator() 

 */
public class Demo2 {
	
	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("��ƻ�");
		c.add("��ź�");
		c.add("������");
		System.out.println("��ӳɹ���"+c.add("������"));
		
		
		//��������
		Collection c2 = new ArrayList();
		c2.add("��ź�");
		c2.add("������");
		c2.add("����");
	
		/*
		c.addAll(c2); // ��c2��Ԫ�ص���ӵ�c���� ��ȥ��
		*/
		
		/*
		 ɾ������:
		c.clear(); //clear()��ռ����е�Ԫ��
		System.out.println("ɾ���ɹ���"+c.remove("����"));  // remove ָ�������е�Ԫ��ɾ����ɾ���ɹ�����true��ɾ��ʧ�ܷ���false.
		
		c.removeAll(c2); //ɾ��c��������c2�Ľ���Ԫ�ء�
		
		c.retainAll(c2); //����c������c2�Ľ���Ԫ�أ�������Ԫ��һ��ɾ����
		*/
		System.out.println("�鿴Ԫ�ظ�����"+c.size());
		
		System.out.println("���ϵ�Ԫ�أ�"+ c);
		
		
	}
	
}
