package day02;

import java.util.Scanner;

public class IfTask_5 {
	public static void main(String[] args) {
		// ����ڿ��� ���� 3�� �Է¹޾Ƽ� ¦���鸸 ���

		Scanner scan = new Scanner(System.in);
		int num1 = 0; 
		int num2 = 0;
		int num3 = 0;
		
		System.out.print("ù��° ���� : ");
		num1 = scan.nextInt();
		System.out.print("�ι�° ���� : ");
		num2 = scan.nextInt();
		System.out.print("����° ���� : ");
		num3 = scan.nextInt();
		
		if(num1%2 == 0) {
			System.out.println(num1);
		}
		if(num2%2 == 0) {
			System.out.println(num2);
		}
		if(num3%2 == 0) {
			System.out.println(num3);
		}
		
		//����ڿ��� ��������, ��������, �������� �Է¹޾Ƽ� ���� ���
		int kor = 0;
		int math = 0;
		int eng = 0;
		int total = 0;
		
		System.out.print("�������� : ");
		kor = scan.nextInt();
		System.out.print("�������� : ");
		math = scan.nextInt();
		System.out.print("�������� : ");
		eng = scan.nextInt();
		
		//total = kor + math + eng;
		total += kor;
		total += math;
		total += eng;
		
		System.out.printf("���� : %d��", total);

	}
}