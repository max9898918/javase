package excel;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Tests {
	public static void main(String[] args) {
		//��ȡ��ǰ����
		System.out.println(getWeek());
	}
	/**
	 * ��ȡ���ڼ�
	 * @return
	 */
	public static int getWeek() {
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return (cal.get(Calendar.DAY_OF_WEEK)-1);
	}
	/**
	 * ��ȡ����
	 * @return
	 */
	public static String getDate(){
		Date date=new Date();
		SimpleDateFormat matter1=new SimpleDateFormat("yyyy-MM-dd");
		//System.out.println(matter1.format(date));
		return matter1.format(date);
	}

}
