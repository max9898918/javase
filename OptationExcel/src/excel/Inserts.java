package excel;

import java.io.File;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import com.jdbc.utils.JdbcUtils;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class Inserts {
	static Connection con = JdbcUtils.getMysqlCon("ECharts");

	public static void main(String[] args) {
		insertsDatabase();
//		System.out.println("最大的下标为："+getMaxID(" stock_database")+"  \n请打开注释导入数据");
//		System.out.println(getSQL("INSERT INTO stock_database ", 23)+ getMaxID(" stock_database"));
		
	}
	/**
	 * 导入数据的方法
	 */
	public static void insertsDatabase(){
		System.out.println("正在导入数据！请稍等...");

		
		Connection conn = JdbcUtils.getMysqlCon("ECharts");
		
		int maxID = getMaxID(" stock_database"),sumColumn =0;
		
		
		String date = getDate();
		int week=getWeek();
		//需要静态数据时打开注释
		//String date ="";
		//int week = 1;
		
		
		//打印星期和日期
		//System.out.println(date+"  星期："+week);
		
		
		try {
			PreparedStatement pstmt = conn.prepareStatement(getSQL("INSERT INTO stock_database ", 23));
			
			//创建workbook
			Workbook workbook = Workbook.getWorkbook(new File("d:/沪深Ａ股.xls"));
			//获取第一个工作表sheet
			Sheet sheet = workbook.getSheet(0);
			//获取数据
			for (int i = 1; i < sheet.getRows()-1; i++) {
				++sumColumn;
				++maxID;
				//设置要插入的值
				pstmt.setString(1, maxID+"");
				pstmt.setInt(2, 0);
				
				
				for (int j = 0; j < sheet.getColumns(); j++) {

					Cell cell = sheet.getCell(j,i);
					if( cell.getContents().indexOf("--")!=-1 ){
						//System.out.print(0+"     ");
						pstmt.setString(j+3, "0");
					
					}else{
						pstmt.setString(j+3,cell.getContents());
						//System.out.print(cell.getContents() + "  ");
						
						
					}
				}
				pstmt.setString(21, date);
				pstmt.setInt(22, week);
				pstmt.setString(23, "普通");
				pstmt.executeUpdate();
//				System.out.println();
			}
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}

		System.out.println("成功插入了"+sumColumn+"条数据！一共有"+maxID+"条数据，谢谢使用！");
	}


	/**
	 * 获取sql的方法
	 * @param table
	 * @param columns
	 * @return
	 */

	public static String getSQL(String sql1,int columns){

		StringBuffer sql = new StringBuffer();
		sql.append(sql1+" VALUES(");
		for(int i =1;i<=columns;i++){
			sql.append("?");
			if(i!=columns){
				sql.append(",");
			}
		}
		sql.append(");");

		//		System.out.println(sql.toString());
		return sql.toString();
	}
	/**
	 * 得到当前日期
	 * @return 当前日期
	 */
	public static String getDate(){
		Date date=new Date();
		//拿到时间日期这样写"yyyy-MM-dd HH:mm:ss"

		//拿到系统日期
		SimpleDateFormat matter1=new SimpleDateFormat("yyyy-MM-dd");

		//System.out.println(matter1.format(date));
		return matter1.format(date);
	}


	/**
	 * 获取星期几
	 * @return
	 */
	public static int getWeek() {
		Date date = new Date();
		Calendar cal = Calendar.getInstance();
		cal.setTime(date);
		return (cal.get(Calendar.DAY_OF_WEEK)-1);
	}

	/**
	 * 获取最大的下标
	 * @return
	 */
	public static int getMaxID(String table){
		String sql = " SELECT MAX(CAST(fID AS DECIMAL(10,1))) maxID FROM stock_database";
		int maxID = 0;
		try {
			Statement stmt = con.createStatement();
			ResultSet result = stmt.executeQuery(sql);
			while(result.next()){
				maxID = result.getInt(1);
			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return maxID;

	}


	/**
	 * 基础数据
	 */
	public static void insertsSituations(){




		try {
			String sql = " INSERT INTO stock_situations(fID,version,fSecurityCode,fSecurityName,fZhangFu,fXianJia,fZhangDie,fBuyPrice,fSellPrice,fZongLiang,fXianLiang,fZhangSu,fHuanShou,fJinKai,fZuiGao,fZuiDi,fZuoShou,fQuanTianZhenFu,fKaiPanZhangDie,fShangYing,fXiaYing,fDate) ";
			PreparedStatement pstmt = con.prepareStatement(getSQL(sql,22));


			//创建workbook
			Workbook workbook = Workbook.getWorkbook(new File("d:/沪深Ａ股.xls"));
			//获取第一个工作表sheet
			Sheet sheet = workbook.getSheet(0);
			String s = "",x="",date = getDate();



			int id = getMaxID(" stock_situations");
			BigDecimal current = null, max =null, min = null, zuoshou = null, jinkai = null;
			boolean flag = false;


			//获取数据
			for (int i = 1; i < sheet.getRows(); i++) {
				pstmt.setString(1, ++id+"");
				pstmt.setInt(2, 0);

				for (int j = 0; j < sheet.getColumns(); j++) {
					Cell cell = sheet.getCell(j,i);

					if(cell.getContents().indexOf("--")!=-1){
						pstmt.setString(j+3, "0");
					}else{
						pstmt.setString(j+3, cell.getContents());
					}



					if(j==3){
						if(cell.getContents().indexOf("--")!=-1){
							flag = true;
						}else{

							current = new BigDecimal(cell.getContents());

						}
					}

					if(j==11){
						if(cell.getContents().indexOf("--")!=-1){
							flag = true;
						}else{

							jinkai = new BigDecimal(cell.getContents());

						}
					}

					if(j==12){
						if(cell.getContents().indexOf("--")!=-1){
							flag = true;
						}else{

							max = new BigDecimal(cell.getContents());

						}
					} 

					if(j==13){
						if(cell.getContents().indexOf("--")!=-1){
							flag = true;
						}else{

							min = new BigDecimal(cell.getContents());

						}
					}

					if(j==14){
						if(cell.getContents().indexOf("--")!=-1){
							flag = true;
						}else{

							zuoshou = new BigDecimal(cell.getContents());

						}
					}

					//					System.out.print(j+" "+cell.getContents() + "     ");

				}

				//内层for循环结束,计算各种参数
				if(flag){
					for(int index = 18;index<=21;index++){
						pstmt.setString(index, "0");
					}

					//					System.out.println("有一个没有转换");
				}else{
					//					System.out.println("振幅："+result(max,min,jinkai));
					//					System.out.println("开涨："+ result(jinkai,zuoshou,jinkai));
					pstmt.setString(18, result(max,min,jinkai));
					pstmt.setString(19, result(jinkai,zuoshou,jinkai));


					if(current.doubleValue() > jinkai.doubleValue()){
						s = result(max,current,current);
						x = result(jinkai,min,jinkai);

						//						System.out.println("上"+result(max,current,current));
						//						System.out.println("下"+result(jinkai,min,jinkai));
					}else{

						s = result(max,jinkai,jinkai);
						x = result(current,min,current);


						//						System.out.println("上"+result(max,jinkai,jinkai));
						//						System.out.println("下"+result(current,min,current));
					}

					pstmt.setString(20, s);
					pstmt.setString(21, x);

					//					System.out.println();
				}


				pstmt.setString(22, date);
				//给falg重新赋值
				flag =false;
				pstmt.executeUpdate();



			}
			System.out.println("成功插入了 "+id+" 行！");
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	/**
	 * /先减后除，得到想要的结果
	 * @param b1
	 * @param b2
	 * @param b3
	 * @return
	 */

	public static String result(BigDecimal b1,BigDecimal b2,BigDecimal b3){
		//先减后除，带到先要的结果
		BigDecimal divide = b1.subtract(b2).divide(b3,10,BigDecimal.ROUND_HALF_UP);
		return divide.setScale(3,BigDecimal.ROUND_HALF_UP).toString();
	}

	/**
	 * 读取excel文件的所有行和列
	 */
	public static void readExcel(){
		try {
			Scanner in = new Scanner(System.in);

			//创建workbook
			Workbook workbook = Workbook.getWorkbook(new File("d:/沪深Ａ股.xls"));
			//获取第一个工作表sheet
			Sheet sheet = workbook.getSheet(0);
			System.out.println("有"+sheet.getRows()+"行   "+sheet.getColumns()+"列数据！");
			System.out.println("输入y打印数据！");
			String nextLine = in.nextLine();
			//获取数据
			if("y".equals(nextLine)){

				for (int i = 1; i < sheet.getRows(); i++) {
					for (int j = 0; j < sheet.getColumns(); j++) {
						Cell cell = sheet.getCell(j,i);
						System.out.print(cell.getContents() + "  ");
					}
					System.out.println();
				}
			}
			workbook.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
