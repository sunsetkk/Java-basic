package bms;

import java.util.Scanner;

//View : 사용자가 볼 화면
public class View {
	void joinView() {
		Scanner scan = new Scanner(System.in);
		//View딴은 사용자가 보는 화면이기 때문에
		//처리 부분은 BankManager 클래스 안에서 처리
		BankManager bm = new BankManager();
		
		System.out.println("1. 국민은행\n2. 신한은행\n3. 우리은행");
		int bankChoice = scan.nextInt();
		
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.print("비밀번호 : ");
		String pw = scan.next();
		
		String account = bm.join(bankChoice, name, pw);
		
		if(account != null) {
			System.out.println(name + "님 가입을 환영합니다~");
			System.out.println("계좌번호 : "+ account);
		}else {
			System.out.println("가입 실패.");
		}
		
	}
	void loginView() {
		
	}
	void mainView() {
		
	}
}
