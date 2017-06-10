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
	 * �˷�����ȡ�ļ���������.txt�ļ�����
	 * @param fileDir  File����ʵ��
	 * @param fileType �ļ�����(�磺txt)
	 * @return �ļ�����.txt�ļ���List����
	 */
	public List<File> getFiles(File fileDir, String fileType) {
		List<File> lfile = new ArrayList<File>();
		File[] fs = fileDir.listFiles();
		for (File f : fs) {
			if (f.isFile()) { //�ж��ǲ����ļ���
				if (fileType.equals(f.getName().substring(f.getName().lastIndexOf(".") + 1,f.getName().length()))) lfile.add(f);
			} else {  //����ļ��л����ļ�����ȡ���ļ��е�����.txt�ļ�·��
				List<File> ftemps = getFiles(f,fileType);
				lfile.addAll(ftemps);
			}
		}
		return lfile;
	}

}
