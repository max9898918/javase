package day07;
/*
static(��̬)

��������һ�´���ѧ���ࡣ  �����й���....


Ŀǰ���ڵ����⣺ ���е�ѧ�������й� �ģ���n��ѧ���ͻ���n���й��� ���ݴ��ڴ��У�������
���˷��ڴ档

Ŀǰ������ �ѡ��й�����������ƶ� �����ݹ������У�����������ݸ����е�Student����ʹ�ü��ɡ�

����2�� ��β��ܰ���������ƶ� �����ݹ������й����أ�

��������� ֻ��Ҫʹ��static���θ����ݼ��ɡ�


��̬�ĳ�Ա����ֻ�������ݹ�������ά��һ�ݣ����Ǿ�̬��Ա���������ݻ���ÿ�������ж�ά��һ�ݵġ���

*/

class Student{

	String name;
	
	//ʹ����static����country����ô��ʱ��country����һ����������ݡ�

	static	String  country  = "�й�";	//����
	
	//���캯��
	public Student(String name){
		this.name = name;
	}
}

class Demo9 {

	public static void main(String[] args) 
	{
		Student s1 = new Student("����");
		Student s2 = new Student("����");

		s1.country = "С�ձ�";
		System.out.println("������"+s1.name+"    ������"+ s1.country); //  �й�   
		System.out.println("������"+s2.name+"    ������"+ s2.country); // С�ձ�
	}
}
