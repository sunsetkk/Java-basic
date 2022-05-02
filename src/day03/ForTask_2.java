package day03;

import java.util.Scanner;

public class ForTask_2 {
	public static void main(String[] args) {
//		1부터 10까지 출력
		for(int i = 1; i<=10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
//		10부터 1까지
		for (int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
//		12부터 3씩 증가하며 13번 출력
		for (int i = 12; i < 51; i+=3) {
			System.out.print(i + " ");
		}
		System.out.println();
		
//		100 94 88 82 .... 28 출력
		for (int i = 100; i > 28; i-=6) {
			System.out.print(i + " ");
		}
		System.out.println();
		
//		1부터 10까지 총합
		int total = 0;
		for (int i = 1; i < 11; i++) {
			total += i;
		}
		System.out.println(total);
		
//		n 하나 입력받아서 1부터 n까지 총합
		total = 0;
		int n = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("정수 n 입력 : ");
		n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			total += i;
		}
		System.out.println(total);
		
//		n, m 입력 받아서 n부터 m까지 출력하기
		n = 0;
		int m = 0;
		
		System.out.print("정수 n 입력 : ");
		n = scan.nextInt();
		System.out.print("정수 m 입력 : ");
		m = scan.nextInt();
		for (int i = n; i <= m; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
			
//		1부터 100까지 중 짝수만 출력하기
		for (int i = 1; i <= 100; i++) {
			if(i%2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
//		1부터 100까지 중 3과 5의 공배수만 출력하기
		for (int i = 1; i <= 100; i++) {
			if(i%3 == 0 && i%5 ==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
//		1부터 100까지 중 3의 배수와 5의 배수 중 공배수는 제외하고 출력하기
		//3과 5의 공배수가 아닐 조건
		//i%3 != 0 || i%5 != 0
		//!(i%3 == 0 && i%5 == 0)
		
		for (int i = 1; i <= 100; i++) {
			if(i%3 == 0 || i%5 ==0) {
				if(!(i%3 == 0 && i%5 == 0)) {
					System.out.print(i + " ");
				}
			}
		}
		System.out.println();
		
//		A부터 F까지 출력하기(아스키코드)
		for (int i = 65; i < 71; i++) {
			System.out.print((char) i + " ");
		}
		System.out.println();
		
//		AbCd...Yz 출력하기
		//A(65) a(97)
		//대문자 소문자 차이 = 32
		for (int i = 65; i < 91; i++) {
			if (i%2 == 0) {
				System.out.print((char)(i+32));
			}else {
				System.out.print((char)i);
			}
		}
		System.out.println();
		
		
		
		
//		중첩반복문 사용하지 않고 구구단 전부 출력
		for(int i = 0; i < 81; i++) {
			int dan = i/9 + 1;
			int gop = i%9+1;
			
			System.out.printf("%d X %d = %d\n", dan, gop, dan*gop);
		}
//		10진수 숫자 입력받아서 2진수로 출력하기
		int num = 0;
		String data = "";
		
		System.out.print("10진수 숫자 입력 : ");
		num = scan.nextInt();
		
		for (int i = num; i >= 1; i/=2) {
			data = i%2+data;
		}
		System.out.println(data);
		
//		ABCDefdhIJKLmnopQRSTuvwxYZ 출력
		//4로 나눈 몫 확인
		//0 1 2 3	대문자 0
		//4 5 6 7	대문자 1
		//8 9 10 11	대문자 2
		
		String result = "";
		for (int i = 0; i < 27; i++) {
			if ((i/4)%2 == 0) {
				result += (char)(65+i);
			}else {
				result += (char)(97+i);
			}
		}
		System.out.println(result);
		
//		AbCDefGHIjklMNOPqrstUVWXYz 출력
		//caseType이 true값을 가지고 있다 : 대문자로 출력
		//caseType이 false값을 가지고 있다 : 소문자로 출력
		
		int cnt = 0;
		num = 1;
		boolean caseType = true;
		
		for (int i = 0; i < 26; i++) {
			if(cnt>=num) {
				caseType = !caseType;
				cnt = 0;
				if(caseType == true) {
					num++;
				}
			}
			
			if(caseType == true) {
				System.out.print((char)(65+i));
			}else {
				System.out.print((char)(97+i));
			}
			cnt++;
		}
		

	}
}
