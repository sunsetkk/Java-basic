package ums_view;

import java.util.Scanner;

import ums_dao.UserDAO;

public class LoginView {
	public LoginView() {
		Scanner scan = new Scanner(System.in);
		UserDAO udao = new UserDAO();
		while(true) {
			System.out.print("���̵� : ");
			String userid = scan.next();
			System.out.print("��й�ȣ : ");
			String userpw = scan.next();
			
			if(udao.login(userid, userpw)) {
				System.out.println(userid + "�� ������� ~");
				new MainView();
				break;
			}else {
				System.out.println("�α��� ���� / �ٽ� �õ����ּ���.");
			}
			
		}
	}
	
}