package a090_interview;
import java.util.Scanner;
/* ����Ϊһ���ַ������ֽ��������Ϊ���ֽڽ�ȡ���ַ�����
 * ����Ҫ��֤���ֲ����ذ������"��ABC"4��Ӧ�ý�Ϊ"��AB"��
 * ����"��ABC��DEF"6��Ӧ�����"��ABC"��������"��ABC+���İ��"��
 * */
public class Interview01 {
	static String ss;
	// Ҫ���н�ȡ�������ַ���
	static int n;
	// ��ȡ���ַ������ֽ���
	public static void main(String[] args) {
		System.out.println("�������ַ�����");
		Scanner scStr = new Scanner(System.in);
		// �Ӽ��̻�ȡ�ַ���
		ss = scStr.next();
		// ��Scanner�����е��������ַ�������ʽȡ����
		System.out.println("�������ֽ�����");
		Scanner scByte = new Scanner(System.in);
		// �Ӽ��̻�ȡ�ַ���
		n = scByte.nextInt();
		// ��Scanner�����е���������ֵ����ʽȡ����
		Interception(setValue());
		// �����뷽���������
	}

	public static String[] setValue() {
		// �˷����������ǽ��ַ���ת�����ַ�������
		String[] string = new String[ss.length()];
		// ����һ���ַ�����string
		for (int i = 0; i < string.length; i++) {
			string[i] = ss.substring(i, i + 1);
			// ���ַ���ss�еĵ�i���ַ�ȡ���������ַ�������string��
		}
		return string;
		// ������ַ����鷵��
	}

	public static void Interception(String[] string) {
		int count = 0;
		String m = "[\u4e00-\u9fa5]";
		// ���ֵ���������
		System.out.println("��ÿ" + n + "�ֽڻ��ֵ��ַ���������ʾ��");
		for (int i = 0; i < string.length; i++) {
			if (string[i].matches(m)) {
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
