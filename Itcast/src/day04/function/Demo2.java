package day04.function;
/*

�����Ķ����ʽ��
	
	���η�  ����ֵ����  ������(��ʽ����..){
		��Ҫ����װ�Ĺ��ܴ��룻
		return ���;
	}


��ζ���һ��������
	1. ����ֵ���͡�
	2. �Ƿ����δ֪�Ĳ���(�Ƿ����Ҫ�ɵ�����ȷ���Ĳ���)��---->��ʽ����


*/

class Demo2 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
		//int max = getMax(14,5); //�����˺���   ʵ�ʲ���
		//System.out.println("���ֵ��"+ max);
		getMax(3,7);
	}
	
	//����2������һ�������Ƚ�����int���͵����ݴ�С�� ����Ҫ�����ֵ���ظ�������,ֱ�Ӵ�ӡ���ɡ�
	public static void getMax(int a, int b){
		int max = 0; //����һ���������ڱ������ֵ��
		if(a>b){
			max = a;
		}else{
			max = b;
		}
		System.out.println("���ֵ��"+ max);
	}

/*

	//����1�� ����һ�������Ƚ�����int���͵����ݴ�С�� �����ֵ���ظ������ߡ�
	public static int  getMax(int a, int b){  // ��ʽ����
		int max = 0; //����һ���������ڱ������ֵ��
		if(a>b){
			max = a;
		}else{
			max = b;
		}
		return max;	//�ѽ�����ظ�������
	}
*/

}
