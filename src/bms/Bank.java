package bms;

public class Bank {
	String account;
	String pw;
	String name;
	int balance;
	
	public Bank() {}

	public Bank(String account, String pw, String name) {
		this.account = account;
		this.pw = pw;
		this.name = name;
		this.balance = 0;
	}

	//�Ա�
	void deposit(int money) {
		this.balance += money;
	}
	
	//��� 
	void withdraw(int money) {
		if(balance >= money) {
			this.balance -= money;
		}
	}
	
	//�ܾ׺���
	void show() {
		System.out.println(name + "�� ���� ("+account +")\n�ܾ� : "+balance+"��");
		
	}
}
