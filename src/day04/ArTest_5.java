package day04;

public class ArTest_5 {
	public static void main(String[] args) {
		//�迭 ����1
		int[][] arrData = { { 10, 20, 30 }, { 30, 40, 50 } };
		
		//�迭 ����2
		int[][] arrData2 = new int[2][3];
		arrData2[0][0] = 10;
		//������ �迭
		arrData2[1] = new int[7];
		
		//�迭 ����3(������ �迭)
		int[][] arrData3 = new int [2][];
		arrData3[0] = new int[3];
		arrData3[1] = new int[5];
		
		
	}
}