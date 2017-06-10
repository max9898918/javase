package a130_thread;

import java.util.concurrent.ExecutorService;  
import java.util.concurrent.Executors;  
/**
 * 固定大小的线程池：
 * @author Administrator
 *
 */
public class A001_PoolTest {  
	public static void main(String[] args) {
		//创建一个固定大小为5的线程池      	
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
		System.out.println(Thread.currentThread().getName()+"正在执行。。。");  
	}  
}  