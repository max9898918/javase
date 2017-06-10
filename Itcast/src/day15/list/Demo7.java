package day15.list;

import java.util.ArrayList;
import java.util.Iterator;

/*

*/
class Book{
	
	int id;
	
	String name;// ����

	public Book(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return "{ ��ţ�"+ this.id+" ������"+ this.name+" }";
	
	}
	
	@Override
	public boolean equals(Object obj) {
		Book book =(Book)obj;
		return this.id==book.id;
	}
	
	
}

// ���� ��дһ����������������ظ�Ԫ�ء� ��������һ������Ϊ�ظ�Ԫ�ء�  Ҫ�� ��������Ԫ�ص�ʱ�����ʹ�õ�������  get ������

public class Demo7 {
	
	public static void main(String[] args) {
		ArrayList list=  new ArrayList();
		list.add(new Book(110,"java���˼��"));
		list.add(new Book(220,"java���ļ���"));
		list.add(new Book(330,"����javaweb"));
		list.add(new Book(110,"javas����"));
		
		ArrayList list2 = clearRepeat(list);
		System.out.println("�¼��ϵ�Ԫ���ǣ�"+ list2);
	}
	
	
	public static ArrayList  clearRepeat(ArrayList list){
		//����һ���µļ���
		ArrayList newList = new ArrayList();
		//��ȡ������
		Iterator it = list.iterator();
		while(it.hasNext()){
			Book book = (Book) it.next();  //�Ӿɼ����л�ȡ��Ԫ��
			if(!newList.contains(book)){
				//����¼���û�а������鼮����ô�ʹ洢���¼�����
				newList.add(book);
			}
		}
		return newList;
		
	}
	
	
}
