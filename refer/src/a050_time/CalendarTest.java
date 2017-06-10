package a050_time;

import java.util.Calendar;

import org.junit.Test;

public class CalendarTest {
	
	
	
	@Test
	public void run1(){
		System.out.println(Calendar.getInstance().getTimeInMillis());
		System.out.println(System.currentTimeMillis());
	}
	@Test
	public void lastDay(){
		Calendar time = Calendar.getInstance();  
		time.getActualMaximum(Calendar.DAY_OF_MONTH);  
	}
}
