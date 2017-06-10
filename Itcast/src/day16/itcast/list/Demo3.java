package day16.itcast.list;

import java.util.LinkedList;


class Person{
	
	String name;
	
	int age;

	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	
	@Override 
	public String toString() {
		return "{ ���֣�"+ this.name+" ���䣺"+ this.age+"}";
	}
	
}


public class Demo3 {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(new Person("����", 7));
		list.add(new Person("��ʣ", 17));
		list.add(new Person("����", 3));
		list.add(new Person("����", 30));
		
		//��дһ�����������˵����估��������洢��
		for(int i= 0 ; i<list.size() -1 ; i++){
			for(int j = i+1 ; j<list.size() ; j++){
				//������������λ��
				Person p1 = (Person) list.get(i);
				Person p2 = (Person) list.get(j);
				if(p1.age>p2.age){
					//����λ��
					list.set(i, p2);
					list.set(j, p1);
					
				}
			}
		}
		System.out.println(list);
		
		
		
	}
	
	
}
