package day04.���̿������;
/*
ת���ַ��������ַ�ʹ�á�\������ת�����ַ��ı����������ôʹ�á�\�����ַ�����Ϊת���ַ���

���� �ڿ���̨�ϴ�ӡһ�� hello" world 

������ת���ַ��У�
	\b	Backspace ���˸����
	\t	Tab    �Ʊ��(�Ʊ�������þ���Ϊ����һ�ж���)  һ��tabһ������ĸ��ո�
	
	\n	����
	\r	�س�  �ѹ���ƶ���һ�е���λ���ϡ�
	
ע�⣺ �������windowsϵͳ�ϲ����ļ���ʱ����Ҫ���У�����Ҫ\r\nһ��ʹ�õġ�
������������Ĳ���ϵͳ����Ҫ���У�����Ҫ\n���ɡ�

*/
import java.io.*;
class Demo16 {

	public static void main(String[] args) throws Exception
	{
		System.out.println("D���������һ���ļ�!���������ӡ��.txt");

		File file = new File("D:\\�����ӡ��.txt");
		FileWriter  out = new FileWriter(file);
		out.write("��Һ�\r\n");
		out.write("���Ǻ�");
		out.close();


	}
}
