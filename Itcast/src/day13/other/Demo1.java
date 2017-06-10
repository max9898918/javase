package day13.other;
import java.util.Arrays;
import java.util.Properties;

/*
 System  ϵͳ�� ��Ҫ���ڻ�ȡϵͳ���������ݡ�
 	
System�ೣ�õķ�����
 	arraycopy(Object src, int srcPos, Object dest, int destPos, int length) һ��
 		src - Դ���顣
		srcPos - Դ�����е���ʼλ�á�
		dest - Ŀ�����顣
		destPos - Ŀ�������е���ʼλ�á�
		length - Ҫ���Ƶ�����Ԫ�ص�������
		
	currentTimeMillis()  ��ȡ��ǰϵͳϵͳ��       �ص�
	exit(int status)  �˳�jvm  ���������0��ʾ�����˳�jvm����0��ʾ�쳣�˳�jvm��    һ��

	gc()    ����jvm�Ͽ��������������ڻ���������
	getenv(String name) ���ݻ������������ֻ�ȡ����������
	getProperty(key) 
	
	
		
	finalize()  ���һ�������������� �����յ�ʱ�򣬻��ȵ��ö����finalize()������
 */

class Person{
	
	String name;

	public Person(String name) {
		this.name = name;
	}
	
	@Override
	public void finalize() throws Throwable {
		super.finalize();
		System.out.println(this.name+"��������..");
	}
}



public class Demo1 {
	
	public static void main(String[] args) {
		
		int[] srcArr = {10,12,14,16,19};
		//��srcArr������Ԫ�ؿ��� ��destArr�����С�
		int[] destArr = new int[4];
		
		System.arraycopy(srcArr, 1, destArr, 0,4);
		//System.exit(0); //jvm�˳�..  ע�⣺ 0���߷�0�� ���ݶ������˳�jvm�������û�����û���κ�����
		System.out.println("Ŀ�������Ԫ�أ�"+ Arrays.toString(destArr)); // 0 14 16 0
		System.out.println("��ǰ��ϵͳʱ�䣺" + System.currentTimeMillis());
		System.out.println("����������"+System.getenv("JAVA_HOME"));
		
		
		for(int i = 0 ; i<4; i++){
			new Person("����"+i);
			System.gc(); //����������������������
		}
		
		Properties properties = System.getProperties();  //��ȡϵͳ���������ԡ�
		properties.list(System.out);
		
		/*String value = System.getProperty("os.name");//����ϵͳ����������ȡ��Ӧ������ֵ
		System.out.println("��ǰϵͳ��"+value);*/
	}
	
}
