package day09;
/*
����ӿ�֮���ϵ�� ʵ�ֹ�ϵ��

����ӿ�Ҫע������
	1. �ǳ�����ʵ��һ���ӿ�ʱ������Ҫ�ѽӿ������з���ȫ��ʵ�֡�
	2. ������ʵ��һ���ӿ�ʱ������ʵ��Ҳ���Բ�ʵ�ֽӿ��е� ������
	3. һ�������ʵ�ֶ���ӿ� ��
		
		���ʣ� javaΪʲô��֧�ֶ�̳У���֧���˶�ʵ���أ�
			class A{
				
				public void print(){
					System.out.println("AAAAAA");
				}
			}

			class B{

				public void print(){
					System.out.println("BBBBBB");
				}
			}


			class C extends A ,B{
			
			}
			
			new C().print();
	
�ӿ���ӿ�֮���ϵ�� �̳й�ϵ��

�ӿ���ӿ�֮��Ҫע�����
	1. һ���ӿ��ǿ��Լ̳ж���ӿڵġ�


*/



interface A{

	public void print();
}


interface C{
	
	public void getArea();
}


interface B extends A,C{ // B�ӿڼ̳�A�ӿ�

	public void test();
}



class Demo10 implements B{

	public static void main(String[] args) 
	{
		Demo10 d = new Demo10();
		d.print();

	}

	public void getArea(){}


	public void test(){}


	public void print(){
		System.out.println("�����A�ӿڵ�print����...");
	}
}
