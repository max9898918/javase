package day09;
/*
final(���ա����η�)  
	
final�ؼ��ֵ��÷���
	1. final�ؼ�������һ���������͵ı���ʱ���ñ����������¸�ֵ����һ�ε�ֵΪ���յġ�
	2. fianl�ؼ�������һ���������ͱ���ʱ���ñ�����������ָ���µĶ���
	3. final�ؼ�������һ��������ʱ�򣬸ú������ܱ���д��
	4. final�ؼ�������һ�����ʱ�򣬸��಻�ܱ��̳С�


���� �����η�һ��Ϊ�� public static final 

*/

//Բ��
class Circle2{

	double r; //�뾶

	public static final double pi = 3.14; //�̶������

	public Circle2(double r){
		this.r = r;
	}

	//�������
	public final void getArea(){
		System.out.println("Բ�ε�����ǣ�"+r*r*pi);
	}
}



class Demo2 extends Circle2
{
	
	public Demo2(double r){
		super(r);
	}

	public static void main(String[] args) 
	{
		/*
		final Circle2 c = new Circle2(4.0);
		test(c);
		*/	
		Demo2 c = new Demo2(4.0);
		c.getArea();
	}
	

	
	public static void test(Circle2 c){
		c = new Circle2(5.0);  //c����������ָ�����µĶ���
		c.getArea();
	}

}
