package day14.thread;
/*
 �ػ��̣߳���̨�̣߳�:��һ�����������ֻʣ�� ���ػ��̣߳���ô�ػ��߳�Ҳ��������
 
 ���� ģ��QQ���ظ��°���
 
 һ���߳�Ĭ�϶������ػ��̡߳�
 
 */
public class Demo7 extends Thread {
	
	public Demo7(String name){
		super(name);
	}
	
	@Override
	public void run() {
		for(int i = 1 ; i<=100 ; i++){
			System.out.println("���°�Ŀǰ����"+i+"%");
			if(i==100){
				System.out.println("���°��������,׼����װ..");
			}
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		 Demo7 d = new Demo7("��̨�߳�");
		 d.setDaemon(true); //setDaemon() �����߳��Ƿ�Ϊ�ػ��̣߳�trueΪ�ػ��̣߳� falseΪ���ػ��̡߳�
		// System.out.println("���ػ��߳���"+ d.isDaemon()); //�ж��߳��Ƿ�Ϊ�ػ��̡߳�
		 d.start();
		 
		 for(int i = 1 ; i<=100 ; i++){
			 System.out.println(Thread.currentThread().getName()+":"+i);
		 }
		 
	}

}
