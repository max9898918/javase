package a110_other;
/**
 * ��java��û��С�����Ĭ����int���͡���С����Ĭ����double����
 * @author Administrator
 *
 */
public class A001_TypeSwitch {

	public static void main(String[] args) {
		//float f = 2.3; //���Ȳ�׼ȷ,Ӧ����ǿ������ת����������ʾ��float f=(float)3.4 ��float f = 3.4f��
		float f1=(float)3.4;
		float f2 = 3.4f;
		System.out.println("f1="+f1+"  f2="+f2);
		
		short s1 = 1; 
		//s1 = s1+1;  //��Ҫ��Ҫ֤����仰��Ҫǿ������ת��

		s1 =(short) (s1+1);
		s1+=1;//����ʹ�����ַ���
		System.out.println(s1);
	}
}
