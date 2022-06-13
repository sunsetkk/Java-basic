package sync;

public class Account implements Runnable{
	int balance;

	public Account(int balance) {
		this.balance = balance;
	}
	
	synchronized void withdraw(int money) {
		this.balance -= money;
		System.out.println("ÇöÀçÀÜ¾× : "+ balance);
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
//			synchronized (this) {
//				withdraw(1000);
//			}
			withdraw(1000);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
			}
			
		}
	}
}
