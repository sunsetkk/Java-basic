package day02;

import java.util.Scanner;

public class IfTest_1 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num = 0;
		
		System.out.print("���� : ");
		num = scan.nextInt();
		
		//�б�ó��
		if(num > 0) {
			System.out.println("����Դϴ�.");
		}else if(num < 0) {
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("0�Դϴ�.");
		}
		
		//�ϰ�ó��
		String result ="0�Դϴ�.";
		if(num > 0) {
			result = "����Դϴ�.";
		}else if(num < 0) {
			result = "�����Դϴ�.";
		}
		System.out.println(result);
	}
}