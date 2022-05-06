package day04;

import java.util.Scanner;

public class NestedFor_7 {
	public static void main(String[] args) {
		for (int j = 1; j <= 9; j++) {
			System.out.printf("%d X %d = %d\n", 1,j,1*j);
		}
		for (int j = 1; j <= 9; j++) {
			System.out.printf("%d X %d = %d\n", 2,j,2*j);
		}
		for (int j = 0; j < 9; j++) {
			System.out.printf("%d X %d = %d\n", 3,j,3*j);
		}
		
		for (int i = 1; i <= 9; i++) {
			System.out.println("-------- "+i+"단 --------");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\n",i,j,i*j);
			}
		}
		
//		*****
//		*****
//		*****
//		*****
//		*****
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//입력
		//학생수 : 3
		//n번째 학생 국어점수 : 100
		//n번째 학생 수학점수 : 60
		//n번째 학생 영어점수 : 80
		//n번째 학생 국어점수 : 100
		//....
		
		//출력
		//n번쨰 학생 총점 : 240점
		//n번째 학생 평균 : 80.0점
		//n번째 학생 총점 : 150점
		// ....
		//전체 평균 : 75.47점
		
		Scanner scan = new Scanner(System.in);
		int student = 0;
		String[] subj = {"국어", "수학", "영어"};
		
		System.out.print("학생수 : ");
		student = scan.nextInt();
		
		int[][] arScore = new int[student][subj.length];
		int[] total = new int[student];
		double[] avg = new double[student];
		double totAvg = 0.0;
		
		for (int i = 0; i < student; i++) {
			for (int j = 0; j < subj.length; j++) {
				System.out.print(i+1 + "번째 학생 " + subj[j] +"점수 : ");
				arScore[i][j] = scan.nextInt();
				
				total[i] += arScore[i][j];
				avg[i] = total[i]/(double)subj.length;
			}
		}
		
		for (int i = 0; i < student; i++) {
			System.out.println(i+1 + "번째 학생 총점 : "+ total[i] + " 점" );
			System.out.println(i+1 + "번째 학생 평균 : "+ avg[i] + " 점");
			totAvg += avg[i];
		}
		
		System.out.println("전체 평균 : " + totAvg/(double)student);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
