package excel;
import java.io.File;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class JxlReadExcel {

	/**
	 * JXL解析Excel
	 * @author David
	 * @param args
	 */
	public static void main(String[] args) {

//		readExcel();
		
		
		
		
	}
	
	/**
	 * 读取excel文件的所有行和列
	 */
	public static void readExcel(){
		try {
			//创建workbook
			Workbook workbook = Workbook.getWorkbook(new File("d:/沪深Ａ股.xls"));
			//获取第一个工作表sheet
			Sheet sheet = workbook.getSheet(0);
			//获取数据
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
