package day16.itcastset;

import java.util.Iterator;
import java.util.TreeSet;
/*
���󣺽��ַ����е���ֵ��������
		����String str="8 10 15 5 2 7"; ---->   "2 5 7 8 10 15"
*/

public class Demo8 {
	
	public static void main(String[] args) {
		String str="8 10 15 5 2 7";
		String[] datas = str.split(" ");
		
		TreeSet tree = new TreeSet();
		for(int i = 0 ; i<datas.length ; i++){
			tree.add(Integer.parseInt( datas[i])); // �ַ���תint������������Ҫʹ��Integer.parseInt()
		}
		
		//����treeSet��Ԫ��ƴ�ӳɶ�Ӧ���ַ���
		Iterator it = tree.iterator();
		while(it.hasNext()){
			System.out.print(it.next()+" ");
		}
		
	}

}
