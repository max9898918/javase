package a020_io;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class A001_File {
	public static void main(String[] args) {
		A001_File file = new A001_File();
		List<File> files = file.getFiles(new File("D://test"), "txt");

		for(int i=0;i<files.size();i++){
			System.out.println(files.get(i));
		}
	}

	/**
	 * 此方法获取文件夹中所有.txt文件名字
	 * @param fileDir  File对象实例
	 * @param fileType 文件类型(如：txt)
	 * @return 文件夹中.txt文件名List集合
	 */
	public List<File> getFiles(File fileDir, String fileType) {
		List<File> lfile = new ArrayList<File>();
		File[] fs = fileDir.listFiles();
		for (File f : fs) {
			if (f.isFile()) { //判断是不是文件夹
				if (fileType.equals(f.getName().substring(f.getName().lastIndexOf(".") + 1,f.getName().length()))) lfile.add(f);
			} else {  //如果文件中还有文件、获取在文件中的所有.txt文件路径
				List<File> ftemps = getFiles(f,fileType);
				lfile.addAll(ftemps);
			}
		}
		return lfile;
	}

}
