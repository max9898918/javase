package day07;
/*
���� ͳ��һ���౻ʹ���˶��ٴδ������󣬸��������ʾ�������Ĵ�����
*/
class Emp{
	
	//�Ǿ�̬�ĳ�Ա������
	static	int count = 0;	//������

	String name;
	
	//��������
	{
		count++;
	}

	public Emp(String name){
		this.name = name;

	}

	public Emp(){  //ÿ����һ�������ʱ�򶼻�ִ������ �Ĵ���
		
	}
	
	public void showCount(){
		System.out.println("������"+ count+"������");
	}
}

class Demo11 
{
	public static void main(String[] args) 
	{
		Emp e1 = new Emp();
		Emp e2 = new Emp();
		Emp e3 =new Emp();
		e3.showCount();
	}
}
