package fms;

import java.util.Scanner;

public class Index {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FileManager fm = new FileManager();
		
		System.out.println("FMS 입니다.");
		while(true) {
			System.out.println("1. 내용추가\n2. 내용수정\n3. 내용삭제\n4. 전체 목록보기\n5. 나가기");
			int choice = scan.nextInt();
			
			if(choice == 5) {
				System.out.println("안녕히가세요.");
				break;
			}
			
			String newData = "";
			String delData = "";
			
			switch (choice) {
			case 1:
				//내용추가
				System.out.println("추가할 내용을 입력하세요 !");
				newData = scan.next();
				
				if(fm.insert(newData)) {
					System.out.println("내용 추가 성공 ! \n추가된 내용 : "+newData);
				}else {
					System.out.println("내용 추가 실패...");
				}
				System.out.println("-------------------------");
				break;
			case 2:
				//내용수정
				System.out.println("수정할 내용 : ");
				delData = scan.next();
				System.out.println("새로운 내용 :");
				newData = scan.next();
				
				if(fm.modify(delData, newData)) {
					System.out.println("내용 수정 성공 !\n"+ delData+" -> " + newData);
				}else {
					System.out.println("내용 수정 실패...");
				}
				System.out.println("-------------------------");
				break;
			case 3:
				//내용삭제
				System.out.println("삭제할 내용을 입력하세요 !");
				delData = scan.next();
				
				if(fm.delete(delData)) {
					System.out.println("내용 삭제 성공 !\n삭제된 내용" + delData);
				}else {
					System.out.println("내용 삭제 실패...");
				}
				System.out.println("-------------------------");
				
				break;
			case 4:
				//전체 목록보기
				String result = fm.selectAll();
				if(result == null) {
					System.out.println("내용 읽기 실패 ...");
				}else {
					System.out.println("------lang.txt 내용------");
					if(result.equals("")) {
						System.out.println("파일에는 아무 내용이 없습니다.");
					}else {
						System.out.println(result);
					}
					System.out.println("-------------------------");
				}
				break;
			}
			
		}
	}
}
 