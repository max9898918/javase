package com.m17_6;

public class SwitchTest {



	/**

	 * @paramargs add by zxx ,Dec 9, 2008

	 */

	public static void main(String[] args) {
		
		
		//System.out. println (new Tests().test());
		System.out.println(new SwitchTest().test2());
	}


	/**
	 * Ҳ����Ĵ�����return֮ǰ��������ϸ��˵���ҵĴ�����return�м�ִ�У��뿴��������������н��
	 * ���н����1��Ϊʲô�أ������������Ӻ������õ�����Ĺ��̣��ñ�������׼��һ���չ��ӣ����Ӻ���Ҫ���ؽ��ʱ���Ȱѽ�����ڹ����Ȼ���ٽ������߼����ص�����������ν���أ������Ӻ���˵���Ҳ������ˣ����������������аɣ���ûʲô������ԣ��������˵�⻰֮ǰ�Ž�������ġ�
	 * @return
	 */
	static int test(){

		int x = 1;

		try{
			System.out.println("try");
			return x;
		}

		finally{
			System.out.println("---"+x);
			++x;
		}

	}

	@SuppressWarnings("finally")
	int test2(){

		try{
			System.out.println("func1");
			return 1;
		}finally{
			System.out.println("func2");
			return 2;
		}
	}

}



