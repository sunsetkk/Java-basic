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
		
		System.out.print("상품 이름 : ");
		String prodname = scan.next();
		System.out.print("상품 가격 : ");
		int prodprice = scan.nextInt();
		System.out.print("상품 재고 : ");
		int prodmount = scan.nextInt();
		System.out.print("상품 소개 : ");
		scan = new Scanner(System.in);
		String prodinfo = scan.nextLine();
		
		UserDTO loginUser = (UserDTO)Session.get("loginUser");
		
		ProductDTO newProduct = new ProductDTO(pdao.getLastNum()+1, prodname, prodprice, prodmount, prodinfo, loginUser.userid);
		
		if(pdao.addProduct(newProduct)) {
			System.out.println(prodname + " 상품 추가 완료");
		}else {
			System.out.println("상품 추가 실패 / 다음에 다시 시도해 주세요.");
		}
		
	}

}
