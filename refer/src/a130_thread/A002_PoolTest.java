package a130_thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class A002_PoolTest {
	/**
	 * 单任务线程池
	 * @param args
	 */
    public static void main(String[] args) {  
        ExecutorService pool=Executors.newSingleThreadExecutor();//创建一个单线程池  
        for(int i=0;i<7;i++){  
            pool.submit(new MyThread());  
        }  
        pool.shutdown();  
    } 
}
