package a110_other;

public class A004_InnerClass {
	public static void main(String[] args) {
		A004_InnerClass product = new A004_InnerClass();
		
		Tests tests = product.new Tests();
		tests.test01("现在才知道可以这样玩！");
	
	}
	
	public class Tests{
		public void test01(String params){
			System.out.println("参数是："+params);
		}
	}
}
