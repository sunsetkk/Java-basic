package ums_view;

import java.util.Scanner;

import ums_dao.DBConnection;
import ums_dao.ProductDAO;
import ums_dto.ProductDTO;

public class ProductInfoView {
	public ProductInfoView(int prodnum) {
		Scanner scan = new Scanner(System.in);
		ProductDAO pdao = new ProductDAO();
		
		ProductDTO product = pdao.get(prodnum);
		if(product == null) {
			System.out.println("잘못된 페이지입니다. / 다음에 다시 시도해 주세요.");
		}else {
			while(true) {
				product = pdao.get(prodnum);
				System.out.println("======================");
				System.out.println("상품명 : "+ product.prodname);
				System.out.println("올린이 : "+ product.userid+"\t♥ : "+product.likecnt);
				System.out.println("가격 : "+ product.prodprice + "원");
				System.out.println("남은 수량 : "+ product.prodmount + "개");
				System.out.println("상세설명 \n"+ product.prodinfo);
				System.out.println("======================");
				System.out.println("1. 좋아요 누르기\n2. 구매하기\n3. 뒤로가기");
				int choice = scan.nextInt();
				if(choice == 3) {
					break;
				}
				if(choice == 1) {
					//좋아요 누르기
					if(pdao.updatelikeCnt(prodnum)) {
						System.out.println("좋아요 ~ ♡");
					}else {
						System.out.println("좋아요 누르기 실패 / 다음에 다시 시도해주세요");
					}
				}
			}
		}
		
	}

}
