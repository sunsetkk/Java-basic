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
		
		//�� ��ȣ�� ����Ǵ� �����̱� ������ ��Ģ������ ���� �� �ִ�.
		for (int i = 0; i < 5; i++) {
			System.out.println(arData[i]);
		}
		
		arData[2] = 100;
		
		//�迭 ����2
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