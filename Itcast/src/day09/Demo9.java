package day09;
/*
��������ʵ�������в���ͬѧ��ѧУ�ڼ�ֻ��ѧϰ�������в���ѧ������ѧϰ�⻹��׬Ǯ��
interface ������ӿڣ�
implements (ʵ�ֽӿ�)

������
	��ͨ��ѧ����
	�ӿ�
	����Ǯ��ѧ��
*/

//��ͨ��ѧ����
class Student{

	String name;

	public Student(String name){
		this.name = name;
	}

	public void study(){
		System.out.println(name+"�ú�ѧϰ");
	}
}


//��Ǯ��ѧ����չ�Ĺ���---�����ڽӿ���
interface Money{

	public void makeMoney();
}


//����Ǯ��ѧ��
class MoneyStudent extends Student implements Money{

	public MoneyStudent(String name){
		super(name);
	}

	public void makeMoney(){
		System.out.println(name+"�ú���Ǯ��Ȼ��ѧ�ѣ�");
	}

}


class Demo9 
{
	public static void main(String[] args) 
	{
		Student s = new Student("���");
		s.study();
		//s.makeMoney();
		
		MoneyStudent m = new MoneyStudent("��˫˫");
		m.study();
		m.makeMoney();
	
	}


}
