package day02;

import java.util.Scanner;

public class Quiz_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice = 0;
		
		System.out.println("���� �� ���α׷��� �� �ƴѰ���?\n1. C���\n2. Java\n3. ���վ�\n4. ���̽�");
		choice = scan.nextInt();
		
		if (choice == 3) {
			System.out.println("�����Դϴ�.");
		}else if(choice == 1 || choice == 2 || choice == 4) {
			//~~�̰�, ~~��, ~~�ϰ�, �׸���, ~~�̸�, ~~�ϸ� : &&
			//~~�Ǵ�, ~~Ȥ��, ~~�ų� : ||
			System.out.println("�����Դϴ�.");
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
	}
}