package day04;

public class ArTest_5 {
	public static void main(String[] args) {
		//배열 선언1
		int[][] arrData = { { 10, 20, 30 }, { 30, 40, 50 } };
		
		//배열 선언2
		int[][] arrData2 = new int[2][3];
		arrData2[0][0] = 10;
		//비정방 배열
		arrData2[1] = new int[7];
		
		//배열 선언3(비정방 배열)
		int[][] arrData3 = new int [2][];
		arrData3[0] = new int[3];
		arrData3[1] = new int[5];
		
		
	}
}
