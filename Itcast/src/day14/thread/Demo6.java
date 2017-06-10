package day14.thread;
/*
 �̵߳�ֹͣ��
 	1. ֹͣһ���߳� ����һ�㶼��ͨ��һ������ȥ���Ƶġ�
 	2. �����Ҫֹͣһ�����ڵȴ�״̬�µ��̣߳���ô������Ҫͨ���������notify��������interrupt()��ʹ�á�
 */


public class Demo6 extends Thread {
	
	boolean flag = true;
	
	public Demo6(String name){
		super(name);
	}
	
	
	@Override
	public synchronized void run() {
		int i = 0 ;
		while(flag){
			try {
				this.wait(); //���޵ȴ�..
			
			} catch (InterruptedException e) {
				System.out.println("���յ����쳣��....");
			}
			System.out.println(Thread.currentThread().getName()+":"+i);
			i++;
		}
	}
	
	
	
	public static void main(String[] args) {
		Demo6 d = new Demo6("����");
		d.setPriority(10);
		d.start();
		
		for(int i = 0 ; i<100 ; i++){
			System.out.println(Thread.currentThread().getName()+":"+i);
			//�����̵߳�i��80��ʱ��ֹͣ�����̡߳�
			//d.interrupt();  // interrupt()���������޷�ֹͣһ���̡߳�
			if(i==80){
				d.flag = false;
				d.interrupt(); //���̵߳ĵȴ�״̬ǿ������������״̬���̻߳���յ�һ��InterruptedException�� 
				/*synchronized (d) {					
					d.notify();
				}*/
				
				
			}
			
		}
		
		
	}

}
