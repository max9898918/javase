package a120_exception;
/**
 * �Զ����쳣�ࡢд���������캯��
 * @author Administrator
 *
 */
public class MyException extends Exception{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 3418646207244737836L;

	public MyException(String m){
		super(m);
	}
	
	public MyException(String m,Throwable cause){
		super(m,cause);
	}
}
