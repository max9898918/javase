package a010_keyword;

public class Base implements IBase{
	
	public Base(){
		System.out.println("Base");
	}
	
	@Override
	public void iBase(){
		System.out.println("重写接口的方法！");
	}
}
