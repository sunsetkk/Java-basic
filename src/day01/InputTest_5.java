package day01;

import java.util.Scanner;

public class InputTest_5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("이름 : ");
		String name = scan.next();
		System.out.println(name + "님 어서오세요~");
		
		System.out.print("나이 : ");
//		scan.nextDouble();
//		scan.nextFloat();
		int age = scan.nextInt();
		System.out.println("당신은 "+age+"살 입니다.");
		
		System.out.print("주소 : ");
		//위의 nextInt() 마지막에 치는 enter를 먹어 치우는 역할
		scan.nextLine();
		String addr = scan.nextLine();
		System.out.println("사는곳 : "+ addr);
	}
}
