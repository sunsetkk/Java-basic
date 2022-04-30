package day02;

import java.util.Scanner;

public class StrEquals_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String msg1 = "Hello";
		String msg2 = "";
		
		System.out.println("인사해주세요 ~");
		msg2 = scan.next();
		
		//"문자열1".equals("문자열2") : "문자열1"과 "문자열2"가 같은 문자열이면 true / 아니라면 false
//		if(msg1 == msg2) XX
		if(msg1.equals(msg2)) {
			System.out.println("인사 받아줘서 고마워요 ♡");
		}else {
			System.out.println("성격이 참 나쁘시네요......");
		}
		
//		switch(msg2) {
//		case "Hello":
//			
//			break;
//		default:
//		}
	}
}
