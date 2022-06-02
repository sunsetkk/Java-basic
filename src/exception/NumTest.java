package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			scan = new Scanner(System.in);
			
			try {
				System.out.print("ù��° ���� : ");
				int num1 = scan.nextInt();
				System.out.print("�ι�° ���� : ");
				int num2 = scan.nextInt();
				
				System.out.println("��� : "+num1/num2);
			} 
			catch(ArithmeticException ae) {
				System.out.println("0���δ� ���� �� �����ϴ�.");
			}
			catch(InputMismatchException ime) {
				System.out.println("������ �Է��ϼ���.");
			}
			catch(Exception e) {
				System.out.println("�� �� ���� ���� �߻� / �����ڿ��� �˷��ּ���.");
//				System.out.println(e);
			}
			
		}
		
		
	}
}