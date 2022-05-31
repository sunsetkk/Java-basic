package exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		while(true) {
			scan = new Scanner(System.in);
			
			try {
				System.out.print("첫번째 정수 : ");
				int num1 = scan.nextInt();
				System.out.print("두번째 정수 : ");
				int num2 = scan.nextInt();
				
				System.out.println("결과 : "+num1/num2);
			} 
			catch(ArithmeticException ae) {
				System.out.println("0으로는 나눌 수 없습니다.");
			}
			catch(InputMismatchException ime) {
				System.out.println("정수만 입력하세요.");
			}
			catch(Exception e) {
				System.out.println("알 수 없는 오류 발생 / 개발자에게 알려주세요.");
//				System.out.println(e);
			}
			
		}
		
		
	}
}
