package day05;

import java.util.Scanner;

public class InputTest_2 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("?ѱ??? : ");
//		"A".charAt(0) : 'A'
		char ch = scan.next().charAt(0);
		System.out.println(ch);
		
		scan.next().toUpperCase().replace("Hello", "Bye").substring(2).charAt(7);
	}
}
