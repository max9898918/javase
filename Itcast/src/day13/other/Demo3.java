package day13.other;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


/*
������ Date 
 

Calendar
 
 
���ڸ�ʽ����    SimpleDateFormat
 
 */
public class Demo3  {
	
	public static void main(String[] args) throws ParseException {
		/*Date date = new Date(); // ��ȡ��ǰ��ϵͳʱ��
		System.out.println("��ݣ�"+ date.getYear());*/
		
		/*Calendar calendar = Calendar.getInstance(); //��ȡ��ǰ��ϵͳʱ�䡣
		System.out.println("�꣺"+ calendar.get(Calendar.YEAR));
		System.out.println("�£�"+ (calendar.get(Calendar.MONTH)+1));
		System.out.println("�գ�"+ calendar.get(Calendar.DATE));
		
		System.out.println("ʱ��"+ calendar.get(Calendar.HOUR_OF_DAY));
		System.out.println("�֣�"+ calendar.get(Calendar.MINUTE));
		System.out.println("�룺"+ calendar.get(Calendar.SECOND));*/
		
		// ��ʾ ��ǰϵͳʱ��: 2014��12��26��  xxʱxx��xx��   
		
		/* *  ���ڸ�ʽ����    SimpleDateFormat 
		 *  		����1�� ���԰�����ת��תָ����ʽ���ַ���     format()
		 *  		����2�� ���԰�һ�� �ַ�ת���ɶ�Ӧ�����ڡ�    parse()   ����*/
		 
		Date date = new Date(); //��ȡ��ǰ��ϵͳʱ�䡣
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy��MM��dd��   HH:mm:ss") ; //ʹ����Ĭ�ϵĸ�ʽ������һ�����ڸ�ʽ������
		String time = dateFormat.format(date);  //���԰�����ת��תָ����ʽ���ַ���
		System.out.println("��ǰ��ϵͳʱ�䣺"+ time);
		
		String birthday = "2000��12��26��   11:29:08";
		
		Date date2 = dateFormat.parse(birthday);  //ע�⣺ ָ�����ַ�����ʽ����Ҫ��SimpleDateFormat��ģʽҪһ�¡�
		System.out.println(date2);
		
		Date date21 =new Date();
		SimpleDateFormat dateFormat2 = new SimpleDateFormat("yyyy��MM��dd��  HH:mm:ss");
		String time2 =dateFormat.format(date21);
		
		
		String time21=dateFormat.format(date);
		System.out.println("��ǰ��ϵͳʱ�䣺"+time);
		
		String birthday1= "2000��12��26��  11:28:08";
		Date date22=dateFormat2.parse(birthday1);
		System.out.println(date22);
	}
}
