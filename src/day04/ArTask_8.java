package day04;

import java.util.Scanner;

public class ArTask_8 {
	public static void main(String[] args) {
		//4��, 5ȣ
		
		//�Է�
		//101ȣ : 100
		//102ȣ : 90
		//103ȣ : 110
		//104ȣ : 120
		//105ȣ : 80
		//201ȣ : 
		//	.....
		
		Scanner scan = new Scanner(System.in);
		int floor[] = new int[4];
		int ho[] = new int[5];
		int build[][] = new int[floor.length][ho.length];
		
		
		for (int i = 0; i < floor.length; i++) {
			for (int j = 0; j < ho.length; j++) {
				System.out.print((i+1) +"0"+ (j+1) +"ȣ ���� : ");
//				System.out.print((i+1) * 100 + (j+1) +"ȣ ���� : ");
				build[i][j] = scan.nextInt();
				
				floor[i] += build[i][j];
				ho[j] += build[i][j];
			}
			System.out.println();
		}
		//���
		//1�� �� ���� :
		//2�� �� ���� :
		//3�� �� ���� :
		//4�� �� ���� :
		
		//1ȣ �� ���� :
		//2ȣ �� ���� :
		//	....
		
		int total = 0;
		int avg = 0;
		for (int i = 0; i < floor.length; i++) {
			System.out.println(i+1 +"�� �� ���� : "+ floor[i]);
			total += floor[i];
		}
		for (int j = 0; j < ho.length; j++) {
			System.out.println(j+1 +"ȣ �� ���� : "+ho[j]);
		}
		
		//��ü ���� ��� ���ؼ� ��պ��� ���� ȣ�� ���
		//101ȣ, 302ȣ, 404ȣ�� ��պ��� ���� ���� �Դϴ�.
		
		avg = total/(floor.length * ho.length);
		
		boolean flag = true;
		for (int i = 0; i < floor.length; i++) {
			for (int j = 0; j < ho.length; j++) {
				if(build[i][j] > avg) {
					if(flag == true) {
						System.out.print((i+1) + "0" + (j+1) + "ȣ ");
						flag = false;
					}else {
						System.out.print(", " + (i+1) + "0" + (j+1) + "ȣ ");
					}
				}
			}
		}
		System.out.println("�� ��պ��� ���� ���� �Դϴ�.");
		
		System.out.println("���� ��� : "+avg);
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
