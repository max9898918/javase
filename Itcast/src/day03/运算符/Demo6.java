package day03.�����;
/*
��ֵ�������
	=  (��ֵ�����)
	+= 
	-=
	*=
	/=
	%=
*/
class Demo6 
{
	public static void main(String[] args) 
	{
		
		int i = 10; // ��10�����i������
		i+=2;  // i = i+2; 
		System.out.println("i = "+i);
	
	
		byte b1 = 1;
		byte b2 = 2;
		//b2 = (byte)(b2+b1); //������ ��Ҫǿ������ת��
		b2+=b1;  //b2 = b2+ b1;	 b2+=b1 �ڱ����ʱ��java�����������ǿ������ת��������Ҫ�����ֶ�ת���ˡ�
		System.out.println("b2 : "+ b2);
	}
}
