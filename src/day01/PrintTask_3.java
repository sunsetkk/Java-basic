package day01;

//Ctrl + N : Newâ (Ŭ����, ��Ű��, .. ��� ����� â)
public class PrintTask_3 {
	public static void main(String[] args) {
		//------ ���� ���� ���� ------
		//�̸� : ����
		//���� : 10��
		//Ű : 165.3cm
		//������ : 48.55kg
		//���� : A
		//---------- \O/ ----------
		
		//������ �и��ؼ� ����ϱ�
		System.out.println("------- " + "����" + "���� ���� -------");
		System.out.println("�̸� : " + "����");
		System.out.println("���� : " + 10 + "��");
		System.out.println("Ű : " + 165.3 + "cm");
		System.out.println("������ : " + 48.55 + "kg");
		System.out.println("���� : " + 'A');
		System.out.println("---------- \\O/ ----------");
		
//		Ctrl + Alt + ��(��) : �Ʒ�(��)������ ���� ����
//		Alt + ��(��) : �Ʒ�(��)������ ���� �̵�
		//printf()�� ���
		System.out.printf("------- %s ���� ���� -------\n", "����");
		System.out.printf("�̸� : %s \n", "����");
		System.out.printf("���� : %d �� \n", 10);
		System.out.printf("Ű : %.2f cm \n", 165.3211114);
		System.out.printf("������ : %.3f kg \n", 48.55);
		System.out.printf("���� : %c \n", 'A');
		System.out.println("---------- \\O/ ----------");
		
//		10 10 10 10 10 10 10 10 10 10 10 10 10 ...
//		System.out.println(10 + " " + 10 + " " + 10);
		
//		%1$d : 1��°�� �Ѱ��ִ� �������� �� �ڸ��� �ٿ���!
		System.out.printf("%1$d %1$d %1$d %1$d %1$d %1$d %1$d %1$d", 10);
		
//		"Ű : 165.32 cm" ��� ���ڿ� �� ��ü�� �ʿ��� ���
		String.format("Ű : %.2f cm \n", 165.3211114);
		
	}
}















