package day04;

import java.util.Scanner;

public class ArTask_8 {
	public static void main(String[] args) {
		//4층, 5호
		
		//입력
		//101호 : 100
		//102호 : 90
		//103호 : 110
		//104호 : 120
		//105호 : 80
		//201호 : 
		//	.....
		
		Scanner scan = new Scanner(System.in);
		int floor[] = new int[4];
		int ho[] = new int[5];
		int build[][] = new int[floor.length][ho.length];
		
		
		for (int i = 0; i < floor.length; i++) {
			for (int j = 0; j < ho.length; j++) {
				System.out.print((i+1) +"0"+ (j+1) +"호 월세 : ");
//				System.out.print((i+1) * 100 + (j+1) +"호 월세 : ");
				build[i][j] = scan.nextInt();
				
				floor[i] += build[i][j];
				ho[j] += build[i][j];
			}
			System.out.println();
		}
		//출력
		//1층 총 월세 :
		//2층 총 월세 :
		//3층 총 월세 :
		//4층 총 월세 :
		
		//1호 총 월세 :
		//2호 총 월세 :
		//	....
		
		int total = 0;
		int avg = 0;
		for (int i = 0; i < floor.length; i++) {
			System.out.println(i+1 +"층 총 월세 : "+ floor[i]);
			total += floor[i];
		}
		for (int j = 0; j < ho.length; j++) {
			System.out.println(j+1 +"호 총 월세 : "+ho[j]);
		}
		
		//전체 월세 평균 구해서 평균보다 높은 호수 출력
		//101호, 302호, 404호는 평균보다 높은 월세 입니다.
		
		avg = total/(floor.length * ho.length);
		
		boolean flag = true;
		for (int i = 0; i < floor.length; i++) {
			for (int j = 0; j < ho.length; j++) {
				if(build[i][j] > avg) {
					if(flag == true) {
						System.out.print((i+1) + "0" + (j+1) + "호 ");
						flag = false;
					}else {
						System.out.print(", " + (i+1) + "0" + (j+1) + "호 ");
					}
				}
			}
		}
		System.out.println("는 평균보다 높은 월세 입니다.");
		
		System.out.println("월세 평균 : "+avg);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
