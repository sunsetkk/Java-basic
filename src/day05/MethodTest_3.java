package day05;

public class MethodTest_3 {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
		MethodTest_3 m = new MethodTest_3();
		
		//���ϰ��� �ִ� �޼���� ���� ��°�ΰ� ���̱� ������ �� ���� Ȱ�� ����
		System.out.println(m.f(3));
		//���ϰ��� ���� �޼���� ���ΰ� ���� ���� �ƴϴ�.
		m.printName("sunsetz");
	}
	
	//f(x) = 2x+1
	int f(int x) {
//		x = �ѱ�� ��;
		return 2*x+1;
	}
	
	//���̸��� 10�� ����ϴ� �޼���
	void printName(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.println(name);
		}
	}
	
	//���� �ð������� �˷��ִ� �޼���
//	�ð�Ÿ�� getTime() {
//		return �ð�����;
//	}
	
//	�������� �� ����ϴ� �޼���
	void printDan(int dan) {
		for (int i = 1; i < 9; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan*i);
		}
	}
	
//	������ ���(0���� ũ�ų� ����)���� �������� �Ǵ��ϴ� �޼���
	boolean signOf(int num) {
		return num >= 0;
	}
}