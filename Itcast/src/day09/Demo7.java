package day09;
/*
�ӿڣ�

�ӿڣ���չ���ܵġ�  usb�ӿ�.����


�ӿڵĶ����ʽ��
	
	interface �ӿ���{
	
	}

�ӿ�Ҫע������� ��
	1. �ӿ���һ��������ࡣ
	2. �ӿڵĳ�Ա����Ĭ�ϵ����η�Ϊ�� public static final ����ôҲ����˵�ӿ��еĳ�Ա�������ǳ�����
	3. �ӿ��� �ķ������ǳ���ķ�����Ĭ�ϵ����η�Ϊ�� public abstract��
	4. �ӿڲ��ܴ�������
	5. �ӿ���û�й��췽���ġ�
	6. �ӿ��Ǹ���ȥʵ��ʹ�õģ��ǳ�����ʵ��һ���ӿڵ�ʱ�򣬱���Ҫ�ѽӿ������з���ȫ��ʵ�֡�


ʵ�ֽӿڵĸ�ʽ��

	class  ���� implements �ӿ���{
	
	}

*/

interface A7{

	//��Ա����
	public static final int i=10;

	//��Ա����
	public void print();
}


class Demo7 implements A7{ // Demo7��ʵ����A�ӿ�

	public static void main(String[] args) 
	{
		Demo7 d = new Demo7();
		d.print();
	}

	//ʵ�ֽӿ��еķ���
	public void print(){
		System.out.println("����ǽӿ��е�print����...");
	}
	
}
