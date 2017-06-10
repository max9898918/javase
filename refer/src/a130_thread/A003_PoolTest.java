package a130_thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
/**
 * 创建可变尺寸的线程池
 * @author Administrator
 *
 */
public class A003_PoolTest {
    public static void main(String[] args) {  
        ExecutorService pool=Executors.newCachedThreadPool();  
        for(int i=0;i<5;i++){  
            pool.submit(new MyThread());  
        }  
        pool.shutdown();  
    } 
}
