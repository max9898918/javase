package day06;

/*
�����������������
	1. ��װ
	2. �̳�
	3  ��̬��

����  ʹ��java�������ٺ����Ļ�Ա��

���⣺ �Ա������⣿��

����ԭ�� ���������˿���ֱ�Ӳ���sex���ԡ����Զ�sex���Խ�����ֱ�ӵĸ�ֵ��

��װ:


Ȩ�����η���Ȩ�����η����ǿ��Ʊ����ɼ���Χ�ġ�

public :  �����ġ� public���εĳ�Ա�������߷����κ��˶�����ֱ�ӷ��ʡ�

private �� ˽�еģ� private���εĳ�Ա�������߷���ֻ���ڱ����н���ֱ�ӷ��ʡ�


��װ�Ĳ��裺
	1. ʹ��private������Ҫ����װ�����ԡ�
	2. �ṩһ�������ķ������û��߻�ȡ��˽�еĳ�Ա���ԡ�
			 �����淶��
				set������();
				get������(); 

���ʣ� ��װһ��Ҫ�ṩget����set������
		��һ���� ������������ġ�

�淶 �� ����ʵ������һ��ʵ��������г�Ա���ԣ���Ա��������Ҫ��װ������

ʵ���ࣺʵ���������������һ�� ����ľͳ���Ϊʵ���ࡣ


������(Arrays����Ĺ�����):


��װ�ĺô���
	1. ������ݵİ�ȫ�ԡ�
	2. �����򵥡� 
	3. ������ʵ�֡�

*/
 class Member{
	
	public	String name; //����

	private	String sex; //�Ա�

	public	int salary; //нˮ



	
	//����һ�������ķ�������sex����
	public void setSex(String s){
		if (s.equals("��")||s.equals("Ů")){ //ע�⣺ ����Ƚ������ַ����������Ƿ�һ�£���Ҫʹ��==�Ƚϣ� ʹ��equals������
			sex = s;
		}else{
			//Ĭ������
			sex = "��";
		}
	}

	//����һ�������ķ�����ȡsex����
	public String getSex(){
		return sex;
	}



	//����
	public void talk(){
		System.out.println(name+"�ĵ÷ǳ�����");
	}
}

class Demo5{

	public static void main(String[] args) 
	{
		Member m = new Member();
		m.name="����";
		m.setSex("Ů");
		m.salary  = 8000;
		System.out.println("������"+ m.name+"     �Ա�"+ m.getSex()+"    нˮ��"+ m.salary);
	}
}
