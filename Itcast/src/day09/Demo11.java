package day09;
/*
������������������
	1. ��װ
	2. �̳С�
	3. ��̬

��̬��һ������߱�������̬��(������������ͱ���ָ��������Ķ���)

�����ǽӿ� ���������ͱ���ָ���˽ӿ�ʵ����Ķ���)

��̬��ǰ�᣺������ڼ̳л���ʵ�� ��ϵ��

    ����  a  = new   ��();

��̬Ҫע�� ��ϸ�ڣ�
	1.  ��̬����£��Ӹ������ͬ���ĳ�Ա����ʱ�����ʵ��Ǹ���ĳ�Ա������
	2.  ��̬����£��Ӹ������ͬ���ķǾ�̬�ĳ�Ա����ʱ�����ʵ�������ĳ�Ա������
	3.  ��̬����£��Ӹ������ͬ���ľ�̬�ĳ�Ա����ʱ�����ʵ��Ǹ���ĳ�Ա������

	4.  ��̬����£����ܷ����������еĳ�Ա��

�ܽ᣺��̬����£��Ӹ������ͬ���ĳ�Աʱ�����ʵĶ��Ǹ���ĳ�Ա��������ͬ���Ǿ�̬����ʱ���Ƿ�������ġ�

���뿴��ߣ����в�һ�����ұߡ�

���뿴��ߣ�java�������ڱ����ʱ�򣬻����������ͱ������������Ƿ�߱�ָ���ĳ�Ա��������߱����ϱ��뱨��


*/


//������
abstract class Animal{

	String name;

	String  color = "����ɫ";

	public Animal(String name){
		this.name = name;
	}

	public abstract void run();

	public static void eat(){
		System.out.println("�����ڳ�..");
	}

}

//����
class  Mouse extends Animal{

	String color = "��ɫ";

	public Mouse(String name){
		super(name);
	}
	
	public  void run(){
		System.out.println(name+"��������������!");
	}

	public static void eat(){
		System.out.println("������͵��..");
	}

	//�������з���---��
	public void dig(){
		System.out.println("�����ڴ�..");
	}
}



class Fish extends Animal {

	public Fish(String name){
		super(name);
	}
	
	
	public  void run(){
		System.out.println(name+"ҡҡβ����..");
	}
}


class Demo11 
{
	public static void main(String[] args) 
	{
		
		Mouse m = new Mouse("����");
		System.out.println(m.color);
		
		//��̬�� ������������ͱ���ָ������Ķ���
		
		Animal a = new Mouse("����");
		((Mouse) a).dig();
		//a.eat();
	}	
}
