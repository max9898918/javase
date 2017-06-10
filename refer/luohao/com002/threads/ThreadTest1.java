package com002.threads;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadTest1 {
	public static void main(String[] args) {
		Account account = new Account();
		ExecutorService service = Executors.newFixedThreadPool(100);

		for(int i = 1; i <= 100; i++) {
			service.execute(new AddMoneyThread(account, 1));
		}

		service.shutdown();

		while(!service.isTerminated()) {}

		System.out.println("�˻����: " + account.getBalance());
	}
}
/**
 * �����˺�
 * @author Administrator
 *
 */
class Account {
	private double balance;     // �˻����

	/**
	 * ���
	 * @param money ������
	 */
	public void deposit(double money) {
		double newBalance = balance + money;
		try {
			Thread.sleep(10);   // ģ���ҵ����Ҫһ�δ���ʱ��
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		balance = newBalance;
	}

	/**
	 * ����˻����
	 */
	public double getBalance() {
		return balance;
	}
}

/**
 * ��Ǯ�߳�
 * @author Administrator
 *
 */
class AddMoneyThread implements Runnable {
	private Account account;    // �����˻�
	private double money;       // ������

	public AddMoneyThread(Account account, double money) {
		this.account = account;
		this.money = money;
	}

	@Override
	public void run() {
		account.deposit(money);
	}

}