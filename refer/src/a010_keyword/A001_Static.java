package a010_keyword;
/**
 *   ��δ�������A01_Static����һ��static��int����I�����������캯������һ�����ڳ�ʼ��IΪ4���ڶ������ڳ�ʼ��iΪ����������ֵ��
 * ��main��������ֵ��5�����������������������t��Ȼ����ô������Ĺ��캯��ʵ�������󣬴�ʱ����t�ĳ�Ա����I��ֵΪ5��������������tt��
 * �����޲����Ĺ��캯������ô�ͰѶ���tt�ĳ�Ա����i��ֵ��ʼ��Ϊ4�ˣ�ע���ˣ�������i��static���Ǿ���˵��������ж��󶼹�����ڴ棬
 * ��Ҳ����˵��ʵ��������tt��ʱ��ı���i��ֵ����ôʵ���϶���t��iֵҲ���ˣ���Ϊʵ�����������õ���ͬһ����Ա����������ӡ�Ľ��������4��
 * ���ǰ�static�ؼ���ȥ�������5��4��5�����԰�static�ؼ���ȥ�������������ô�����ģ�
 * �ܽ᣺��static���εĳ�Ա������ֵ������󸳵�ֵ
 * ����ʱ�䣺2017-01-09
 * @author Administrator
 *
 */
public class A001_Static {
	int i;
	
	public A001_Static(){
		i=4;
	}

	public A001_Static(int j){
		i=j;
	}
	
	public static void main(String[] args) {
		A001_Static t = new A001_Static(5); //�����������ã���ʵ���� 
		A001_Static tt = new A001_Static(); //��static���εĳ�Ա������ֵ������󸳵�ֵ������������޲ι��캯������ֵ��
		//A01_Static ttt = new A01_Static(10); //��������static���εĳ�Ա������ֵ������󸳵�ֵ
		System.out.println(t.i); 
		System.out.println(tt.i); 
		System.out.println(t.i); 
	}
}
