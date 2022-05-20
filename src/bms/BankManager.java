package bms;

import java.util.Random;

public class BankManager {
	//3개의 은행 / 1000명 고객
	Bank[][] arUser = new Bank[3][1000];
	//은행별 가입자 수 카운트
	int[] arCnt = {0,0,0};
	
	//회원가입 시 은행, 이름, 비밀번호 받고 return account(계좌번호)
	String join(int bankChoice, String name, String pw) {
		Random r = new Random();
		
		//10000~99999
		//0~89999 + 10000
		//랜덤한 5자리숫자 발급 (계좌번호)
		String account = r.nextInt(90000) + 10000 + "";
		
		//arUser[i] 첫번째 방(은행) 만큼 돌기
		for (int i = 0; i < arUser.length; i++) {
			//은행별 가입자 수 만큼 돌기
			for (int j = 0; j < arCnt[j]; j++) {
				//arUser의 계좌번호가 같냐(지금 발급받은 번호랑)
				if(arUser[i][j].account.equals(account)) {
					//같으면 다시 랜덤발급
					account = r.nextInt(90000) + 10000 + "";
					//arUser[i] -1로 만들고 처음부터 시작
					i = -1;
					break;
				}
			}
		}
		
//		중복체크 통과
		
//		Bank[] makers = {
//				new Kookmin(account, pw, name),
//				new Shinhan(account, pw, name),
//				new Woori(account, pw, name)
//		};
//		arUser[bankChoice-1][arCnt[bankChoice-1]] = makers[bankChoice-1];
//		arCnt[bankChoice-1]++;
		
		if(bankChoice == 1) {
			//국민은행
			arUser[0][arCnt[0]] = new Kookmin(account, pw, name);
			arCnt[0]++;
		}else if(bankChoice == 2) {
			//신한은행
			arUser[1][arCnt[1]] = new Shinhan(account, pw, name);
			arCnt[1]++;
		}else if(bankChoice == 3) {
			//우리은행
			arUser[2][arCnt[2]] = new Woori(account, pw, name);
			arCnt[2]++;
		}
		
		return account;
	}
	void login() {
		
	}
}
