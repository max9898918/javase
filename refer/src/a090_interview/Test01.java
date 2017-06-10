package a090_interview;


public class Test01 {
	public static void main(String[] args) {
		String ss="晓1晓a晓太太晓晓晓";
		int n=3;
		// 此方法的作用是将字符串转换成字符串数组
		String[] string= new String[ss.length()];
		for(int i=0;i<string.length;i++){
			string[i] = ss.substring(i, i+1);
		}
		

		int count = 0;
		String m = "[\u4e00-\u9fa5]";
		// 汉字的正则表达试
		System.out.println("以每" + n + "字节划分的字符串如下所示：");
		for (int i = 0; i < string.length; i++) {
			if (string[i].matches("[\u4e00-\u9fa5]")) {
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
