package day07;
/*
this�ؼ��ֵ��������Ĺ��캯��Ҫע������
	1. this�ؼ��ֵ��������Ĺ��캯��ʱ��this�ؼ��ֱ���Ҫλ�ڹ��캯���� �ĵ�һ����䡣
	2. this�ؼ����ڹ��캯���в��ܳ����໥���� ���������Ϊ��һ����ѭ����

*/
class Student7{

	int id;  //���֤

	String name;  //����

	//Ŀǰ���������ͬ�� �ĳ�Ա ������ֲ��������ڷ����ڲ�Ĭ����ʹ�þֲ������ġ�
	public Student7(int id,String name){  //һ����������ʽ����Ҳ�����ھֲ�������
		this(name); //�����˱����һ�������Ĺ��췽��
		//this(); //�����˱����޲ε� ���췽����
		this.id = id; // this.id = id �ֲ�������id����Ա������id��ֵ
		System.out.println("���������Ĺ��췽����������...");
	}
	
	
	public Student7(){
		System.out.println("�޲εĹ��췽����������...");
	}

	public Student7(String name){
		this.name = name;
		System.out.println("һ�������Ĺ��췽����������...");
	}

}


class Demo7 
{
	public static void main(String[] args) 
	{
		Student7 s = new Student7(110,"����");
		System.out.println("��ţ�"+ s.id +" ���֣�" + s.name);

	
		Student7 s2 = new Student7("������");
		System.out.println("���֣�" + s2.name);
	
	}
}
