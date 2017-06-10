package excel;
import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class JxlReadExcel {

	/**
	 * JXL����Excel
	 * @author David
	 * @param args
	 */
	public static void main(String[] args) {

//		readExcel();
		
		
		
		
	}
	
	/**
	 * ��ȡexcel�ļ��������к���
	 */
	public static void readExcel(){
		try {
			//����workbook
			Workbook workbook = Workbook.getWorkbook(new File("d:/�������.xls"));
			//��ȡ��һ��������sheet
			Sheet sheet = workbook.getSheet(0);
			//��ȡ����
			for (int i = 1; i < sheet.getRows(); i++) {
				for (int j = 0; j < sheet.getColumns(); j++) {
					Cell cell = sheet.getCell(j,i);
					System.out.print(cell.getContents() + "  ");
				}
				System.out.println();
			}
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
