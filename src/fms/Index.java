package fms;

import java.util.Scanner;

public class Index {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		FileManager fm = new FileManager();
		
		System.out.println("FMS �Դϴ�.");
		while(true) {
			System.out.println("1. �����߰�\n2. �������\n3. �������\n4. ��ü ��Ϻ���\n5. ������");
			int choice = scan.nextInt();
			
			if(choice == 5) {
				System.out.println("�ȳ���������.");
				break;
			}
			
			String newData = "";
			String delData = "";
			
			switch (choice) {
			case 1:
				//�����߰�
				System.out.println("�߰��� ������ �Է��ϼ��� !");
				newData = scan.next();
				
				if(fm.insert(newData)) {
					System.out.println("���� �߰� ���� ! \n�߰��� ���� : "+newData);
				}else {
					System.out.println("���� �߰� ����...");
				}
				System.out.println("-------------------------");
				break;
			case 2:
				//�������
				System.out.println("������ ���� : ");
				delData = scan.next();
				System.out.println("���ο� ���� :");
				newData = scan.next();
				
				if(fm.modify(delData, newData)) {
					System.out.println("���� ���� ���� !\n"+ delData+" -> " + newData);
				}else {
					System.out.println("���� ���� ����...");
				}
				System.out.println("-------------------------");
				break;
			case 3:
				//�������
				System.out.println("������ ������ �Է��ϼ��� !");
				delData = scan.next();
				
				if(fm.delete(delData)) {
					System.out.println("���� ���� ���� !\n������ ����" + delData);
				}else {
					System.out.println("���� ���� ����...");
				}
				System.out.println("-------------------------");
				
				break;
			case 4:
				//��ü ��Ϻ���
				String result = fm.selectAll();
				if(result == null) {
					System.out.println("���� �б� ���� ...");
				}else {
					System.out.println("------lang.txt ����------");
					if(result.equals("")) {
						System.out.println("���Ͽ��� �ƹ� ������ �����ϴ�.");
					}else {
						System.out.println(result);
					}
					System.out.println("-------------------------");
				}
				break;
			}
			
		}
	}
}
 