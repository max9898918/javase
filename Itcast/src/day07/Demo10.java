package day07;
/*
static(��̬\���η�)

	1. static���γ�Ա���� �������������Ҫ����������ж���ʹ��ʱ����ô�Ϳ���ʹ��static���Ρ�
		
		��̬��Ա�����ķ��ʷ�ʽ��
				
				��ʽ1�� ����ʹ�ö�����з��ʡ�
					��ʽ�� ����.��������
				
				��ʽ���� ����ʹ���������з��ʡ�
					��ʽ�� ����.������;
	
			ע�⣺ 
				1. �Ǿ�̬�ĳ�Ա����ֻ��ʹ�ö�����з��ʣ�����ʹ���������з��ʡ�
				2. ǧ��ҪΪ�˷���������ݶ�ʹ��static���γ�Ա������ֻ�г�Ա������������������Ҫ�������ʱ��
				��ʹ��static���Ρ�
			
		static���γ�Ա������Ӧ�ó����� ���һ��������Ҫ�����ж�����ʹ�õ�ʱ����ʱ�򼴿ɺ�ʵ��static���Ρ�


	2. static���γ�Ա����:

*/

class Students{

	static	String name;  //�Ǿ�̬��Ա����
	
	static	String  country  = "�й�";	  //��̬�ĳ�Ա����
	
	public Students(String name){
		this.name = name;
	}
}


class Demo10 {


	public static void main(String[] args) 
	{
		Students s1 = new Students("����");
		Students s2 = new Students("����");
		
		//System.out.println("������"+ Student.country);
		System.out.println("���֣�"+ s1.name);
		System.out.println("���֣�"+ s2.name);
	}
}
