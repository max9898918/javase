package day14.thread;
/*
java��ͬ�����ƽ�����̰߳�ȫ���⣬����Ҳͬʱ������������

��������

����������� �ĸ���ԭ��
	1. �������������������ϵ��̡߳�
	2. �������������������ϵĹ�����Դ��
	
��������Ľ�������� û�з�����ֻ�ܾ������ⷢ�����ѡ�

 */

class DeadLock extends Thread{
	
	public DeadLock(String name){
		super(name);
	}
	
	
	public void run() {
		
		if("����".equals(Thread.currentThread().getName())){
			synchronized ("ң����") {
				System.out.println("�����õ���ң������׼�� ȥ�õ��!!");
				synchronized ("���") {
					System.out.println("�����õ���ң���������ˣ����ſյ�ˬ����Ĵ���...");
				}
			}
		}else if("����".equals(Thread.currentThread().getName())){
			//��Ҫ���õ��˵��Ҫȥ��ң����������ң�������� ���̱߳������߳�ռ��
			synchronized ("���") { 
				System.out.println("�����õ��˵�أ�׼��ȥ��ң����!!");
				synchronized ("ң����") {
					System.out.println("�����õ���ң���������ˣ����ſյ�ˬ����Ĵ���...");
				}
			}
			
		}	
	}
	
	
}

public class Demo2 {

	public static void main(String[] args) {
		DeadLock thread1 = new DeadLock("����");
		DeadLock thread2 = new DeadLock("����");
		//�����߳�
		thread1.start();
		
		/*try {
			thread1.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		thread2.start();
		
	}
	
}
