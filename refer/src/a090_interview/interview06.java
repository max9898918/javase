package a090_interview;

import java.text.NumberFormat;
import java.util.HashMap;
import java.util.Scanner;

public class interview06 {
	//����HashMap��valueֵ  
	public static final String EMPTY = "";  
	public static final String ZERO = "��";  
	public static final String ONE = "Ҽ";  
	public static final String TWO = "��";  
	public static final String THREE = "��";  
	public static final String FOUR = "��";  
	public static final String FIVE = "��";  
	public static final String SIX = "½";  
	public static final String SEVEN = "��";  
	public static final String EIGHT = "��";  
	public static final String NINE = "��";  
	public static final String TEN = "ʰ";  
	public static final String HUNDRED = "��";  
	public static final String THOUSAND = "Ǫ";  
	public static final String TEN_THOUSAND = "��";  
	public static final String HUNDRED_MILLION = "��";  
	public static final String YUAN = "Ԫ";  
	public static final String JIAO = "��";  
	public static final String FEN = "��";  
	public static final String DOT = ".";  
	private static interview06 formatter = null; 

	//����AmountOfConversion��ʵ������  
	//������ʼ��һ��HashMap����  
	private HashMap NumberMap = new HashMap();  
	private HashMap HighnumberofMoney = new HashMap();  
	//������ʼ��һ��NumberFormat����  
	private NumberFormat numberFormat = 
			NumberFormat.getInstance();  
	private interview06() {    
		//����new����AmountOfConversion����ʱ��ΪHashMap�������key-value��ӳ��  
		numberFormat.setMaximumFractionDigits(4); 
		//�������ݵ�С�����ֵ����λ����4λ  
		numberFormat.setMinimumFractionDigits(2); 
		//�������ݵ�С�����ֵ���Сλ����2λ  
		numberFormat.setGroupingUsed(false);    
		/*���ô˸�ʽ���ǲ�����ʹ���顣������ÿ���ʹ���飬
	���� 1234567 ���ܱ���ʽ��Ϊ "1,234,567"*/ 
		NumberMap.put("0", ZERO);  
		NumberMap.put("1", ONE);  
		NumberMap.put("2", TWO);  
		NumberMap.put("3", THREE);  
		NumberMap.put("4", FOUR);  
		NumberMap.put("5", FIVE);  
		NumberMap.put("6", SIX);  
		NumberMap.put("7", SEVEN);  
		NumberMap.put("8", EIGHT);  
		NumberMap.put("9", NINE);  
		NumberMap.put(DOT, DOT);  
		HighnumberofMoney.put("1", TEN);  
		HighnumberofMoney.put("2", HUNDRED);  
		HighnumberofMoney.put("3", THOUSAND);  
		HighnumberofMoney.put("4", TEN_THOUSAND);  
		HighnumberofMoney.put("5", TEN);  
		HighnumberofMoney.put("6", HUNDRED);  
		HighnumberofMoney.put("7", THOUSAND);  
		HighnumberofMoney.put("8", HUNDRED_MILLION);  
	}  
	public static interview06 getInstance() { 

		//�ж�AmountOfConversion����formatter�Ƿ��ʼ��  
		if (formatter == null)  
			formatter = new interview06();  
		return formatter;  
	}  
	//���н��ת���Ķ�����������  
	public String format(String moneyStr) {  
		String result = "���ܽ��н��ת������";  
		if(isConversion(moneyStr)){  
			result = convertIntegerTochinese(moneyStr);  
			result = convertPointTochinese(result);  
		}  
		return result;  
	}  
	public String format(double moneyDouble) {  
		return format(numberFormat.format(moneyDouble));  
	}  
	public String format(int moneyInt) {  
		return format(numberFormat.format(moneyInt));  
	}  
	public String format(long moneyLong) {  
		return format(numberFormat.format(moneyLong));  
	}  
	public String format(Number moneyNum) {  
		return format(numberFormat.format(moneyNum));  
	}  
	private String convertIntegerTochinese(String moneyStr) { 

		//�������д���İ���������ת��������  
		String result;  
		StringBuffer C2CStrBufer = new StringBuffer();  
		for (int i = 0; i < moneyStr.length(); i++) {  
			C2CStrBufer.append(NumberMap.get(moneyStr.substring(  
					i, i + 1)));  
		}  
		// ʰ��Ǫ���ڵȶ��Ǻ���������еĵ�λ����������  
		int indexOfDot = C2CStrBufer.indexOf(DOT);  
		int moneyPatternCursor = 1;  
		for (int i = indexOfDot - 1; i > 0; i--) {  
			C2CStrBufer.insert(i, HighnumberofMoney.get(EMPTY  
					+ moneyPatternCursor));  
			moneyPatternCursor = moneyPatternCursor == 8 ? 1 
					: moneyPatternCursor + 1;  
		}  
		String fractionPart = C2CStrBufer.substring(C2CStrBufer  
				.indexOf("."));  
		C2CStrBufer.delete(C2CStrBufer.indexOf("."),  
				C2CStrBufer.length());  
		while (C2CStrBufer.indexOf("��ʰ") != -1) {  
			C2CStrBufer.replace(C2CStrBufer.indexOf("��ʰ"),  
					C2CStrBufer.indexOf("��ʰ") + 2, ZERO);  
		}  
		while (C2CStrBufer.indexOf("���") != -1) {  
			C2CStrBufer.replace(C2CStrBufer.indexOf("���"),  
					C2CStrBufer.indexOf("���") + 2, ZERO);  
		}  
		while (C2CStrBufer.indexOf("��Ǫ") != -1) {  
			C2CStrBufer.replace(C2CStrBufer.indexOf("��Ǫ"),  
					C2CStrBufer.indexOf("��Ǫ") + 2, ZERO);  
		}  
		while (C2CStrBufer.indexOf("����") != -1) {  
			C2CStrBufer.replace(C2CStrBufer.indexOf("����"),  
					C2CStrBufer.indexOf("����") + 2, TEN_THOUSAND);  
		}  
		while (C2CStrBufer.indexOf("����") != -1) {  
			C2CStrBufer.replace(C2CStrBufer.indexOf("����"),  
					C2CStrBufer.indexOf("����") + 2, HUNDRED_MILLION);  
		}  
		while (C2CStrBufer.indexOf("����") != -1) {  
			C2CStrBufer.replace(C2CStrBufer.indexOf("����"),  
					C2CStrBufer.indexOf("����") + 2, ZERO);  
		}  
		if (C2CStrBufer.lastIndexOf(ZERO) == C2CStrBufer.length() - 1)  
			C2CStrBufer.delete(C2CStrBufer.length() - 1,  
					C2CStrBufer.length());  
		C2CStrBufer.append(fractionPart);  
		result = C2CStrBufer.toString();  
		return result;  
	}  
	private String convertPointTochinese(String moneyStr) {  

		//��С�����������ֽ��к��ִ���  
		String result;  
		StringBuffer C2CStrBufer = new StringBuffer(moneyStr);  
		int indexOfDot = C2CStrBufer.indexOf(DOT);  
		C2CStrBufer.replace(indexOfDot, indexOfDot + 1, YUAN);  
		C2CStrBufer.insert(C2CStrBufer.length() - 1, JIAO);  
		C2CStrBufer.insert(C2CStrBufer.length(), FEN);  
		if (C2CStrBufer.indexOf("������") != -1)// û����ͷ������  
			C2CStrBufer.replace(C2CStrBufer.indexOf("������"),  
					C2CStrBufer.length(), "��");  
		else if (C2CStrBufer.indexOf("���") != -1)// û����֣�����  
			C2CStrBufer.replace(C2CStrBufer.indexOf("���"),  
					C2CStrBufer.length(), "��");  
		else {  
			if (C2CStrBufer.indexOf("���") != -1)  
				C2CStrBufer.delete(C2CStrBufer.indexOf("���"),  
						C2CStrBufer.indexOf("���") + 2);  
		}  
		result = C2CStrBufer.toString();  
		return result;  
	}  
	private boolean isConversion(String moneyStr) {  

		//�жϲ��������������Ƿ���Ͻ���ת��������  
		int fractionDigits = moneyStr.length() - 
				moneyStr.indexOf(DOT) - 1;  
		boolean flag = true;  
		if (fractionDigits > 2){  
			System.out.println("���" + moneyStr + "��С��λ������λ��");                                  
			// ���Ȳ��ܱȷֵ�  
			flag = false;  
		}  
		return flag;  

	}  
	public static void main(String args[]) {  
		System.out.println("������������");  
		Scanner scanner = new Scanner(System.in);  
		String str = scanner.next();  
		System.out.println("ת����Ľ��Ϊ��");  
		System.out.println(getInstance().format(new Double(str)));  
	}  
} 
