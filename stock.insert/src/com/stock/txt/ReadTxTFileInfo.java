package com.stock.txt;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


/**
 * 读取文件夹中所有的.txt文件
 * @author Admin
 *
 */
public class ReadTxTFileInfo {
	/**
	 * 测试有没有执行成功
	 * @param args
	 */
	public static void main(String[] args) {
		ReadTxTFileInfo f = new ReadTxTFileInfo();
		List<File> ll = f.getFiles(new File("d:\\test"),"txt");
		//System.out.println(ll.size());
		for (File ff : ll) {
			System.out.println(ff.getPath());
		}
	}
	/**
	 * 此方法获取文件夹中所有.txt文件名字
	 * @param fileDir  (文件夹)
	 * @param fileType (文件类型)
	 * @return 文件夹中.txt文件名List集合
	 */
	public List<File> getFiles(File fileDir, String fileType) {
		List<File> lfile = new ArrayList<File>();
		File[] fs = fileDir.listFiles();
		for (File f : fs) {
			if (f.isFile()) {
				if (fileType.equals(f.getName().substring(
						f.getName().lastIndexOf(".") + 1,
						f.getName().length())))
					lfile.add(f);
			} else {  //如果文件中还有文件、获取在获取文件中的所有.txt文件路径
				List<File> ftemps = getFiles(f,fileType);
				lfile.addAll(ftemps);
			}
		}
		return lfile;
	}
}
