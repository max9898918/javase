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

		System.out.println("账户余额: " + account.getBalance());
	}
}
/**
 * 银行账号
 * @author Administrator
 *
 */
class Account {
	private double balance;     // 账户余额

	/**
	 * 存款
	 * @param money 存入金额
	 */
	public void deposit(double money) {
		double newBalance = balance + money;
		try {
			Thread.sleep(10);   // 模拟此业务需要一段处理时间
		}
		catch(InterruptedException ex) {
			ex.printStackTrace();
		}
		balance = newBalance;
	}

	/**
	 * 获得账户余额
	 */
	public double getBalance() {
		return balance;
	}
}

/**
 * 存钱线程
 * @author Administrator
 *
 */
class AddMoneyThread implements Runnable {
	private Account account;    // 存入账户
	private double money;       // 存入金额

	public AddMoneyThread(Account account, double money) {
		this.account = account;
		this.money = money;
	}

	@Override
	public void run() {
		account.deposit(money);
	}

}