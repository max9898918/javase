package com.stock.txt;

import java.io.File;
import java.util.ArrayList;
import java.util.List;


/**
 * ��ȡ�ļ��������е�.txt�ļ�
 * @author Admin
 *
 */
public class ReadTxTFileInfo {
	/**
	 * ������û��ִ�гɹ�
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
	 * �˷�����ȡ�ļ���������.txt�ļ�����
	 * @param fileDir  (�ļ���)
	 * @param fileType (�ļ�����)
	 * @return �ļ�����.txt�ļ���List����
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
			} else {  //����ļ��л����ļ�����ȡ�ڻ�ȡ�ļ��е�����.txt�ļ�·��
				List<File> ftemps = getFiles(f,fileType);
				lfile.addAll(ftemps);
			}
		}
		return lfile;
	}
}
