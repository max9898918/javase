package day13.thread;
/*
 ���� ģ��QQ��Ƶ������ͬʱ��ִ�С�
 */

class TalkThread extends Thread{
	
	@Override
	public void run() {
		while(true){
			System.out.println("hi����ã�����Ƶ��...");
		}
	}
}


class VideoThread extends Thread{
	
	@Override
	public void run() {
		while(true){
			System.out.println("��Ƶ��Ƶ....");
		}
	}
}

public class Demo2 {
	
	public static void main(String[] args) {
		TalkThread talkThread = new TalkThread();
		talkThread.start();
		VideoThread videoThread = new VideoThread();
		videoThread.start();
		
		
	}
}
