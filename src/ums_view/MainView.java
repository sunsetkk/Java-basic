package ums_view;

import java.util.ArrayList;
import java.util.Scanner;

import ums_dao.ProductDAO;
import ums_dao.Session;
import ums_dto.UserDTO;

public class MainView {
	public MainView() {
		Scanner scan = new Scanner(System.in);
		ProductDAO pdao = new ProductDAO();
		
		System.out.println("------ ����ȭ�� ------");
		
		while(true) {
			UserDTO loginUser = (UserDTO)Session.get("loginUser");
			if(loginUser == null) {
				System.out.println("�α��� �� �̿��ϼ���.");
				break;
			}
			
			System.out.println("1. ��ǰ�߰�");
			System.out.println("2. ��ǰ����");
			System.out.println("3. ��ǰ����");
			System.out.println("4. �� ��ǰ ����");
			System.out.println("5. ��ǰ�˻�");
			System.out.println("6. �� ���� ����");
			System.out.println("7. �α׾ƿ�");
			int choice = scan.nextInt();
			
			if(choice == 7) {
				System.out.println(loginUser.username + "�� ������ �� ������ ~");
				Session.set("loginUser", null);
				break;
			}
			String list = null;
			int prodnum = 0;
			switch(choice) {
			case 1:
				//��ǰ �߰�
				new AddProductView();
				break;
			case 2:
				//��ǰ ����
				new ModifyProductView(loginUser.userid);
				break;
			case 3:
				//��ǰ ����
				list = pdao.getList(loginUser.userid);
				if(list.equals("")) {
					System.out.println("�ø� ��ǰ�� �����ϴ�.");
				}else {
					System.out.print(list);
					System.out.print("������ ��ǰ ��ȣ : ");
					prodnum = scan.nextInt();
					
					if(pdao.removeProduct(prodnum)) {
						//���� ����
						System.out.println("��ǰ ���� ���� !");
					}else {
						System.out.println("��ǰ ���� ���� / ������ �ٽ� �õ��� �ּ���.");
					}
				}
				break;
			case 4:
				//�� ��ǰ ����
				System.out.println("====== ���� �ø� ��ǰ ��� ======");
				list = pdao.getList(loginUser.userid);
				if(list.equals("")) {
					System.out.println("�ø� ��ǰ�� �����ϴ�.");
				}else {
					System.out.print(list);
				}
				System.out.println("==========================");
				break;
			case 5:
				//��ǰ �˻�
				System.out.println("�˻�� �Է��ϼ��� : ");
				scan = new Scanner(System.in);
				String keyword = scan.nextLine();
				ArrayList<String> result = pdao.search(keyword);
//				"���찳"�� �˻��� ���
				System.out.println("\""+keyword+"\"�� �˻��� ���");
				if(result.size()==0) {
					System.out.println("�˻��� ����� �����ϴ�.");
				}else {
					for(String line : result) {
						String[] datas = line.split("\t");
						System.out.printf("%s. %s - %s��(�������� : %s��)\n", 
								datas[0],datas[1],datas[2],datas[3]);
					}
				}
				System.out.println("==========================");
				System.out.print("�ڼ��� �� ��ǰ��ȣ(�����÷��� 0��) : ");
				prodnum = scan.nextInt();
				new ProductInfoView(prodnum);
				
				break;
			case 6:
				//�� ���� ����
				new MyInfoView();
				break;
			
			}
			
			
			
		}
	}
	
}