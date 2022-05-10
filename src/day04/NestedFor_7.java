package day04;

import java.util.Scanner;

public class NestedFor_7 {
	public static void main(String[] args) {
		for (int j = 1; j <= 9; j++) {
			System.out.printf("%d X %d = %d\n", 1,j,1*j);
		}
		for (int j = 1; j <= 9; j++) {
			System.out.printf("%d X %d = %d\n", 2,j,2*j);
		}
		for (int j = 0; j < 9; j++) {
			System.out.printf("%d X %d = %d\n", 3,j,3*j);
		}
		
		for (int i = 1; i <= 9; i++) {
			System.out.println("-------- "+i+"�� --------");
			for (int j = 1; j <= 9; j++) {
				System.out.printf("%d X %d = %d\n",i,j,i*j);
			}
		}
		
//		*****
//		*****
//		*****
//		*****
//		*****
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		//�Է�
		//�л��� : 3
		//n��° �л� �������� : 100
		//n��° �л� �������� : 60
		//n��° �л� �������� : 80
		//n��° �л� �������� : 100
		//....
		
		//���
		//n���� �л� ���� : 240��
		//n��° �л� ��� : 80.0��
		//n��° �л� ���� : 150��
		// ....
		//��ü ��� : 75.47��
		
		Scanner scan = new Scanner(System.in);
		int student = 0;
		String[] subj = {"����", "����", "����"};
		
		System.out.print("�л��� : ");
		student = scan.nextInt();
		
		int[][] arScore = new int[student][subj.length];
		int[] total = new int[student];
		double[] avg = new double[student];
		double totAvg = 0.0;
		
		for (int i = 0; i < student; i++) {
			for (int j = 0; j < subj.length; j++) {
				System.out.print(i+1 + "��° �л� " + subj[j] +"���� : ");
				arScore[i][j] = scan.nextInt();
				
				total[i] += arScore[i][j];
				avg[i] = total[i]/(double)subj.length;
			}
		}
		
		for (int i = 0; i < student; i++) {
			System.out.println(i+1 + "��° �л� ���� : "+ total[i] + " ��" );
			System.out.println(i+1 + "��° �л� ��� : "+ avg[i] + " ��");
			totAvg += avg[i];
		}
		
		System.out.println("��ü ��� : " + totAvg/(double)student);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
}