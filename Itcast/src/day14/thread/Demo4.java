package day14.thread;

class SaleTicket implements Runnable{
	
	int  num = 50; // Ʊ��
	
	@Override
	public void run() {
		while(true){
			synchronized ("��") {
				if(num>0){
					System.out.println(Thread.currentThread().getName()+"�۳��˵�"+ num+"��Ʊ");
					num--;
				}else{
					System.out.println("������..");
					break;
				}	
			}
		}		
	}
}


public class Demo4 {
	
	public static void main(String[] args) {
		//������һ��Runnableʵ����Ķ���
		SaleTicket saleTicket = new SaleTicket();
		//���������̶߳���ģ����������
		Thread thread1 = new Thread(saleTicket,"����1");
		Thread thread2 = new Thread(saleTicket,"����2");
		Thread thread3 = new Thread(saleTicket,"����3");
		//�����߳���Ʊ
		thread1.start();
		thread2.start();
		thread3.start();
		
		
	}

}
