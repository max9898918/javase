package day07;
/*
�������飺

������������ã����������ͳһ�ĳ�ʼ����

���캯�������ã� ����Ӧ�Ķ�����г�ʼ����


��������ĸ�ʽ��
	
	{
		��������
	}

ע�⣺ ��������Ĵ����ű���λ�ڳ�Ա λ���ϡ�


���������
	1. �������顣
	2. �ֲ������.   ������λ�ڷ���֮�ڡ�  ���ã����ֲ̾� ���� ���������ڣ���ʡһ����ڴ档
	3. ��̬�����  static 
*/

class Babys{
	
	int id; //���֤
 
	String  name;  //����
	
	//��������...
	{
		//System.out.println("��������Ĵ���ִ����......");
		
	}

	//���ι��캯��
	public  Babys(int i , String n){
		id  = i;
		name = n;
	}
	
	//�޲ι��췽��
	public Babys(){
	}

	public void cry(){
		System.out.println(name+"���ۿ�...");
	}	
}



class Demo4 
{
	public static void main(String[] args) 
	{
		Babys b1 = new Babys(110,"����");  //  ���� ��ʣ ����
		System.out.println("��ţ�"+ b1.id + " ���֣�"+b1.name);
		/*
		System.out.println("��ţ�"+ b1.id + " ���֣�"+b1.name);
	
		new Baby(112,"��ʣ");
		new Baby();
		*/
		/*
		new Baby(110,"����");
		new Baby(112,"��ʣ");
		new Baby();
		*/
	}
}
