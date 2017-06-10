package day15.list;

import java.util.LinkedList;

/*
1��ջ ��1.6��  : ��Ҫ������ʵ�ֶ�ջ���ݽṹ�Ĵ洢��ʽ��
	�Ƚ����
	push() 
	pop()
2�����У�˫�˶���1.5���� ��Ҫ��Ϊ�������ǿ���ʹ��LinkedListģ��������ݽṹ�Ĵ洢��ʽ��
	�Ƚ��ȳ�
	offer()
	poll()
	
������Ŀ�� ʹ��LinkedListʵ�ֶ�ջ���ݽṹ�Ĵ洢��ʽ����е����ݽṹ�洢��ʽ��	
*/

// ʹ��LinkedListģ���ջ�����ݽṹ�洢��ʽ
class StackList{
	
	LinkedList list;
	
	public StackList(){
		list = new LinkedList();
	}
	
	//��ջ
	public void add(Object o){
		list.push(o);
	}
	
	//��ջ : ��Ԫ��ɾ�������ء�
	public Object pop(){
		return list.pop();
	} 
	
	//��ȡԪ�ظ���
	public int size(){
		return list.size();
	}
	
}

//ʹ��LinkedListģ����еĴ洢��ʽ
class TeamList{
	
	LinkedList list;
	
	public TeamList(){
		list = new LinkedList();
	}
	
	public void add(Object o){
		list.offer(o);
	}
	
	public Object remove(){
		return list.poll();
	}
	
	//��ȡԪ�ظ���
	public int size(){
		return list.size();
	}
	
}



public class Demo9 {
	
	public static void main(String[] args) {
		TeamList list=  new TeamList();
		list.add("��γ�");
		list.add("����");
		list.add("������");
		
		int size = list.size();
		for(int i = 0 ; i<size ; i++){
			System.out.println(list.remove());
		}
		
		
	}
}
