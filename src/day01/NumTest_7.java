package day01;

import java.util.Scanner;

public class NumTest_7 {
	public static void main(String[] args) {
//		int data = 3;
//		System.out.println(10/data);
		
		//�Է�
		Scanner scan = new Scanner(System.in);
		System.out.print("ù��° ���� : ");
		String num1 = scan.next();
		System.out.print("�ι�° ���� : ");
		String num2 = scan.next();
		
		//ó��
//		int realNum1 = (int)num1;
//		���ڿ��� Ŭ���� Ÿ���̱� ������ ����ȯ �����ڷ� �ڷ����� �ٲ� �� ����.
//		Integer.parseInt("�����εȹ��ڿ�") : ��°�� ������ �ؼ��ؼ� �����ش�. (int)
//		Double.parseDouble(), ....
		int realNum1 = Integer.parseInt(num1);
		int realNum2 = Integer.parseInt(num2);
		
		int result = realNum1 + realNum2;
		
		//���
//		System.out.println("��� : "+ (realNum1+realNum2));
		System.out.println("��� : "+result);
	}
}