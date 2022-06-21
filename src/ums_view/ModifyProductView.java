package ums_view;

import java.util.Scanner;

import ums_dao.ProductDAO;

public class ModifyProductView {
	public ModifyProductView(String userid) {
		Scanner scan = new Scanner(System.in);
		ProductDAO pdao = new ProductDAO();
		
		String list = null;
		
		list = pdao.getList(userid);
		if(list == "") {
			System.out.println("�ø� ��ǰ�� �����ϴ�.");
		}else {
			System.out.print(list);
			System.out.print("������ ��ǰ ��ȣ : ");
			int prodnum = scan.nextInt();
			System.out.println("1. ���ݼ���\n2. �������\n3. ��������");
			int choice = scan.nextInt();
			System.out.print("���ο� ���� :");
			scan = new Scanner(System.in);
			String newData = scan.nextLine();
			
			boolean check = false;
			
			switch(choice) {
			case 1: case 2: case 3:
				//���ݼ���
				check = pdao.modifyProduct(prodnum+"", choice+1, newData);
				break;
//			case 2:
				//�������
//				pdao.modifyProduct(prodnum, choice, newData);
//				break;
//			case 3:
				//��������
//				pdao.modifyProduct(prodnum, choice, newData);
//				break;
			
			}
			if(check) {
				System.out.println(prodnum + "�� ��ǰ ���� �Ϸ� !");
			}else {
				System.out.println("��ǰ ���� ���� / ������ �ٽ� �õ��� �ּ���.");
			}
		}
	}

}