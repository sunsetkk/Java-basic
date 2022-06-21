package ums_view;

import java.util.Scanner;

import ums_dao.UserDAO;
import ums_dto.UserDTO;

public class JoinView {
	public JoinView() {
		Scanner scan = new Scanner(System.in);
		UserDAO udao = new UserDAO();
		
		while(true) {
			System.out.println("------ ȸ������ ������ �Դϴ�. ------");
			System.out.print("���̵� : ");
			String userid = scan.next();
			if(udao.checkId(userid)) {
				System.out.print("��й�ȣ : ");
				String userpw = scan.next();
				if(userpw.length()>=8) {
					System.out.print("�̸� : ");
					String username = scan.next();
					System.out.print("���� : ");
					int userage = scan.nextInt();
					System.out.print("�ڵ�����ȣ : ");
					String userphone = scan.next();
					System.out.print("�ּ� : ");
					scan = new Scanner(System.in);
					String useraddr = scan.nextLine();
					
					UserDTO newUser = new UserDTO(userid, userpw, username, userage, userphone, useraddr);
					if(udao.join(newUser)) {
						System.out.println("ȸ������ ���� !");
						break;
					} else {
						System.out.println("ȸ������ ���� / ������ �ٽ� �õ����ּ���.");
						break;
					}
				} else {
					System.out.println("��й�ȣ�� 8�� �̻��̾�� �մϴ�.");
				}
			} else {
				System.out.println("�ߺ��� ���̵� �ֽ��ϴ�.");
			}
		}
		
	}

}