package day01;

import java.util.Scanner;

public class InputTest_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("�̸� : ");
		String name = scan.next();
		System.out.println(name + "�� �������~");
		
		System.out.print("���� : ");
//		scan.nextDouble();
//		scan.nextFloat();
		int age = scan.nextInt();
		System.out.println("����� "+age+"�� �Դϴ�.");
		
		System.out.print("�ּ� : ");
		//���� nextInt() �������� ġ�� enter�� �Ծ� ġ��� ����
		scan.nextLine();
		String addr = scan.nextLine();
		System.out.println("��°� : "+ addr);
	}
}