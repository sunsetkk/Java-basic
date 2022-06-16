package ums_view;

import java.util.Scanner;

import ums_dao.UserDAO;

public class LoginView {
	public LoginView() {
		Scanner scan = new Scanner(System.in);
		UserDAO udao = new UserDAO();
		while(true) {
			System.out.print("아이디 : ");
			String userid = scan.next();
			System.out.print("비밀번호 : ");
			String userpw = scan.next();
			
			if(udao.login(userid, userpw)) {
				System.out.println(userid + "님 어서오세요 ~");
				new MainView();
				break;
			}else {
				System.out.println("로그인 실패 / 다시 시도해주세요.");
			}
			
		}
	}
	
}
