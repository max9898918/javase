package day07;
/*
���� ʹ��java����һ�����࣬�˾߱� id��name �� age�������ԣ� ���߱�һ���Ƚ�����ķ�����
Ҫ�� ���� Ҫ д�Ϲ��캯�������캯��Ҳ����Ҫʹ����this�ؼ��֡�
*/

class Person{
		
	int id; //���

	String name; //����
  
	int age;  //����

	//���캯��
	public Person(int id,String name ,int age){
		this.id  = id;
		this.name = name;
		this.age = age;
	}

	//�Ƚ�����ķ���
	public void compareAge(Person p2){
		if(this.age>p2.age){
			System.out.println(this.name+"��!");
		}else if(this.age<p2.age){
			System.out.println(p2.name+"��!");
		}else{
			System.out.println("ͬ��");
		}
	}
}


class Demo8{

	public static void main(String[] args) 
	{
		Person p1 = new Person(110,"Сţ",17);
		Person p2 = new Person(119,"����",9);
		p1.compareAge(p2);

	}
}
