package day02;

import java.util.Scanner;

public class IfTask_5 {
	public static void main(String[] args) {
		// 사용자에게 정수 3개 입력받아서 짝수들만 출력

		Scanner scan = new Scanner(System.in);
		int num1 = 0; 
		int num2 = 0;
		int num3 = 0;
		
		System.out.print("첫번째 정수 : ");
		num1 = scan.nextInt();
		System.out.print("두번째 정수 : ");
		num2 = scan.nextInt();
		System.out.print("세번째 정수 : ");
		num3 = scan.nextInt();
		
		if(num1%2 == 0) {
			System.out.println(num1);
		}
		if(num2%2 == 0) {
			System.out.println(num2);
		}
		if(num3%2 == 0) {
			System.out.println(num3);
		}
		
		//사용자에게 국어점수, 수학점수, 영어점수 입력받아서 총점 출력
		int kor = 0;
		int math = 0;
		int eng = 0;
		int total = 0;
		
		System.out.print("국어점수 : ");
		kor = scan.nextInt();
		System.out.print("수학점수 : ");
		math = scan.nextInt();
		System.out.print("영어점수 : ");
		eng = scan.nextInt();
		
		//total = kor + math + eng;
		total += kor;
		total += math;
		total += eng;
		
		System.out.printf("총점 : %d점", total);

	}
}
