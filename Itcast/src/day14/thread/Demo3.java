package day14.thread;
/*
�Զ����̵߳Ĵ�����ʽ:

��ʽһ �� 
	1. �Զ���һ����̳�Thread�ࡣ
	2. ��дThread���run���������Զ����̵߳��������д��run�����ϡ�
	3. ����Thread��������󣬲��ҵ���start��������һ���̡߳� 
		
	ע�⣺ǧ��Ҫֱ�ӵ���run����������start������ʱ���߳̾ͻῪ�����߳�һ�������ͻ�ִ��run�����д��룬���ֱ�ӵ���
	run��������ô�� �൱�ڵ�����һ����ͨ�ķ������ѡ�

��ʽ����
	1. �Զ���һ����ʵ��Runnable�ӿڡ�
	2. ʵ��Runnable�ӿ� ��run���������Զ����̵߳���������run�����ϡ�
	3. ����Runnableʵ�������
	4. ����Thread�� �Ķ��󣬲��Ұ�Runnableʵ����Ķ�����Ϊʵ�δ��ݡ�
	5. ����Thread���� ��start��������һ���̡߳�


����1�� ����Runnableʵ����Ķ������̶߳�����
	Runnableʵ����Ķ��� ����һ���̶߳���ֻ������ʵ����Runnable�ӿ� �Ķ�����ѡ�
	ֻ����Thread������Thread����������߳� ����

����2�� ΪʲôҪ��Runnableʵ����Ķ�����Ϊʵ�δ��ݸ�Thread�����أ�������ʲô��
	���þ��ǰ�Runnableʵ����Ķ����run������Ϊ���̵߳��������ȥִ���ˡ�

�Ƽ�ʹ�ã� �ڶ��֡� ʵ��Runable�ӿڵġ� 
ԭ�� ��Ϊjava���̳� ,��ʵ�ֵġ�



 */

public class Demo3 implements Runnable{

	@Override
	public void run() {
		/*System.out.println("this��"+ this);
		System.out.println("��ǰ�̣߳�"+ Thread.currentThread());*/
		for(int i = 100 ; i < 200 ; i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
	}
	
	public static void main(String[] args) {
		//����Runnableʵ����Ķ���
		Demo3 d = new Demo3();
		//����Thread��Ķ��� ��Runnableʵ���������Ϊʵ�δ��ݡ�
		Thread thread = new Thread(d,"�Զ����߳�");  //Thread��ʹ��Target������¼��d����
		//����thread�����start���������̡߳�
		thread.start();
		
		
		for(int i = 0 ; i < 100 ; i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
		/*Demo3 demo3 = new Demo3();
		Thread thread = new Thread(demo3,"����");
		thread.start();
		for(int i = 0 ; i < 100 ; i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
		}*/
		
	} 
	
	/*
	  Thread�� ��run����
	  
	 *  @Override
	    public void run() {
	        if (target != null) {
	            target.run();  //���൱��Runnableʵ����Ķ����run������Ϊ��Thread�������������ˡ�
	        }
	    }
	*/
}
