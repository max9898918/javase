package a090_interview;


public class Test01 {
	public static void main(String[] args) {
		String ss="��1��a��̫̫������";
		int n=3;
		// �˷����������ǽ��ַ���ת�����ַ�������
		String[] string= new String[ss.length()];
		for(int i=0;i<string.length;i++){
			string[i] = ss.substring(i, i+1);
		}
		

		int count = 0;
		String m = "[\u4e00-\u9fa5]";
		// ���ֵ���������
		System.out.println("��ÿ" + n + "�ֽڻ��ֵ��ַ���������ʾ��");
		for (int i = 0; i < string.length; i++) {
			if (string[i].matches("[\u4e00-\u9fa5]")) {
				// ���ַ������е�ÿһ��Ԫ���������ʽ����ƥ�䣬�����ͬ�򷵻�true
				count = count + 2;
				// �����ǰ�ַ��Ǻ��֣�������count�ͼ�2
			} else {
				count = count + 1;
				// �����ǰ�ַ����Ǻ��֣�������count�ͼ�1
			}
			
			if (count < n) {
				// �����ǰ������count��ֵС��n���������ǰ�ַ�
				System.out.print(string[i]);
			} else if (count == n) {
				// �����ǰ������count��ֵ����n���������ǰ�ַ�
				System.out.print(string[i]);
				count = 0;
				System.out.println();
				// ��ѭ�����������Ҫ���У��𵽿��ƴ�ӡ��ʽ������
			} else {
				count = 0;
				// �����ǰ������count��ֵ����n���������count���㣬����ִ���ⲿѭ��
				System.out.println();
			}
		}
	}
}
