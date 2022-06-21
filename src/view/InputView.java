package view;

import java.util.Scanner;

import controller.Calc;
import model.Datas;

public class InputView {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Calc calc = new Calc();
		
		System.out.print("ù��° ���� : ");
		int num1 = scan.nextInt();
		System.out.print("�ι�° ���� : ");
		int num2 = scan.nextInt();
		System.out.print("������ ����  : ");
		String oper = scan.next();
		
		Datas model = new Datas(num1, num2, oper);
		
		String result = calc.doing(model);
		
		if(result == null) {
			new ExceptionView();
		}else {
			new OutputView(result);
		}
	}
}