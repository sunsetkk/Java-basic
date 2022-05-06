package day04;

public class ArTest_6 {
	public static void main(String[] args) {
		int[][] arrData = {
				{10,20,30},
				{40,50,60},
		};
//		for (int i = 0; i < 6; i++) {
//			System.out.println(arrData[i/3][i%3]);
//		}
		
//		System.out.println(arrData[0][0]);
//		System.out.println(arrData[0][1]);
//		System.out.println(arrData[0][2]);
		
//		System.out.println(arrData[1][0]);
//		System.out.println(arrData[1][1]);
//		System.out.println(arrData[1][2]);
		
		
		for (int i = 0; i < 2; i++) {
			for (int j = 0; j < 3; j++) {
				System.out.println(arrData[i][j]);
			}
		}
	}
}
