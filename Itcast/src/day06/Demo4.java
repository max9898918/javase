package day06;

/*
��������û���������ͱ���ָ��Ķ������Ϊ��������

���� ʹ�� java������һ��ѧ���ࡣ

��������Ҫע������
	1. ����һ�㲻�����������������ֵ����Ϊ��Զ�޷���ȡ����
	2. ��������������Զ����������ͬһ������


��������ô�������д��


���������Ӧ�ó�����
	1. ���һ��������Ҫ����һ������һ�ε�ʱ�򣬶��������������֮�󣬸ö���Ͳ���ʹ���ˣ���ʱ�����ʹ��
	��������
	
	2. ������Ϊʵ�ε���һ��������

*/

//ѧ����
class Student{
	
	int num; //ѧ��

	String name; //����
	
	public void study(){
		System.out.println("�ú�ѧϰ��Ϊ������Ϊ��˧����׼��!");
	}
}

class Demo4{

	public static void main(String[] args) 
	{
		System.out.println(new Student() == new Student()) ;  // "==" �����������ͱ���ʱ���Ƚϵ����ڴ��ַ���ж����� �����Ƿ�Ϊͬһ������
		
		//���� ����Student��study������
		
		
		Student s = new Student();
		s.study();
		
		new Student().study();

	}
}