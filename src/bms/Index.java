package bms;

import java.util.Scanner;

//Index : 처음으로 시작되는 곳
public class Index {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//뷰 클래스를 사용하기 위해 객체화 진행
		View v = new View();
		
		System.out.println("BMS 프로그램 입니다.");
		//프로그램을 실행하기 위해 while문
		while(true) {
			System.out.println("1. 계좌개설\n2. 로그인\n3. 나가기");
			int choice = scan.nextInt();
			
			//3. 나가기 선택시 while문 탈출 (프로그램 종료)
			if(choice == 3) {
				System.out.println("안녕히가세요.");
				break;
			}
			//choice 변수에 담긴 값에 따라 흐름을 나누기 위해 switch문 사용
			switch(choice) {
			case 1:
				//계좌개설
				v.joinView();	//뷰 클래스의 회원가입 뷰 메서드로 이동
				break;
			case 2:
				//로그인
				v.loginView();	//뷰 클래스의 로그인 뷰 메서드로 이동
				break;
			}
		}
	}
}
