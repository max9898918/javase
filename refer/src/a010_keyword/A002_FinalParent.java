package a010_keyword;

public abstract class A002_FinalParent extends Base{
	
	A002_FinalParent(){
		System.out.println("A002_FinalParent");
	}

	public final void finalMethod(){
		System.out.println("A002_FinalParent的final方法！");
	}
	
	abstract void method(String str);
	
	public void method2(String str){
		System.out.println("带参数的普通方法！传过来的参数是："+str);
	}
	
}
