package day08;
/*
instanceof �ؼ���

instanceof�ؼ��ֵ����ã��ж�һ�������Ƿ�����ָ�������

instanceof�ؼ��ֵ�ʹ��ǰ�᣺�жϵĶ�����ָ����������Ҫ���ڼ̳л���ʵ�ֵĹ�ϵ��

instanceof�ؼ��ֵ�ʹ�ø�ʽ��
		
		����  instanceof ���

instanceof�ؼ��ֵ����ã� Ŀǰû�á����Ǻ�������ѧϰ ���˶�̬֮��ͷǳ����á�
һ��������ǿ������ת��֮ǰ����ʹ�øùؼ������ж�һ�ѣ�Ȼ���ڽ���ת���ġ�


*/
class Animal12{

	String name;

	String color;

	public Animal12(String name, String color){
		this.name = name;
		this.color = color;
	}
}


//�������ڶ�����һ��
class Dog extends Animal12 {

	public Dog(String name,String color){
		super(name,color); //ָ�����ø������� �����Ĺ��캯����
	}

	public void bite(){
		System.out.println(name+"ҧ��!!");
	}
}

//���� Ҳ�����ڶ�����һ��
class Mouse extends  Animal12{
	
	public Mouse(String name,String color){
		super(name,color);
	}
	
	public void dig(){
		System.out.println(name+"��..");
	}

}

class Demo12{

	public static void main(String[] args) 
	{
		Dog d = new Dog("��ʿ��","��ɫ");
		System.out.println("���ǹ�����"+ (d instanceof Dog));
		System.out.println("���Ƕ�������"+ (d instanceof Animal12));	
		
		Animal12 a = new Animal12("����","��ɫ"); //��������
		System.out.println("���ﶼ�ǹ���"+ (a instanceof Dog));


	}
}
