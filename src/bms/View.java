package bms;

import java.util.Scanner;

//View : ����ڰ� �� ȭ��
public class View {
	void joinView() {
		Scanner scan = new Scanner(System.in);
		BankManager bm = new BankManager();
		
		System.out.println("1. ��������\n2. ��������\n3. �츮����");
		int bankChoice = scan.nextInt();
		
		System.out.print("�̸� : ");
		String name = scan.next();
		System.out.print("��й�ȣ : ");
		String pw = scan.next();
		
		String account = bm.join(bankChoice, name, pw);
		
		if(account != null) {
			System.out.println(name + "�� ������ ȯ���մϴ�~");
			System.out.println("���¹�ȣ : "+ account);
		}else {
			System.out.println("���� ����.");
		}
		
	}
	void loginView() {
		
	}
	void mainView() {
		
	}
}