package com.m17_6;

import org.junit.Test;

/**
 * �����¼�����г��õ�һЩ֪ʶ��
 * 1��break1��break2��������Ƕ��ѭ����breakֻ��������ǰѭ������
 * 2��rank5����������
 * @author Administrator
 *
 */
public class InCommonUse{
	//���ǳ������ڣ����������ִ��
	public static void main(String [] args){
		
	}

	public void run3(String c){
	}
	
	/**
	 * ��ӡ����
	 * @param row
	 */
	public void test2(int row){
		for(int i=0;i<row;i++){
			if(i<=row/2){
				for(int j = 0;j<row-i;j++){
					System.out.print(" ");
				}

				for(int j = 0;j<=i*2;j++){
					System.out.print("*");
				}
				System.out.println();
			}else{
				for(int j=1;j<=(i-(row/2+1));j++){
					System.out.print(" ");
				}

				for(int j = 1;(j<2*(row/2+1)-i);j++){
					System.out.print("*");
				}
				System.out.println();
			}
		}
	}
	/**
	 * ��ӡ������
	 * @param row
	 */
	public void test1(int row){
		for(int i=0;i<row;i++){
			for(int j=0;j<row-i;j++){
				System.out.print(" ");
			}

			for(int k=0;k<=i*2;k++){
				System.out.print("*");
			}

			System.out.println();
		}
	}



	@Test
	public void bradk1(){
		ok:
			for(int i=0;i<10;i++)    {
				for(int j=0;j<10;j++){
					System.out.println("i="+i+",j="+j);
					if(j == 5) break ok;
				}
			}
	}
	
	@Test
	public void break2(){
		int arr[][] ={{1,2,3},{4,5,6,7},{9}};

		boolean found = false;

		for(int i=0;i<arr.length&& !found;i++)       {

			for(int j=0;j<arr[i].length;j++){

				System.out.println("i=" + i + ",j=" + j);

				if(arr[i][j]  ==5) {

					found = true;

					break;

				}

			}

		}
	}
}