package day07;
/*
����һ��Ա���࣬Ա���߱� �����ԣ�id\ name \ age ��
�߱��Ĺ�����Ϊ�� ������ 

Ҫ��һ������һ��Ա������ ��ʱ����ô��Ա�������Ҫ��Ӧ ������ֵ��

*/

class Employee{

	
	int id;  //���

	String name;  //����

	int age; //����

	//���캯��
	public Employee(int a, String b , int c){
		id =a;
		name = b;
		age = c;
	}

	public void work(){
		System.out.println(name+"�úù�����Ŭ����Ǯ!!");
	}
}


class Demo3 
{
	public static void main(String[] args) 
	{
		//����һ��Ա������
		Employee e = new  Employee(100,"����",20);
		System.out.println("��ţ�"+ e.id+"   ���֣�"+e.name +"    ���䣺"+ e.age);
	}
}
