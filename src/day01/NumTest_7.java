package day01;

import java.util.Scanner;

public class NumTest_7 {
	public static void main(String[] args) {
//		int data = 3;
//		System.out.println(10/data);
		
		//입력
		Scanner scan = new Scanner(System.in);
		System.out.print("첫번째 정수 : ");
		String num1 = scan.next();
		System.out.print("두번째 정수 : ");
		String num2 = scan.next();
		
		//처리
//		int realNum1 = (int)num1;
//		문자열은 클래스 타입이기 때문에 형변환 연산자로 자료형을 바꿀 수 없다.
//		Integer.parseInt("정수로된문자열") : 통째로 정수로 해석해서 돌려준다. (int)
//		Double.parseDouble(), ....
		int realNum1 = Integer.parseInt(num1);
		int realNum2 = Integer.parseInt(num2);
		
		int result = realNum1 + realNum2;
		
		//출력
//		System.out.println("결과 : "+ (realNum1+realNum2));
		System.out.println("결과 : "+result);
	}
}
