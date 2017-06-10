package day13.thread;
/*
 �̳߳��õķ�����
 	 Thread(String name)     ��ʼ���̵߳�����
	 setName(String name)    �����̶߳�����
	 getName()             �����̵߳�����
	 
	 
	 sleep()                 �߳�˯��ָ���ĺ������� ��̬�ķ����� �Ǹ��߳�ִ����sleep����������ô�����Ǹ��߳�˯�ߡ�
	 
	 currentThread()      ���ص�ǰ���̶߳��󣬸÷�����һ����̬�ķ����� ע�⣺ �Ǹ��߳�ִ����currentThread()����ͷ����Ǹ��߳� �Ķ���
	 
	 getPriority()             ���ص�ǰ�̶߳�������ȼ�   Ĭ���̵߳����ȼ���5
	 setPriority(int newPriority) �����̵߳����ȼ�    ��Ȼ�������̵߳����ȼ������Ǿ����ʵ��ȡ���ڵײ�Ĳ���ϵͳ��ʵ�֣��������ȼ���10 ����С��1 �� Ĭ����5����
	 
 */
public class Demo3 extends Thread {
	
	public Demo3(String name){
		super(name); //������Thread���һ�� �����Ĺ��췽����
	}
	
	
	@Override
	public void run() {
		/*System.out.println("this:"+ this);
		System.out.println("��ǰ�̶߳���" + Thread.currentThread());	*/
		
		for (int i = 0; i < 100 ; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
			
			
			/*try {
				Thread.sleep(100);  //Ϊʲô�����ﲻ���׳��쳣��ֻ�ܲ��񣿣� Thread���run����û���׳��쳣���ͣ��������಻���׳��쳣���͡�
			} catch (InterruptedException e) {
				e.printStackTrace();
			} */
		}
		
		
	}
	
	
	public static void main(String[] args) throws InterruptedException {
		//������һ���̶߳���
		Demo3 d = new Demo3("�߳�");
		d.setPriority(10); //�����߳� �����ȼ��� ���ȼ�������Խ�����ȼ�Խ��  �� ���ȼ��ķ�Χ��1~10
		d.start();
		
		for (int i = 0; i < 100 ; i++) {
			System.out.println(Thread.currentThread().getName()+":"+i);
		}
		
		/*
		System.out.println("�Զ����̵߳����ȼ���"+d.getPriority());  //�̵߳����ȼ�Ĭ����5
		System.out.println("���̵߳����ȼ���"+Thread.currentThread().getPriority());
		
		
		d.start();
		
		d.setName("����"); //setName�����̵߳�����
		d.start(); //�����߳� 
		
		Thread mainThread = Thread.currentThread();
		System.out.println("���̵߳����֣�"+ mainThread.getName());
	*/
	}

}
