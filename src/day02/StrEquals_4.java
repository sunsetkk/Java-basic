package day02;

import java.util.Scanner;

public class StrEquals_4 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String msg1 = "Hello";
		String msg2 = "";
		
		System.out.println("�λ����ּ��� ~");
		msg2 = scan.next();
		
		//"���ڿ�1".equals("���ڿ�2") : "���ڿ�1"�� "���ڿ�2"�� ���� ���ڿ��̸� true / �ƴ϶�� false
//		if(msg1 == msg2) XX
		if(msg1.equals(msg2)) {
			System.out.println("�λ� �޾��༭ �������� ��");
		}else {
			System.out.println("������ �� ���ڽó׿�......");
		}
		
//		switch(msg2) {
//		case "Hello":
//			
//			break;
//		default:
//		}
	}
}