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
			System.out.println("올린 상품이 없습니다.");
		}else {
			System.out.print(list);
			System.out.print("수정할 상품 번호 : ");
			int prodnum = scan.nextInt();
			System.out.println("1. 가격수정\n2. 재고수정\n3. 설명수정");
			int choice = scan.nextInt();
			System.out.print("새로운 정보 :");
			scan = new Scanner(System.in);
			String newData = scan.nextLine();
			
			boolean check = false;
			
			switch(choice) {
			case 1: case 2: case 3:
				//가격수정
				check = pdao.modifyProduct(prodnum+"", choice+1, newData);
				break;
//			case 2:
				//재고수정
//				pdao.modifyProduct(prodnum, choice, newData);
//				break;
//			case 3:
				//설명수정
//				pdao.modifyProduct(prodnum, choice, newData);
//				break;
			
			}
			if(check) {
				System.out.println(prodnum + "번 상품 수정 완료 !");
			}else {
				System.out.println("상품 수정 실패 / 다음에 다시 시도해 주세요.");
			}
		}
	}

}
