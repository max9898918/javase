package day08;
/*
����ʹ��java����һ����ͨ��ѧ���� java�������ѧ���� ��ҵ���ѧ����
���е�ѧ������ѧϰ������ѧϰ�����ݲ�һ����
��ͨ ��ѧ���� ���˼�������塣
�������ѧ����ѧϰ���� javase��
��ҵ��ѧ���� javaee+android.
*/

//��ͨ��ѧ����
class Student{

	String name;

	//���캯��
	public Student(String name){
		this.name = name;
	}
	
	public void study(){
		System.out.println(name+"ѧϰ���˼��������");
	}
}

//�������ѧ��������ѧ����һ��
class BaseStudent extends Student{


	public BaseStudent(String name){
		super(name);//ָ�����ø��๹�캯��
	}

	//��д
	public void study(){
		System.out.println(name+"ѧϰjavase..");
	}
}


//��ҵ��ѧ�� Ҳ��������ͨѧ����һ��
class WorkStudent extends Student{
	
	//���� ����
	public WorkStudent(String name){
		super(name);
	}
		//��д
	public void study(){
		System.out.println(name+"ѧϰjavaee+android..");
	}
}


class Demo11 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		
		BaseStudent s = new BaseStudent("�Ӷ���");
		s.study();

		//����һ����ҵ���ѧ��
		WorkStudent w = new WorkStudent("����");
		w.study();
	}
}
