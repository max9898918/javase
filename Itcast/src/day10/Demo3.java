package day10;
/*
��̬�� ������������ͱ���ָ��������Ķ�������ǽӿ����͵��������ͱ���ָ���˽ӿ�ʵ���� �Ķ���

ʵ�ֹ�ϵ�µĶ�̬��
	
	�ӿ�  ����  = new  �ӿ�ʵ����Ķ���
*/

interface Dao{  //�ӿڵķ���ȫ�����ǷǾ�̬�ķ�����

	public void add();

	public void delete();
}



//�ӿڵ�ʵ����
class UserDao implements Dao{
	
	public void add(){
		System.out.println("���Ա���ɹ�����");
	}

	public void delete(){
		System.out.println("ɾ��Ա���ɹ�����");
	}

}

class Demo3 
{
	public static void main(String[] args) 
	{
		//ʵ�ֹ�ϵ�µĶ�̬
		Dao d = new UserDao(); //�ӿڵ��������ͱ���ָ���˽ӿ�ʵ����Ķ���
		d.add();


	}
}
