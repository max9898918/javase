package day14.thread;
/*
 join������ ����
 
 */

//����
class  Mon extends Thread{
	
	public void run() {
		System.out.println("����ϴ��");
		System.out.println("�����в�");
		System.out.println("����׼�����ˣ�����û�н�����..");
		//�ж���ȥ����
		Son s= new Son();
		s.start();
		try {
			s.join();  //���롣 һ���߳����ִ��join��䣬��ô�����µ��̼߳��룬ִ�и������̱߳���Ҫ�ò����¼�����߳����������Ȼ����ܼ���ִ�С�
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("�����������");
		System.out.println("ȫ��һ��Է�..");		
	}
} 

class Son extends Thread{
	
	@Override
	public void run() {
		System.out.println("������¥..");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("����һֱ��ǰ��");
		System.out.println("���Ӵ��꽴����");
		System.out.println("��¥���ѽ��͸�����");
	}
}

public class Demo8 {
	
	public static void main(String[] args) {
		Mon m = new Mon();
		m.start();
		
		
		
	}
}

