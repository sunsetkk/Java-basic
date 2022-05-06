package day04;

import java.util.Scanner;

public class ArTask_3 {
	public static void main(String[] args) {
		//5칸 빈 배열 생성 후 1~5 넣어준 후 출력
		int[] arData = new int[5];
		for (int i = 0; i < arData.length; i++) {
			arData[i] = i+1;
			System.out.print(arData[i] + " ");
		}
		System.out.println();
		
		//5칸 빈 배열 생성 후 5~1 넣어준 후 출력
		
//		i	넣을 값			(i*-1)+5
//		0	5
//		1	4
//		2	3
//		3	2
//		4	1
		
		int[] arData2 = new int[5];
		for (int i = 0; i < arData2.length; i++) {
			arData2[i] = 5-i;
			System.out.print(arData2[i] + " ");
		}
		
		System.out.println();
		
		//사용자에게 정수 3개 입력받아서 전체 출력 후 총 합 출력
		Scanner scan = new Scanner(System.in);
		int num[] = new int[3];
		int total = 0;
		
		for (int i = 0; i < num.length; i++) {
			System.out.print(i + "번째 정수 : ");
			num[i] = scan.nextInt();
		}
		System.out.println();
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i] + " ");
			total += num[i];
		}
		System.out.println();
		System.out.println("총합 : " + total);
		
		//입력
		//국어점수 : 100
		//수학점수 : 90
		//영어점수 : 80
		//자바점수 : 70
		
		//출력
		//총점 : 340점
		//평균 : 85.0점
		
		String[] subject = {"국어", "수학", "영어", "자바"};
		int[] arScore = new int[subject.length];
		total = 0;
		double avg = 0;
		
		for (int i = 0; i < subject.length; i++) {
			System.out.print(subject[i]+"점수 : ");
			arScore[i] = scan.nextInt();
			total += arScore[i];
		}
		avg = total/(double)subject.length;
		
		System.out.println("총점 : "+ total);
		System.out.println("평균 : "+ avg);
		
	}
}
