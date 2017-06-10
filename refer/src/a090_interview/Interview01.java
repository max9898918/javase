package a090_interview;
import java.util.Scanner;
/* 输入为一个字符串和字节数，输出为按字节截取的字符串。
 * 但是要保证汉字不被截半个，如"我ABC"4，应该截为"我AB"，
 * 输入"我ABC汉DEF"6，应该输出"我ABC"，而不是"我ABC+汉的半个"。
 * */
public class Interview01 {
	static String ss;
	// 要进行截取操作的字符串
	static int n;
	// 截取的字符串的字节数
	public static void main(String[] args) {
		System.out.println("请输入字符串：");
		Scanner scStr = new Scanner(System.in);
		// 从键盘获取字符串
		ss = scStr.next();
		// 将Scanner对象中的内容以字符串的形式取出来
		System.out.println("请输入字节数：");
		Scanner scByte = new Scanner(System.in);
		// 从键盘获取字符串
		n = scByte.nextInt();
		// 将Scanner对象中的内容以数值的形式取出来
		Interception(setValue());
		// 方法与方法间的套用
	}

	public static String[] setValue() {
		// 此方法的作用是将字符串转换成字符串数组
		String[] string = new String[ss.length()];
		// 创建一个字符数组string
		for (int i = 0; i < string.length; i++) {
			string[i] = ss.substring(i, i + 1);
			// 将字符串ss中的第i个字符取出，放入字符数组中string中
		}
		return string;
		// 将这个字符数组返回
	}

	public static void Interception(String[] string) {
		int count = 0;
		String m = "[\u4e00-\u9fa5]";
		// 汉字的正则表达试
		System.out.println("以每" + n + "字节划分的字符串如下所示：");
		for (int i = 0; i < string.length; i++) {
			if (string[i].matches(m)) {
				// 将字符数组中的每一个元素与表则表达式进行匹配，如果相同则返回true
				count = count + 2;
				// 如果当前字符是汉字，计数器count就加2
			} else {
				count = count + 1;
				// 如果当前字符不是汉字，计数器count就加1
			}
			 if (count < n) {
				// 如果当前计数器count的值小于n，则输出当前字符
				System.out.print(string[i]);
			} else if (count == n) {
				// 如果当前计数器count的值等于n，则输出当前字符
				System.out.print(string[i]);
				count = 0;
				System.out.println();
				// 内循环结果，则需要换行，起到控制打印格式的作用
			} else {
				count = 0;
				// 如果当前计数器count的值大于n，则计数器count清零，接着执行外部循环
				System.out.println();
			}
		}
	}
}
