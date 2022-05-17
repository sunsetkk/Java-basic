package bms;

import java.util.Scanner;

//View : 사용자가 볼 화면
public class View {
	void joinView() {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("1. 국민은행\n2. 신한은행\n3. 우리은행");
		int bankChoice = scan.nextInt();
		
		System.out.println("이름 : ");
		String name = scan.next();
		System.out.println("비밀번호 : ");
		String pw = scan.next();
		
	}
	void loginView() {
		
	}
	void mainView() {
		
	}
}
