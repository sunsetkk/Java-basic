package exception;

public class ExceptionTest {
	public static void main(String[] args) {
		try {
			System.out.println(10/3);
//			System.out.println(10/0);
			System.out.println(10/2);
		} catch(ArithmeticException ae) {
			System.out.println("0���δ� ���� �� �����ϴ�.");
		}finally {
			System.out.println("�ʼ��� �����ؾ� �ϴ� ����");
		}
	}
}