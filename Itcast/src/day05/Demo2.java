package day05;
/*
ע�⣺ ���һ�������ķ���ֵ�����Ǿ�����������ͣ���ô�ú����ͱ���Ҫ��֤����������¶���֤�з���ֵ�������˷���ֵ������void���⣩

return �ؼ��ֵ����ã�
	1. �������ݸ������ĵ����ߡ�
	2. ����һ��ִ�е���return�ؼ��֣���ô�ú������Ͻ����� (�ܽ���һ������)

ע�⣺һ�������ķ���ֵ���� ��void����ôҲ���Գ���return�ؼ��֣�����return�ؼ��ֵĺ��治�������ݡ�

break�ؼ�����return�ؼ��ֵ�����
	1.break�ؼ����ǽ���һ��ѭ����
	2. return�ؼ����ǽ���һ��������


*/
class Demo2 {

	public static void main(String[] args) 
	{
		String result = getGrade(90);	//���ú���
		System.out.println("��Ӧ�ĵȼ��ǣ�"+ result );
		add(0,2);
		print();
	}



	public static void print(){
		for(int i = 0 ; i < 5;  i++){
			System.out.println("hello world");
			///break; //�����˵�ǰ��ѭ��
			return ; //������ǰ�ĺ���
		}

		System.out.println("��������ִ����??");
	}



	
	//Ŀǰ�ú����ķ���ֵ������void����ô�Ƿ���Դ���return�ؼ����أ�
	public static void add(int a , int b){
		if(a==0){
			return; //����һ������
		}
		System.out.println("�ܺͣ�"+(a+b));
	}





	public static String  getGrade(int score){	//δ֪�Ĳ����������β��У� �ɺ����ĵ�����ȷ����
		if(score>=90&&score<=100){
			return "A�ȼ�";
		}else if(score>=80&&score<=89){
			return "B�ȼ�";
		}else if(score>=70&&score<=79){
			return "C�ȼ�";
		}else if(score>=60&&score<=69){
			return "D�ȼ�";
		}else if(score>=0&&score<=59){
			return "E�ȼ�";
		}else{
			return "�����ȼ�";
		}		
	}

}
