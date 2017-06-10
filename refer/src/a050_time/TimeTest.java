package a050_time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeTest {
	public static void main(String[] args) {
		String str = "aa";
		Date today = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String str_today = sdf.format(today);
		System.out.println(today);
		System.out.println("œ÷‘⁄ «£∫"+str_today);
	}

}
