package day13.thread;
/*
 ���� ģ��3������ͬʱ����50�� Ʊ ��
 
����1 ��Ϊʲô50��Ʊ��������150�Σ�

���� ��ԭ�� ��Ϊnum�ǷǾ�̬�ģ��Ǿ�̬�ĳ�Ա������������ÿ�������ж���ά��һ�����ݵ�,�����̶߳���ͻ������ݡ�

�����������numƱ����������������̶߳���ʹ�á�ʹ��static���Ρ�

����2�� �������̰߳�ȫ���� ?

�߳� ��ȫ����Ľ��������sun�ṩ���߳�ͬ�����������ǽ����������ġ�
	
	java�߳�ͬ�����Ƶķ�ʽ��
	
		��ʽһ��ͬ�������
			
			ͬ�������ĸ�ʽ��
				
				synchronized(������){
					��Ҫ��ͬ���Ĵ���...
				}

ͬ�������Ҫע�����
		1. �����һ�����󶼿�����Ϊ������
		2. ��ͬ��������е�����sleep�����������ͷ�������ġ�
		3. ֻ�����������̰߳�ȫ�����ʱ���ʹ��ͬ������飬����ή��Ч�ʵġ�
		4. ���̲߳������� ������� ��Ψһ���� �ġ�������Ч��
		

���� һ�������˻�5000�飬������һ������ ���ۣ�һ�����ſ�����ʼȡǮ������ÿ��ֻ��ȡһǧ�飬Ҫ��׼�����̰߳�ȫ���⡣
		
		
		
		��ʽ����ͬ������

�����̰߳�ȫ����ĸ���ԭ��
	1. �������������������� ���̶߳���,�����߳�֮�乲����һ����Դ��
	2. �ж���������˹�����Դ��
	

 
 */

class SaleTicket extends Thread{
		
	
	 static int num = 50;//Ʊ��  �Ǿ�̬�ĳ�Ա����,�Ǿ�̬�ĳ�Ա������������ÿ�������ж���ά��һ�����ݵġ�
	 
     static	Object o = new Object();
	
	 public SaleTicket(String name) {
		super(name);
	}
	
	@Override
	public void run() {
		while(true){
			//ͬ�������
			synchronized ("synchronized") {				
				if(num>0){
					System.out.println(Thread.currentThread().getName()+"�۳��˵�"+num+"��Ʊ");
					try {
						Thread.sleep(100);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
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
		//���������̶߳���ģ����������
		SaleTicket thread1 = new SaleTicket("����1");
		SaleTicket thread2 = new SaleTicket("����2");
		SaleTicket thread3 = new SaleTicket("����3");
		//�����߳���Ʊ
		thread1.start();
		thread2.start();
		thread3.start();
		
	}
	
}
