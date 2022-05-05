package day03;

import java.util.Scanner;

public class ForTask_2 {
	public static void main(String[] args) {
//		1���� 10���� ���
		for(int i = 1; i<=10; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		
//		10���� 1����
		for (int i = 10; i > 0; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		
//		12���� 3�� �����ϸ� 13�� ���
		for (int i = 12; i < 51; i+=3) {
			System.out.print(i + " ");
		}
		System.out.println();
		
//		100 94 88 82 .... 28 ���
		for (int i = 100; i > 28; i-=6) {
			System.out.print(i + " ");
		}
		System.out.println();
		
//		1���� 10���� ����
		int total = 0;
		for (int i = 1; i < 11; i++) {
			total += i;
		}
		System.out.println(total);
		
//		n �ϳ� �Է¹޾Ƽ� 1���� n���� ����
		total = 0;
		int n = 0;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("���� n �Է� : ");
		n = scan.nextInt();
		for (int i = 1; i <= n; i++) {
			total += i;
		}
		System.out.println(total);
		
//		n, m �Է� �޾Ƽ� n���� m���� ����ϱ�
		n = 0;
		int m = 0;
		
		System.out.print("���� n �Է� : ");
		n = scan.nextInt();
		System.out.print("���� m �Է� : ");
		m = scan.nextInt();
		for (int i = n; i <= m; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
			
//		1���� 100���� �� ¦���� ����ϱ�
		for (int i = 1; i <= 100; i++) {
			if(i%2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
//		1���� 100���� �� 3�� 5�� ������� ����ϱ�
		for (int i = 1; i <= 100; i++) {
			if(i%3 == 0 && i%5 ==0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
//		1���� 100���� �� 3�� ����� 5�� ��� �� ������� �����ϰ� ����ϱ�
		//3�� 5�� ������� �ƴ� ����
		//i%3 != 0 || i%5 != 0
		//!(i%3 == 0 && i%5 == 0)
		
		for (int i = 1; i <= 100; i++) {
			if(i%3 == 0 || i%5 ==0) {
				if(!(i%3 == 0 && i%5 == 0)) {
					System.out.print(i + " ");
				}
			}
		}
		System.out.println();
		
//		A���� F���� ����ϱ�(�ƽ�Ű�ڵ�)
		for (int i = 65; i < 71; i++) {
			System.out.print((char) i + " ");
		}
		System.out.println();
		
//		AbCd...Yz ����ϱ�
		//A(65) a(97)
		//�빮�� �ҹ��� ���� = 32
		for (int i = 65; i < 91; i++) {
			if (i%2 == 0) {
				System.out.print((char)(i+32));
			}else {
				System.out.print((char)i);
			}
		}
		System.out.println();
		
		
		
		
//		��ø�ݺ��� ������� �ʰ� ������ ���� ���
		for(int i = 0; i < 81; i++) {
			int dan = i/9 + 1;
			int gop = i%9+1;
			
			System.out.printf("%d X %d = %d\n", dan, gop, dan*gop);
		}
//		10���� ���� �Է¹޾Ƽ� 2������ ����ϱ�
		int num = 0;
		String data = "";
		
		System.out.print("10���� ���� �Է� : ");
		num = scan.nextInt();
		
		for (int i = num; i >= 1; i/=2) {
			data = i%2+data;
		}
		System.out.println(data);
		
//		ABCDefdhIJKLmnopQRSTuvwxYZ ���
		//4�� ���� �� Ȯ��
		//0 1 2 3	�빮�� 0
		//4 5 6 7	�빮�� 1
		//8 9 10 11	�빮�� 2
		
		String result = "";
		for (int i = 0; i < 27; i++) {
			if ((i/4)%2 == 0) {
				result += (char)(65+i);
			}else {
				result += (char)(97+i);
			}
		}
		System.out.println(result);
		
//		AbCDefGHIjklMNOPqrstUVWXYz ���
		//caseType�� true���� ������ �ִ� : �빮�ڷ� ���
		//caseType�� false���� ������ �ִ� : �ҹ��ڷ� ���
		
		int cnt = 0;
		num = 1;
		boolean caseType = true;
		
		for (int i = 0; i < 26; i++) {
			if(cnt>=num) {
				caseType = !caseType;
				cnt = 0;
				if(caseType == true) {
					num++;
				}
			}
			
			if(caseType == true) {
				System.out.print((char)(65+i));
			}else {
				System.out.print((char)(97+i));
			}
			cnt++;
		}
		

	}
}