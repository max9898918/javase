package day15.list;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/*
 
 �������ڱ���Ԫ�ص�ʱ��Ҫע����� �ڵ���������Ԫ�� �Ĺ����У�������ʹ�ü��϶���ı伯���е�Ԫ�� �����������Ҫ��ӻ���ɾ��ֻ��ʹ�õ������ķ������в�����
 
 ���ʹ�ù��˼��϶���ı伯����Ԫ�ظ�����ô�ͻ����ConcurrentModificationException�쳣��	
 
 ����Ԫ�� �Ĺ�����: ������������ʹ�ý�����ʱ�䡣
 
 */

public class Demo5 {
	
	public static void main(String[] args) {
		List list = new ArrayList();
		list.add("����");
		list.add("����");
		list.add("����");
		
		ListIterator it = list.listIterator();	//��ȡ��������
	/*	while(it.hasNext()){
			System.out.print(it.next()+",");
			//it.add("aa"); // ��Ԫ����ӵ���ǰָ��ָ��λ��
			list.add("aa");  // add�����ǰ�Ԫ����ӵ����ϵ�ĩβ���ġ�
//			list.remove("����");
		}*/
		
		list.add("aa");
		it.next();
		
		
		
		System.out.println("\r\n���ϵ�Ԫ�أ�"+ list);
	}

}
