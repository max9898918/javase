package day04.���̿������;
/*
�����������֮----switchѡ���ж���� 

switch���ĸ�ʽ��
	
	switch(���ѡ��){
		
		case ֵ1��
			����ֵ1ִ�еĴ���
			break;
		case ֵ2��
			����ֵ 2ִ�еĴ���
			break;
		case ֵ3��
			����ֵ 3ִ�еĴ���
			break;
		case ֵ4��
			����ֵ 4ִ�еĴ���
			break;
		......

		default: 
			���ѡ�񶼷���������ѡ��ʱִ�еĴ���;
			break;
	}


switch���Ҫע������
	1. switch���ʹ�õı���ֻ����byte�� char�� short��int�� String�������ͣ�String���������Ǵ�jdk7.0��ʱ��ʼ֧�ֵġ�
	2. case����� �����ݱ�����һ��������	
	3. switch��ֹͣ������
		switch���һ��ƥ���������е�һ��case��䣬��ô�ͻ�ִ�ж�Ӧ��case�е������룬ִ�����֮�����û��
		����break�ؼ��ֻ����ǽ���switch���Ĵ����ţ���ôswitch��䲻�����жϣ����մ����˳���������ִ��
		���еĴ��롣ֱ������break�����ǽ���siwitch���Ĵ�����Ϊֹ��

	4. ��switch����в��ܴ����˳����Σ���Զ���ǻ����ж�case��䣬Ȼ��û�з��ϵ�����²Ż�ִ��default��䡣



if--else if---else if �����switch���ǳ������ƣ�
	
	switch�����ŵ㣺switch���Ľṹ������

	switchȱ�㣺��� �жϵ�������һ�����䷶Χ�ģ�ʹ��switch�����ͷǳ����鷳�ˡ�



�ж�������Щ���Ǽ��������( D  )
	
	A java    B C#   C javascript   D android
	
*/
class Demo2{

	public static void main(String[] args) 
	{
		
		int option = 3;	//����һ�������洢���ѡ��
		switch(option){
			
			case 1:
				System.out.println("java");
				break;
			case 2:
				System.out.println("C#");
				break;
			case 3:
				System.out.println("javaScript");
				break;
			case 4:
				System.out.println("android");
				break;
			default:
				System.out.println("���ѡ������");
	
			
				
		}
		

		/*
		String str = "world";
		switch(str){
			case "hello":
				System.out.println("hello");
				break;
			case "world":
				System.out.println("world");
				break;
		}
		*/

	}
}
