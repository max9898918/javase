package day08;

import java.util.Scanner;

/*
main��������⣺
	
	public �� �����ġ� Ȩ����������κ�����¶����Է��ʡ� private  
		ԭ�� Ϊ�˱�֤��jvm���κ�����¶����Է��ʵ�main������

	static:  ��̬����̬������jvm����main������ʱ����ӵķ��㡣����Ҫͨ��������á�
		
	void:  û�з���ֵ�� ��Ϊ���ص������� �� jvm����jvmʹ�����������û������ġ����ԾͲ�Ҫ�ˡ�
	

	main: ��������   ע�⣺ main�����ǹؼ���,ֻ������jvm��ʶ���һ������ĺ��������ѡ�
	
	
	arguments ������ĳЩ������������Ҫ������


*/
class Demo4 {

	public static  void main(String[] args) 
	{
		System.out.println("����ĳ��ȣ�"+ args.length);
		for(int i = 0 ; i <args.length ; i++){
			System.out.print(args[i]+",");
		}

		Scanner scanner = new Scanner(System.in);

		
	}
}
