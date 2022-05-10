package day05;

public class MethodTask_4 {
	public static void main(String[] args) {
		MethodTask_4 m = new MethodTask_4();
		
		m.print1To10();
		System.out.println(m.sum1To10());
		System.out.println(m.sum1ToN(100));
	}
	
	//1~10 ����ϴ� �޼���
	//1~10 �� �� �����ִ� �޼���
	void print1To10() {
		for (int i = 1; i <= 10; i++) {
			System.out.print(i);
		}
		System.out.println();
	}
	int sum1To10() {
		int sum = 0;
		for (int i = 1; i <= 10; i++) {
			sum += i;
		}
		return sum;
	}
	
	//1~n�� �� �����ִ� �޼���
	//�� ������ ������ ����� �����ִ� �޼���
	int sum1ToN(int n) {
		int sum = 0;
		for (int i = 1; i <= n; i++) {
			sum += i;
		}
		return sum;
	}
	double div(int num1, int num2) {
		return (double)num1/num2;
	}
	
	//� ���ڿ��� n����ŭ ����ϴ� �޼���
	//n~m �� �� �����ִ� �޼���
	void printMsg(String msg, int n) {
		for (int i = 0; i < n; i++) {
			System.out.println(msg);
		}
	}
	int sumNtoM(int n, int m) {
		int sum = 0;
		for (int i = n; i <= m; i++) {
			sum += i;
		}
		return sum;
	}
	
	//���ڿ��� ���� �빮�ڷ� �ٲ��ִ� �޼���("HeLlo123" -> "HELLO123")
	//���ڿ��� �Ųٷ� �ٲ��ִ� �޼���("Hello" --> "olleH")
	String changeToUpperCase(String msg) {
		String result = "";
		for (int i = 0; i < msg.length(); i++) {
			char ch = msg.charAt(i);
			//a : 97 / A : 65
			if(ch >= 'a' && ch <= 'z') {
				result += (char)(ch-32);
			}else {
				result += ch;
			}
		}
		return result;
	}
	String reverse(String msg) {
		String result = "";
//		for (int i = msg.length()-1; i >= 0; i--) {
//			result += msg.charAt(i);
//		}
		for (int i = 0; i < msg.length(); i++) {
			result = msg.charAt(i) + result;
		}
		return result;
	}
	
	
	//���ڿ��� ���ڷ� �̷���� �ִ��� �˻��ϴ� �޼���("123" --> O / "1HH261" --> X)
	boolean isDigit(String msg) {
		for (int i = 0; i < msg.length(); i++) {
			char ch = msg.charAt(i);
			if(ch < '0' || ch > '9') {
				return false;
			}
		}
		return true;
	}
	//���ڿ��� �ҹ��ڴ� �빮�ڷ�, �빮�ڴ� �ҹ��ڷ�, �������� �״�� �ٲ��ִ� �޼���
	//("HeLlo123" -> "hElLO123")
	String changeCase(String msg) {
		String result = "";
		for (int i = 0; i < msg.length(); i++) {
			char ch = msg.charAt(i);
			//a : 97 / A : 65
			if(ch >= 'a' && ch <= 'z') {
				result += (char)(ch-32);
			}else if(ch >= 'A' && ch <= 'Z'){
				result += (char)(ch+32);
			} else {
				result += ch;
			}
		}
		return result;
	}
	
	//������ �ѱ۷� �ٲ��ִ� �޼���(107474 -> "�ϰ�ĥ��ĥ��")
	
	String changeToHamgle(int num) {
		String hangle = "�����̻�����ĥ�ȱ�";
		String data = num + "";
		String result = "";
		
		for (int i = 0; i < data.length(); i++) {
			char ch = data.charAt(i);
			//'1' -> 1
			//(int)'1' --> 49
			//'1' - 48 --> 1
			int idx = ch-48;
			result += hangle.charAt(idx);
		}
		return result;
	}
	
	//���� �ϳ� ���� ���� �ϱ�!
	//���ϴ¸�ŭ ���� ��� �߰��Ǵ� �迭���� �����
	//1. ������ �߰� 2.������ ���� 3.������ ��Ϻ���
}