package day01;

import java.util.Scanner;

public class OperTest_8 {
	public static void main(String[] args) {
		System.out.println(14&17);
		System.out.println(~14);
		System.out.println(true);
		boolean check = 10>7;
		
		Scanner scan = new Scanner(System.in);
		//���� �ʱ�ȭ (����:0, �Ǽ�:0.0, 0.0F, ����:' ', 
		//			���ڿ�:"", ������:����false, �� ��:null)
		int num = 0;
		String result ="";
		
		System.out.print("���� : ");
		num = scan.nextInt();

		result = num>0 ? "����Դϴ�.": "�����Դϴ�.";
		result = num == 0 ? "0�Դϴ�." : result ;
		
		System.out.println(num+"��(��) "+result);
	}
}