package day03;

import java.util.Random;
import java.util.Scanner;

public class AnimalGame_3 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		//타이틀 출력
		System.out.println("♬스트릿 애니멀 파이터♨ ฅ^•ﻌ•^ฅ");
		//플레이하실 동물을 고르세요
		//1. 강아지
		//2. 고양이
		//3. 돼지
		while(true) {
			System.out.print("플레이하실 동물을 고르세요.\n1. 강아지ᕙ༼◕ ᴥ ◕༽ᕗ\n2. 고양이(ﾉΦωΦ)ﾉ\n3. 돼지ƪ(‾(••)‾”)ʃ ");
			int choice = scan.nextInt();
			
			int foodCnt = 0;
			int hp = 0;
			switch(choice) {
			case 1:
				foodCnt = 7;
				hp = 6;
				break;
			case 2:
				foodCnt = 5;
				hp = 8;
				break;
			case 3:
				foodCnt = 10;
				hp = 4;
				break;
			}
			
			//당신의 이름은 : 
			System.out.print("당신의 이름은 : ");
			String name = scan.next();
			
			//---반복---
			//~~님 환영합니다.
			//1. 먹기
			//	먹이 1 감소 / HP 2 증가
			//2. 잠자기
			//	HP 1증가( 3초 )
			//3. 산책하기
			//	HP 1 감소
			//	랜덤한 문제 출제 *(맞추면 먹이 2개 / 틀리면 HP 1 추가감소)
			//4. 내정보 보기
			//	이름, HP, 먹이개수 등 출력
			//5. 나가기
			while(true) {
				System.out.println(name +"님 플레이중...");
				System.out.println("1. 먹기\n2. 잠자기\n3. 산책하기\n4. 내정보 보기\n5. 나가기");
				//변수의 재사용
				//장점 : 메모리
				//단점 : 가독성
				choice = scan.nextInt();
				switch(choice) {
				case 1:
					//먹기
					if(foodCnt > 0) {
						hp += 2;
						foodCnt--;
						System.out.println(name+"이(가) 먹이를 먹고 체력을 회복했습니다...");
						System.out.println("현재 hp : "+hp);
					}else {
						System.out.println("먹이가 없어요.. 산책을 나가보세요..");
					}
					break;
				case 2:
					//잠자기
					
					break;
				case 3:
					//산책하기
					if(hp ==1 ) {
						System.out.println("지금은 산책을 나가기에 너무 위험해요... (hp : 1");
						break;
					}
					hp--;
					//랜덤 문제 출제
					Random r = new Random();
					
					break;
				case 4:
					//내정보 보기
					break;
				case 5:
					//나가기
					break;
				
				}
			}
		}
		
	}
}
