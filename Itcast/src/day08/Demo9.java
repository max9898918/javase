package day08;

/*
super�ؼ��֣�

super�ؼ��ִ����˸���ռ�����á�

super�ؼ��ֵ� ���ã�
	1. �Ӹ��������ͬ���ĳ�Աʱ����������Ĭ���Ƿ�������ĳ�Ա������ͨ��super�ؼ���ָ�����ʸ���ĳ�Ա��
	2. �����������ʱ��Ĭ�ϻ��ȵ��ø����޲εĹ��췽��������ͨ��super�ؼ���ָ�����ø���Ĺ��췽����

super�ؼ��ֵ��ø��๹�췽��Ҫע������
	1. ���������Ĺ��췽����û��ָ�����ø���Ĺ��췽������ôjava��������������Ĺ��췽���������super()��䡣
	2. super�ؼ��ֵ��ø���Ĺ��캯��ʱ����������Ҫ�����๹�캯���еĵ�һ����䡣
	3. super��this�ؼ��ֲ���ͬʱ������ͬһ�����캯���е��������Ĺ��캯������Ϊ������䶼��Ҫ��һ����䡣


super�ؼ�����this�ؼ��ֵ�����
	1. ��������ﲻһ�¡�
			1. super�ؼ��ִ�����Ǹ���ռ�����á�	
			2. this�ؼ��ִ���������������ĵ����߶���
	2. ʹ��ǰ�᲻һ�¡�
			1. super�ؼ��ֱ���Ҫ�м̳й�ϵ����ʹ�á�
			2. this�ؼ��ֲ���Ҫ���ڼ̳й�ϵҲ��ʹ�á�
	3. ���ù��캯��������
			1. super�ؼ����ǵ��ø���Ĺ��캯����
			2. this�ؼ����ǵ��ñ���Ĺ��캯����
*/
class Fu9{
		
	int x = 10;
  
	String name;


	public Fu9(){
		System.out.println("Fu9���޲εĹ��췽��..");
	}

	public Fu9(String name){
		this.name = name;
		System.out.println("Fu9����εĹ��췽��..");
	}


	public void eat(){
		System.out.println("Сͷ�ְֳԷ���..");
	}
}
 

class Zi9 extends Fu9{
	
	int x = 20; 

	int num;
	
	public Zi9(String name,int num){
		super(name); //ָ�������˸�����ε� ���췽��...

		//		this(); // ���ñ����޲ι��췽��..
		//super(); //ָ�������˸����޲ι��췽��������
		System.out.println("Zi9����εĹ��췽��..");
	}

	public Zi9(){
		System.out.println("Zi9���޲εĹ��췽��..");
	}


	public void print(){
		System.out.println("x = " +super.x);
	}

	public void eat(){
		System.out.println("��ͷ���ӳ���Ϻ..");
	}
}

class Demo9 {

	public static void main(String[] args) 
	{
		Zi9 z = new Zi9();

	
	}
}
