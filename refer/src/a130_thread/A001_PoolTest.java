package a130_thread;

import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
/**
 * �̶���С���̳߳أ�
 * @author Administrator
 *
 */
public class A001_PoolTest {  
	public static void main(String[] args) {
		//����һ���̶���СΪ5���̳߳�      	
		ExecutorService pool=Executors.newFixedThreadPool(3);
		for(int i=0;i<7;i++){  
			pool.submit(new MyThread());  
		}  
		pool.shutdown();  
	}  
}  
class MyThread extends Thread{  
	@Override  
	public void run() {  
		System.out.println(Thread.currentThread().getName()+"����ִ�С�����");  
	}  
}  