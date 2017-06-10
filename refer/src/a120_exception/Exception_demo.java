package a120_exception;

public class Exception_demo {
	
	public static void main(String[] args) throws Exception {
		try {
			throw new Exception("Exception异常"); //抛出异常
		} catch (Exception e) {
			throw new MyException("MyException异常",e); //调用自定义异常
		}
                                                                                            
	}
}
