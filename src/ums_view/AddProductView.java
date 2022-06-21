package ums_view;

import java.util.Scanner;

import ums_dao.ProductDAO;
import ums_dao.Session;
import ums_dto.ProductDTO;
import ums_dto.UserDTO;

public class AddProductView {
	public AddProductView() {
		Scanner scan = new Scanner(System.in);
		ProductDAO pdao = new ProductDAO();
		
		System.out.print("��ǰ �̸� : ");
		String prodname = scan.next();
		System.out.print("��ǰ ���� : ");
		int prodprice = scan.nextInt();
		System.out.print("��ǰ ��� : ");
		int prodmount = scan.nextInt();
		System.out.print("��ǰ �Ұ� : ");
		scan = new Scanner(System.in);
		String prodinfo = scan.nextLine();
		
		UserDTO loginUser = (UserDTO)Session.get("loginUser");
		
		ProductDTO newProduct = new ProductDTO(pdao.getLastNum()+1, prodname, prodprice, prodmount, prodinfo, loginUser.userid);
		
		if(pdao.addProduct(newProduct)) {
			System.out.println(prodname + " ��ǰ �߰� �Ϸ�");
		}else {
			System.out.println("��ǰ �߰� ���� / ������ �ٽ� �õ��� �ּ���.");
		}
		
	}

}