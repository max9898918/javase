package a050_time;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class A001_OperatorTime {
	
	public static void main(String[] args) {
		A001_OperatorTime time = new A001_OperatorTime();
		//System.out.println(time.getFirstDayOfWeek(new Date()));
		time.CalendarTest();
	}


	
	public void CalendarTest(){
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd"); 
		
		//��ȡǰһ���µĵ�һ��
		Calendar   cal_1=Calendar.getInstance();//��ȡ��ǰ���� 
		cal_1.add(Calendar.MONTH, 0);
		cal_1.set(Calendar.DAY_OF_MONTH,0);//����Ϊ1��,��ǰ���ڼ�Ϊ���µ�һ�� 
		String firstDay = format.format(cal_1.getTime());
		System.out.println("ǰһ���µĵ�һ�죺"+firstDay);
		//��ȡǰһ���µ����һ��
		Calendar cale = Calendar.getInstance();   
		cale.set(Calendar.DAY_OF_MONTH,0);//����Ϊ1��,��ǰ���ڼ�Ϊ���µ�һ�� 
		String lastDay = format.format(cale.getTime());
		System.out.println("ǰһ���µ����һ�죺"+lastDay);


		//��ȡ��ǰ�µ�һ�죺
		Calendar c = Calendar.getInstance();    
		c.add(Calendar.MONTH, 0);
		c.set(Calendar.DAY_OF_MONTH,1);//����Ϊ1��,��ǰ���ڼ�Ϊ���µ�һ�� 
		String first = format.format(c.getTime());
		System.out.println("��ǰ�µ�һ�죺"+first);

		//��ȡ��ǰ�����һ��
		Calendar ca = Calendar.getInstance();    
		ca.set(Calendar.DAY_OF_MONTH, ca.getActualMaximum(Calendar.DAY_OF_MONTH));  
		String last = format.format(ca.getTime());
		System.out.println("��ȡ��ǰ�����һ�죺"+last);
	}
	
	
	
	/**
	 * ȡ�õ�ǰ���������ܵĵ�һ��
	 *
	 * @param date
	 * @return
	 */
	public  Date getFirstDayOfWeek(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setFirstDayOfWeek(Calendar.SUNDAY);
		calendar.setTime(date);
		calendar.set(Calendar.DAY_OF_WEEK,
				calendar.getFirstDayOfWeek()); // Sunday
		return calendar.getTime();
	}

	/**
	 * ȡ�õ�ǰ���������ܵ����һ��
	 *
	 * @param date
	 * @return
	 */
	public  Date getLastDayOfWeek(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setFirstDayOfWeek(Calendar.SUNDAY);
		calendar.setTime(date);
		calendar.set(Calendar.DAY_OF_WEEK,
				calendar.getFirstDayOfWeek() + 6); // Saturday
		return calendar.getTime();
	}

	/**
	 * ����ָ�����ڵ��µĵ�һ��
	 *
	 * @param year
	 * @param month
	 * @return
	 */
	public  Date getFirstDayOfMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(calendar.get(Calendar.YEAR),
				calendar.get(Calendar.MONTH), 1);
		return calendar.getTime();
	}

	/**
	 * ����ָ�����ڵ��µ����һ��
	 *
	 * @param year
	 * @param month
	 * @return
	 */
	public  Date getLastDayOfMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(calendar.get(Calendar.YEAR),
				calendar.get(Calendar.MONTH), 1);
		calendar.roll(Calendar.DATE, -1);
		return calendar.getTime();
	}

	/**
	 * �ַ���ת��������
	 * @param str
	 * @return date
	 */
	public  Date strToDate(String str) {
		SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd HH:mm");
		Date date = null;
		try {
			date = format.parse(str);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return date;
	}

	/**
	 * ����ת�����ַ���
	 * @param date 
	 * @return str
	 */
	public  String dateToStr(Date date) {
		//"yyyy-MM-dd HH:mm:ss"
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		String str = format.format(date);
		System.out.println(str);
		return str;
	}


	/**
	 * �õ�ĳ��ĳ�ܵĵ�һ��
	 * @param year
	 * @param week
	 * @return
	 */
	public  Date getFirstDayOfWeek(int year, int week) {
		week = week - 1;
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, Calendar.JANUARY);
		calendar.set(Calendar.DATE, 1);

		Calendar cal = (Calendar) calendar.clone();
		cal.add(Calendar.DATE, week * 7);

		return getFirstDayOfWeek(cal.getTime());
	}

	/**
	 * �õ�ĳ��ĳ�ܵ����һ��
	 *
	 * @param year
	 * @param week
	 * @return
	 */
	public  Date getLastDayOfWeek(int year, int week) {
		week = week - 1;
		Calendar calendar = Calendar.getInstance();
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH, Calendar.JANUARY);
		calendar.set(Calendar.DATE, 1);
		Calendar cal = (Calendar) calendar.clone();
		cal.add(Calendar.DATE, week * 7);

		return getLastDayOfWeek(cal.getTime());
	}



	/**
	 * ȡ�õ�ǰ���������ܵ�ǰһ�����һ��
	 *
	 * @param date
	 * @return
	 */
	public  Date getLastDayOfLastWeek(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return getLastDayOfWeek(calendar.get(Calendar.YEAR),
				calendar.get(Calendar.WEEK_OF_YEAR) - 1);
	}

	/**
	 * ����ָ�����µ��µĵ�һ��
	 *
	 * @param year
	 * @param month
	 * @return
	 */
	public  Date getFirstDayOfMonth(Integer year, Integer month) {
		Calendar calendar = Calendar.getInstance();
		if (year == null) {
			year = calendar.get(Calendar.YEAR);
		}
		if (month == null) {
			month = calendar.get(Calendar.MONTH);
		}
		calendar.set(year, month, 1);
		return calendar.getTime();
	}

	/**
	 * ����ָ�����µ��µ����һ��
	 *
	 * @param year
	 * @param month
	 * @return
	 */
	public  Date getLastDayOfMonth(Integer year, Integer month) {
		Calendar calendar = Calendar.getInstance();
		if (year == null) {
			year = calendar.get(Calendar.YEAR);
		}
		if (month == null) {
			month = calendar.get(Calendar.MONTH);
		}
		calendar.set(year, month, 1);
		calendar.roll(Calendar.DATE, -1);
		return calendar.getTime();
	}

	/**
	 * ����ָ�����ڵ��ϸ��µ����һ��
	 *
	 * @param year
	 * @param month
	 * @return
	 */
	public  Date getLastDayOfLastMonth(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		calendar.set(calendar.get(Calendar.YEAR),
				calendar.get(Calendar.MONTH) - 1, 1);
		calendar.roll(Calendar.DATE, -1);
		return calendar.getTime();
	}

	/**
	 * ����ָ�����ڵļ��ĵ�һ��
	 *
	 * @param year
	 * @param quarter
	 * @return
	 */
	public  Date getFirstDayOfQuarter(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return getFirstDayOfQuarter(calendar.get(Calendar.YEAR),
				getQuarterOfYear(date));
	}

	/**
	 * ����ָ���꼾�ļ��ĵ�һ��
	 *
	 * @param year
	 * @param quarter
	 * @return
	 */
	public  Date getFirstDayOfQuarter(Integer year, Integer quarter) {
		Calendar calendar = Calendar.getInstance();
		Integer month = new Integer(0);
		if (quarter == 1) {
			month = 1 - 1;
		} else if (quarter == 2) {
			month = 4 - 1;
		} else if (quarter == 3) {
			month = 7 - 1;
		} else if (quarter == 4) {
			month = 10 - 1;
		} else {
			month = calendar.get(Calendar.MONTH);
		}
		return getFirstDayOfMonth(year, month);
	}

	/**
	 * ����ָ�����ڵļ������һ��
	 *
	 * @param year
	 * @param quarter
	 * @return
	 */
	public  Date getLastDayOfQuarter(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return getLastDayOfQuarter(calendar.get(Calendar.YEAR),
				getQuarterOfYear(date));
	}

	/**
	 * ����ָ���꼾�ļ������һ��
	 *
	 * @param year
	 * @param quarter
	 * @return
	 */
	public  Date getLastDayOfQuarter(Integer year, Integer quarter) {
		Calendar calendar = Calendar.getInstance();
		Integer month = new Integer(0);
		if (quarter == 1) {
			month = 3 - 1;
		} else if (quarter == 2) {
			month = 6 - 1;
		} else if (quarter == 3) {
			month = 9 - 1;
		} else if (quarter == 4) {
			month = 12 - 1;
		} else {
			month = calendar.get(Calendar.MONTH);
		}
		return getLastDayOfMonth(year, month);
	}

	/**
	 * ����ָ�����ڵ���һ�������һ��
	 *
	 * @param year
	 * @param quarter
	 * @return
	 */
	public  Date getLastDayOfLastQuarter(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return getLastDayOfLastQuarter(calendar.get(Calendar.YEAR),
				getQuarterOfYear(date));
	}

	/**
	 * ����ָ���꼾����һ�������һ��
	 *
	 * @param year
	 * @param quarter
	 * @return
	 */
	public  Date getLastDayOfLastQuarter(Integer year, Integer quarter) {
		Calendar calendar = Calendar.getInstance();
		Integer month = new Integer(0);
		if (quarter == 1) {
			month = 12 - 1;
		} else if (quarter == 2) {
			month = 3 - 1;
		} else if (quarter == 3) {
			month = 6 - 1;
		} else if (quarter == 4) {
			month = 9 - 1;
		} else {
			month = calendar.get(Calendar.MONTH);
		}
		return getLastDayOfMonth(year, month);
	}

	/**
	 * ����ָ�����ڵļ���
	 *
	 * @param date
	 * @return
	 */
	public  int getQuarterOfYear(Date date) {
		Calendar calendar = Calendar.getInstance();
		calendar.setTime(date);
		return calendar.get(Calendar.MONTH) / 3 + 1;
	}

	/**
	 * ��ȡ��ǰʱ������
	 * @return
	 */
	public  String getDay(){
		Date date = new Date();
		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		return simpleDateFormat.format(date);
	}
}
