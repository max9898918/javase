package day10;
/*

�����ڲ��ࣺû����������ͳ���Ϊ�����ڲ��ࡣ

�����ڲ���ĺô�������д��

�����ڲ����ʹ��ǰ�᣺������ڼ̳л���ʵ�ֹ�ϵ����ʹ�á�


�����ڲ���һ��������ʵ�Ρ�


*/

abstract class Animal6{
	
	public abstract Animal6 run();

	public abstract void sleep();
}


class Outer6{

	public void print(){
		//���� �ڷ����ڲ�����һ����̳�Animal6�࣬Ȼ�����run������sleep()��
		
		/*
		//�ֲ��ڲ���
		class Dog extends Animal6{
			
			public void run(){
				System.out.println("������..");
			}

			public void sleep(){
				System.out.println("��ſ�������۾�˯..");
			}
		}
		
		//��������
		Dog d = new Dog();
		d.run();	
		d.sleep();
		*/	
		//�����ڲ��� �������ڲ���ֻ��û��������������һ�ų�Ա���Ǿ߱��ġ�
		// �����ڲ�����Animal�Ǽ̳� �Ĺ�ϵ��  Ŀǰ�Ǵ���Animal����Ķ���. 
	Animal6	a = new Animal6(){  //��̬
		
			//�����ڲ��ĳ�Ա 
			public Animal6 run(){
				System.out.println("������..");
				return this;
			}
			
			public void sleep(){
				System.out.println("��ſ�������۾�˯..");
			}

			//���еķ���
			public void bite(){
				System.out.println("����ҧ��..");
			}
	
		};
	
//		((Object) a).bite();
		a.run();
		a.sleep();
		
	}
}



class Demo6 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		
		Outer6 Outer6 = new Outer6();
		Outer6.print();
	
	}
}
