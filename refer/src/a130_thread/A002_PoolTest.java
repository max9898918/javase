package a130_thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class A002_PoolTest {
	/**
	 * �������̳߳�
	 * @param args
	 */
    public static void main(String[] args) {  
        ExecutorService pool=Executors.newSingleThreadExecutor();//����һ�����̳߳�  
        for(int i=0;i<7;i++){  
            pool.submit(new MyThread());  
        }  
        pool.shutdown();  
    } 
}
