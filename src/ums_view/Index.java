package ums_view;

import java.util.Scanner;

//MVC1 ��
public class Index {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("����� ���� ������Ʈ UMS");
		
		while(true) {
			System.out.println("1. ȸ������\n2. �α���\n3. ������");
			int choice = scan.nextInt();
			
			if(choice == 1) {
				//ȸ������
				new JoinView();
			}
			else if(choice == 2) {
				//�α���
				new LoginView();
			}
			else if(choice == 3) {
				//������
				System.out.println("������ �� ������ ~ ");
				break;
			}
		}
	}
}