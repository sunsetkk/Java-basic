package ums_view;

import java.util.Scanner;

import ums_dao.ProductDAO;
import ums_dao.Session;
import ums_dao.UserDAO;
import ums_dto.UserDTO;

public class MyInfoView {
	public MyInfoView() {
		Scanner scan = new Scanner(System.in);
		UserDAO udao = new UserDAO();
		ProductDAO pdao = new ProductDAO();
		
		UserDTO loginUser = (UserDTO)Session.get("loginUser");
		System.out.printf("====== %s���� ȸ������ ======\n���̵� : %s\n��й�ȣ : %s\n�ڵ��� ��ȣ : %s\n�ּ� : %s\n",
				loginUser.username, loginUser.userid, loginUser.userpw, loginUser.userphone, loginUser.useraddr);
		System.out.println("========================");
		System.out.println("1.��й�ȣ ����\n2. �ڵ�����ȣ ����\n3. �ּ� ����\n4. �������\n5. ȸ��Ż��");
		int choice = scan.nextInt();
		if(choice == 4) {
			System.out.println("�������� ���ư��ϴ�.");
		}else if(choice == 5) {
			//ȸ��Ż��
			System.out.print("��й�ȣ ���Է� : ");
			String userpw = scan.next();
			if(loginUser.userpw.equals(userpw)) { //��й�ȣ Ȯ��
				if(pdao.removeAll(loginUser.userid)) {
					if(udao.leaveId(loginUser.userid)) {
						System.out.println("�׵��� �̿��� �ּż� �����մϴ�...");
					}
				}
			}else {
				System.out.println("��й�ȣ ���� / ������ �ٽ� �õ����ּ���.");
			}
			
			
		}else {
			//��������
			System.out.print("���ο� ���� : ");
			scan = new Scanner(System.in);
			String newData = scan.nextLine();
			boolean check = false;
			
			switch(choice) {
			case 1:
				//��й�ȣ ����
				check = udao.modifyUser(loginUser.userid, 1, newData);
				break;
//			case 2:
//				//�ڵ�����ȣ ����
//				udao.modifyUser(loginUser.userid, 4, newData);
//				break;
//			case 3:
//				//�ּ� ����
//				udao.modifyUser(loginUser.userid, 5, newData);
//				break;
				
			case 2: case 3:
				check = udao.modifyUser(loginUser.userid, choice+2, newData);
				break;
			}
			if(check) {
				System.out.println("���� ���� �Ϸ�!");
			}else {
				System.out.println("���� ���� ���� / ������ �ٽ� �õ��� �ּ���.");
			}
			
			
		}
		
	}

}