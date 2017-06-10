package a130_thread;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
/**
 * ÑÓ³ÙÏß³Ì³Ø
 * @author Administrator
 *
 */
public class A004_PoolTest {
	public static void main(String[] args) {  
        ScheduledExecutorService pool=Executors.newScheduledThreadPool(6);  
        for(int i=0;i<4;i++){  
            pool.submit(new MyThread());  
        }  
          
        pool.schedule(new MyThread(), 1000, TimeUnit.MILLISECONDS);  
        pool.schedule(new MyThread(), 2000, TimeUnit.MILLISECONDS);  
        pool.shutdown();  
    }  
}
