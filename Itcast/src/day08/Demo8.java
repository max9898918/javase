package day08;

/*
���ʣ� ΪʲôҪ���ø���Ĺ��췽�����������������������ǣ�

	���ø��� �Ĺ��췽���ǿ��Գ�ʼ���Ӹ���̳���ȥ�����Եġ�

*/ 
class Fu8{
	
	int x = 10;

	String name;

	public Fu8(String name){
		this.name = name;
		System.out.println("Fu8��d���εĹ��췽��...");
	}

	public Fu8(){
		System.out.println("Fu8���޲εĹ��췽��...");
	}
}


class Zi8 extends Fu8{

	int x = 20;

	public Zi8(String name){
		super(name); //ָ�����ø���һ�������Ĺ��캯����
	}


	public void print(){
		System.out.println("x1 = "+ x);
	}

}


class Demo8 
{
	public static void main(String[] args) 
	{
		Zi8 z = new Zi8("��ͷ����"); 
		System.out.println("name= "+z.name);

	}
}
