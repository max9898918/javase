package day04.function;
/*
����1�� ����һ�������ж�һ�������ĵȼ����ѷ����ĵȼ����ظ������ߡ�
			"A�ȼ�" ��B�ȼ���

��� ���庯����
	1. ����ֵ���͡�  String 
	2. δ֪�Ĳ���--->��ʽ������  ����


����2�� ����һ��������ӡһ���˷�������Ҫ�����κ����ݡ� 
	1. ����ֵ���͡�  void 
	2. δ֪�Ĳ���--->��ʽ������  ������ʲô�˷���


�������ص㣺
	1. ���������þ��ǰ�һ�����ܴ������װ�������Ѵﵽ��߹��ܴ���ĸ����ԡ�
	2. ���������֮������Ҫ�����òŻ�ִ�еġ�
	3. ���һ������û�з���ֵ���ظ������ߣ���ô����ֵ���ͱ�����ʹ��void��ʾ��

*/

class Demo3 
{
	public static void main(String[] args) {
		//String result = getGrade(189);
		//System.out.println(result);
		print(9);
	}


	//����2�� ����һ��������ӡһ���˷�������Ҫ�����κ����ݡ� 
	public static void  print(int row){
		for(int i = 1 ; i<= row ; i++){
			for (int j = 1 ;j<=i  ;j++ ){
				System.out.print(j+"*"+i+"="+i*j+"\t");
			}
			//����
			System.out.println();
		}
	}




	//����1�� ����һ�������ж�һ�������ĵȼ����ѷ����ĵȼ����ظ������ߡ�
	public static String getGrade(int score){
		String grade = "";	//����һ�������洢�ȼ�
		if(score>=90&&score<=100){
			grade = "A�ȼ�";
		}else if(score>=80&&score<=89){
			grade = "B�ȼ�";
		}else if(score>=70&&score<=79){
			grade = "C�ȼ�";
		}else if(score>=60&&score<=69){
			grade = "D�ȼ�";
		}else if(score>=0&&score<=59){
			grade = "E�ȼ�";
		}else{
			grade = "�����ȼ�";
		}
		return grade;	//�ѵȼ����ظ�������
	}
	
}
