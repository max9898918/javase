package day08;
/*
Ŀǰ�����⣺����Ĺ����޷��������������

������д��ǰ�᣺ ����Ҫ���ڼ̳еĹ�ϵ��

��������д: �Ӹ������ͬ���ĺ�����������Ǿͳ���Ϊ��������д��

ʲô��ʱ��Ҫʹ�÷�������д������Ĺ����޷��������������ʱ��

������дҪע������
	1.������дʱ�� ���������β��б����һ�¡�
	2.������дʱ�������Ȩ�����η�����Ҫ���ڻ��ߵ��ڸ����Ȩ�����η���
	3.������дʱ������ķ���ֵ���ͱ���ҪС�ڻ��� ���ڸ���ķ���ֵ���͡�
	4.������дʱ�� �����׳����쳣����ҪС�ڻ��ߵ��ڸ����׳����쳣���͡�
			Exception(�)
			RuntimeException(С��)

���������أ���һ������ ���������������� ���ϵ�ͬ������,����Ϊ�������ء�

�������ص�Ҫ��
	1. ������Ҫһ�¡�
	2. �β��б�һ�£��βεĸ������β� �����Ͳ�һ�£�
	3. �뷵��ֵ�����޹ء�

*/
class Animal{  //������� ���� 
}

class Fish extends Animal{  //FishС ���������͡�
}


class Fu{

	String name;

	public Fu(String name){
		this.name = name;
	}

	public Animal eat() throws RuntimeException, Exception {
		System.out.println(name+"�Է���...");
		return new Animal();
	}
}


class Zi extends Fu{

	String num;
	
	public Zi(String name){
		super(name);//ָ������ ������εĹ��췽��
	}


	//��д�����eat����
	public Animal eat() throws Exception{
		System.out.println("�Ե㿪θ��..");
		System.out.println("�ȵ���....");
		System.out.println("�Ե���Ϻ....");
		System.out.println("�����....");
		System.out.println("������....");
		System.out.println("�Ե���Ʒ....");	
		return new Animal();
	}

}

class Demo10{

	public static void main(String[] args) 
	{
		Zi z = new Zi("��ͷ����");
		//�쳣����
		try {
			//������ǵ���
			z.eat();
		} catch (Exception e) {
			e.printStackTrace();
		}
	
	}
}
