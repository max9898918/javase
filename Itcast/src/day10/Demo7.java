package day10;
//ʵ�ֹ�ϵ�������ڲ���
interface Dao7{

	public void add();
}


class Outer7{

	public void print(){
		//����һ�������ڲ���Ķ���
		new Dao7(){   //���ǽӿڲ��ܴ�����������ô�����ֿ����ˣ�
			 
			 public void add(){
				System.out.println("��ӳɹ�");
			 }
		}.add();
	}
}



class Demo7 
{
	public static void main(String[] args) 
	{
		test(new Dao7(){
			
			public void add(){
				System.out.println("���Ա���ɹ�");
			}
		});


	}

	//�����������...
	public static void  test(Dao7 d){  //�β�������һ���ӿ�����..
		d.add();
	}
}
