package a120_exception;

public class Exception_demo {
	
	public static void main(String[] args) throws Exception {
		try {
			throw new Exception("Exception�쳣"); //�׳��쳣
		} catch (Exception e) {
			throw new MyException("MyException�쳣",e); //�����Զ����쳣
		}
                                                                                            
	}
}
