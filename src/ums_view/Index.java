package ums_view;

import java.util.Scanner;

//MVC1 모델
public class Index {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("국비반 최종 프로젝트 UMS");
		
		while(true) {
			System.out.println("1. 회원가입\n2. 로그인\n3. 나가기");
			int choice = scan.nextInt();
			
			if(choice == 1) {
				//회원가입
				new JoinView();
			}
			else if(choice == 2) {
				//로그인
				new LoginView();
			}
			else if(choice == 3) {
				//나가기
				System.out.println("다음에 또 오세요 ~ ");
				break;
			}
		}
	}
}
