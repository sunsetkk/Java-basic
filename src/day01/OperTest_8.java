package day01;

import java.util.Scanner;

public class OperTest_8 {
	public static void main(String[] args) {
		System.out.println(14&17);
		System.out.println(~14);
		System.out.println(true);
		boolean check = 10>7;
		
		Scanner scan = new Scanner(System.in);
		//변수 초기화 (정수:0, 실수:0.0, 0.0F, 문자:' ', 
		//			문자열:"", 논리형:보통false, 그 외:null)
		int num = 0;
		String result ="";
		
		System.out.print("정수 : ");
		num = scan.nextInt();

		result = num>0 ? "양수입니다.": "음수입니다.";
		result = num == 0 ? "0입니다." : result ;
		
		System.out.println(num+"은(는) "+result);
	}
}
