package a110_other;

public class A004_InnerClass {
	public static void main(String[] args) {
		A004_InnerClass product = new A004_InnerClass();
		
		Tests tests = product.new Tests();
		tests.test01("���ڲ�֪�����������棡");
	
	}
	
	public class Tests{
		public void test01(String params){
			System.out.println("�����ǣ�"+params);
		}
	}
}
