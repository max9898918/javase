package day10;
/*
�쳣�Ĵ���ʽ----�׳�����
	
�׳�����throw throws��


�׳�����Ҫע���ϸ�ڣ�
	1. ���һ���������ڲ��׳���һ���쳣 ������ô����Ҫ�ڷ����������׳���
	2. ���������һ�������׳��쳣 �ķ�������ô�����߱���Ҫ�����쳣��
	3. ���һ�������ڲ��׳���һ���쳣������ôthrow������Ĵ��붼������ִ���ˣ�һ������������throw�ؼ��֣��÷���Ҳ������ִֹͣ�еģ���
	4. ��һ������£�ֻ���׳�һ�������쳣����

throw ��throws�����ؼ��֣�
	1. throw�ؼ��������ڷ����ڲ��ģ�throws�����ڷ����������ϵġ�
	2. throw�ؼ��������ڷ����ڲ��׳�һ���쳣����ģ�throws�ؼ����������ڷ��������������׳��쳣���͵ġ�
	3. throw�ؼ��ֺ���ֻ����һ���쳣����throws����һ�ο��������׳��������͵� �쳣��


���ʣ���ʱʹ���׳�������ʱ������ԭ������Σ�
	�������Ҫ֪ͨ�������ߣ������������⣬��ô��ʱ���ʹ���׳�����.
	���������ֱ�����û��򽻵��������쳣ǧ��Ҫ���ף����׵Ļ����͸����û��ˡ�
	��ʱ���Ӧ��ʹ�ò�����

*/
class Demo11 
{
	public static void main(String[] args) 
	{
		try{
			int[] arr = null;
			div(4,0,arr); //������һ�� �����׳��쳣���� �ķ���
		}catch(Exception e){
			System.out.println("�����쳣��...");
			e.printStackTrace();
		}
		
	}


	public static void div(int a, int b,int[] arr) throws Exception,NullPointerException {
		if(b==0){
			throw new Exception(); //�׳�һ���쳣����...
		}else if(arr==null){
			throw new  NullPointerException();
		}
		int c = a/b;
		System.out.println("c="+c);
	}
}
