package com.kh.chap03_sync.sync;

public class Atm1 implements Runnable{
	
	private Account acc;
	
	public Atm1() {
		
	}
	public Atm1(Account acc) {
		this.acc = acc;
	}
	
	@Override
	public void run() {
		while(acc.getBalance()>0) {
			int money = (int)(Math.random() *3 + 1)*100; // 100, 200, 300
			acc.withdraw(money);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName());
	}
	
}
