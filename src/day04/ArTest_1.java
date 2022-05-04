package day04;

import java.util.Scanner;

public class ArTest_1 {
	public static void main(String[] args) {
		int[] arData = {10, 5, 1, 17, 14};
		//System.out.println(arData);
//		System.out.println(arData[0]);
//		System.out.println(arData[1]);
//		System.out.println(arData[2]);
//		System.out.println(arData[3]);
//		System.out.println(arData[4]);
		
		//방 번호는 연산되는 정수이기 때문에 규칙성으로 사용될 수 있다.
		for (int i = 0; i < 5; i++) {
			System.out.println(arData[i]);
		}
		
		arData[2] = 100;
		
		//배열 선언2
		Scanner scan = new Scanner(System.in);
		int[] arData2 = new int[5];
		for (int i = 0; i < 5; i++) {
			arData2[i] = scan.nextInt();
		}
		for (int i = 0; i < 5; i++) {
			System.out.println(arData2[i]);
		}
		
	}
}
