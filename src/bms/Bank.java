package bms;

public class Bank {
	String account;
	String pw;
	String name;
	int balance;
	
	public Bank(String account, String pw, String name) {
		this.account = account;
		this.pw = pw;
		this.name = name;
		this.balance = 0;
	}

	//입금
	void deposit(int money) {
		this.balance += money;
	}
	
	//출금 
	void withdraw(int money) {
		if(balance >= money) {
			this.balance -= money;
		}
	}
	
	//잔액보기
	void show() {
		System.out.println(name + "님 계좌 ("+account +")\n잔액 : "+balance+"원");
		
	}
}
