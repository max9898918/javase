package a110_other;

public class A002_Other {
	public static void main(String[] args) {
		A002_Other test = new A002_Other();
		test.operator();
	}
	/**
	 * λ������ο�����
	 *
	 * ��λ�����ļ򵥼��㷽��
	 * >>���Ʋ���
	 * x>>y
	 * ����x����2��y�˷�,ȡ��;
	 *
	 * <<���Ʋ���
	 * X<<y
	 * ����x����2��y�η�
	 */
	public void operator(){
		System.out.println(5<<6); 	//����5����2��6�η�
		System.out.println(1000>>5);//����1000���ԣ�2��5�η���ȡ��

		System.out.println(0x31 & 0x0f);
		/* �뿴java�������߰ٶ�
		 * If(x==33 & ++y>0) y��������If(x==33 && ++y>0)��������
		 *	&����������λ���������&���������ߵı��ʽ����boolean����ʱ��&��ʾ��λ�������
		 *  ����ͨ��ʹ��0x0f����һ����������&���㣬����ȡ�����������4��bitλ�����磬0x31 & 0x0f�Ľ��Ϊ0x01��
		 */
	}
}
