package day10;
/*
�쳣��

���ǵ�java����Ҳ�ǻ����ĳЩ������ ������ģ���Щ�������� ������Ǿ�ͳ���쳣��


�쳣��ϵ��
--------| Throwable
------------| Error
------------| Exception


Throwable���õķ�����
	toString()  ���ص�ǰ�쳣�������������+��̬��Ϣ��
	getMessage() ���ص��Ǵ���Throwable������ַ�����Ϣ��
	printStackTrace() ��ӡ�쳣��ջ��Ϣ��
*/

class Demo8 
{
	public static void main(String[] args) 
	{
		/*
		//������һ��Throwable����
		Throwable t = new Throwable("ͷ�Σ���ð..");
		String info = t.toString();
		String message = t.getMessage();
		System.out.println("toString: "+ info);  // java.lang.Throwable  ����+���� = ��������
		System.out.println("message: "+ message);
		*/
		test();
	}

	public static void test(){
		//
		Throwable t = new Throwable();
		t.printStackTrace();
	}
}
