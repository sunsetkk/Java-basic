package bms;

import java.util.Random;

public class BankManager {
	Bank[][] arUser = new Bank[3][1000];
	int[] arCnt = {0,0,0};
	
	void join(int bankChoice, String name, String pw) {
		Random r = new Random();
		
		//10000~99999
		//0~89999 + 10000
		String account = r.nextInt(90000) + 10000 + "";
		
		for (int i = 0; i < arUser.length; i++) {
			for (int j = 0; j < arUser[i].length; j++) {
				if(arUser[i][j].account.equals(account)) {
					account = r.nextInt(90000) + 10000 + "";
					i = -1;
					break;
				}
			}
		}
		
//		중복체크 통과
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
		
	}
	void login() {
		
	}
}
