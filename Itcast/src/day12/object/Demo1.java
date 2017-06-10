package day12.object;
/*
java�������������ԣ�����˼�룺���ʺ� �Ķ������ʺ� �����飺
	
	��ʽһ���Զ����࣬Ȼ��ͨ���Զ�����ഴ������
	
	��ʽ����sun�ṩ�˺ܶ�������ʹ�ã�����ֻ��Ҫ��ʶ��Щ�࣬���ǾͿ���ͨ����Щ�ഴ�������ˡ�
	
Object������������ռ����ࡣ �κ�һ���඼�̳���Object�ࡣ


Object�ࣺ


Object�ೣ�õķ�����
	toString();     ���ظö�����ַ�����ʾ�� ����һ���ַ������������ö���ġ�
���ʣ� toString() �к����ã�	  ��дtoString֮������ֱ�����һ�������ʱ�򣬾ͻ������������������ĸ�ʽ���ݡ�
	
	equals(Object obj)   ���ڱȽ�����������ڴ��ַ���ж����������Ƿ�Ϊͬһ������
	
	hashCode()   ���ظö���Ĺ�ϣ��ֵ(��ҿ��԰ѹ�ϣ��� �����Ƕ�����ڴ��ַ)/


java�еĹ淶��һ��������д��һ�����equals���������Ƕ�����д����hashCode������



java�ǿ�Դ....Դ���빫��...

�鿴Դ����ķ�ʽ��
	��ʽһ�� ��סctrl������������Ҫ����Դ����.
	
	��ʽ�����ѹ���ƶ�������Ҫ�鿴���봦����F3.
	

Ϊʲô����Ҫ�鿴Դ���룺
	1���鿴Դ��������˽���������д����������ģ��������˽�ĸ��ӵ����롣
	2. ���մ�ţ��˼�롣

��Դ������ɻ��һ�㣺 ��Ҫÿ�д��붼Ū����ʲô��˼���ܿ������ �³�����˼�����ӡ�
 */

class Person{
	
	int id;
	
	String name;

	public Person(int id, String name) {
		this.id = id;
		this.name = name;
	}

	public Person() {
	}
	
	//Ŀǰ����Ҫֱ�����һ�������ʱ����� �ĸ�ʽ�ǣ� ��ţ�110 ������ ����  ���ָ�ʽ�� ĿǰObject��
//	toString�����޷����������������ô��ʱ�����Ǿ�Ӧ�ö�Object���toString������д��
	@Override
	public String toString() {
		return "��ţ�"+ this.id + " ������"+this.name;
	}
	
	
	//ΪʲôҪ��д��Object��equals����Ĭ�ϱȽϵ�������������ڴ��ַ����Ŀǰ��Ҫ�Ƚϵ���������������֤������Object���equals���������������ڵ�����
	@Override
	public boolean equals(Object obj) { 
		Person p  = (Person)obj;
		return this.id== p.id;
	}
	
	@Override
	public int hashCode() {
		return  this.id;
	}
	
		
}


public class Demo1 {

	public static void main(String[] args) {
		
		/*
		Object o = new Object();
		System.out.println(o.toString());  // java.lang.Object@18b3364    ���ص��ַ�����ʾ�� ��������+@+ ����Ĺ�ϣ��
		System.out.println(o);  // ͨ���鿴Դ�����֪��ֱ�����һ������ ��ʱ��ʵ������println�����ڲ��������� ���õ�toString�������Ѱ�toString�������ص����������
		//���ʣ� Ϊʲôֱ�����һ�������ʱ�����������toString�������ص��ַ��������һ�����أ�
		
		
		Person  p1 = new Person(110,"����");
		System.out.println("p1:"+p1);  
		//��������ܹ����һ��p�����ʱ������ĸ�ʽ�� ��ţ�110 ������ ����..
		Person  p2 = new Person(112,"��ʣ");
		System.out.println("p2:"+p2);  
		*/
		
		
		Person p1 = new Person(110,"����");
		Person p2 = new Person(110,"�¸���");
		//��������ʵ������ֻҪ�����˵����֤һ�£���ô����ͬһ���ˡ�
		System.out.println("p1��p2��ͬһ��������"+ p1.equals(p2));
		
		System.out.println("p1��ϣ��:"+ p1.hashCode());
		System.out.println("p2��ϣ��:"+ p2.hashCode());
		
		
	}
	
	
	
}



















