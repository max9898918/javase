package a010_keyword;

import org.junit.Test;

/**
 * 1.只要try开始执行了，finally一定会执行.（但在system.exit(0)时，finally是不会执行的！
 * 2.捕捉到的异常可以重新抛出 ,  re-throwable Try后不一定要有catch块，但是一旦用了try关键字，后边必须有catch或者finally块，或者二者都有！
 * 创建时间：2017-01-09
 * @author Administrator
 */
public class A003_Finally {
	public static void main(String[] args) throws Exception {
		try{
			System.out.println("try");
			System.out.println(1/0);
		}catch(Exception e){
			System.out.println("catch");
			throw e;//在此将异常重新抛出
		}finally{
			System.out.println("finally");
		}
	}
	
	@Test
	public void run2(){
		int ret = 0;
		try{
			Integer a = null;
			if(a.intValue() == 1){
				ret = 2;
			}
		}catch(Exception e){
			ret = -1;
		}finally{
			ret = 1;
		}
		System.out.println(ret);
	}
}
