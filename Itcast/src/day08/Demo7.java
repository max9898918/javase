package day08;
/*
Ŀǰ���ڵ����⣺
	1. �޷����������������֮��ļ̳й�ϵ��
	2. �������ظ����롣

������������������
	1. ��װ
	2. �̳�
	3. ��̬.

�̳У��̳���ͨ���ؼ���extends���ֵġ�

�̳еĸ�ʽ��

	class ����1 extends ����2{
	
	}


�̳�Ҫע������
	1. ǧ��ҪΪ�˼����ظ������ȥ�̳У�ֻ�����������ż̳й�ϵ��ʱ���ȥ�̳С�
	2. ����˽�еĳ�Ա���ܱ��̳С�
	3. ����Ĺ��캯�����ܱ��̳С�
	4. �����������ʱĬ�ϻ��ȵ��ø����޲εĹ��캯����

*/
//���� 
class Person{
	
	String name;

	private	int age;

	public  Person(String name){
		this.name = name;
	}

	public Person(){
		System.out.println("Person��Ĺ��췽����������....");
	}

	public void eat(){
		System.out.println(name+"�ڳԷ�...");
	}
}

//ѧ����
class Student7 extends Person {  // Student7 �ͳ���ΪPerson������࣬ Person��ͳ���ΪStudent7�ĸ���(���ࡢ����)

	int num; //ѧ��

	public Student7(){
		System.out.println("Student7��Ĺ��췽����������....");
	}

	public void study(){
		System.out.println(name+"good good study , day day up");
	}	
}




class Demo7 
{
	public static void main(String[] args) 
	{
		Student7 s = new Student7();
		
		
		s.name = "����";
		System.out.println("���֣�"+ s.name);
		s.eat();
		
	}
}
