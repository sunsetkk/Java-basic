package day05;

public class MethodTask_4 {
	public static void main(String[] args) {
		MethodTask_4 m = new MethodTask_4();
		
		m.print1To10();
		System.out.println(m.sum1To10());
		System.out.println(m.sum1ToN(100));
	}
	
	//1~10 출력하는 메서드
	//1~10 총 합 구해주는 메서드
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
	
	//1~n총 합 구해주는 메서드
	//두 정수의 나눗셈 결과를 구해주는 메서드
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
	
	//어떤 문자열을 n번만큼 출력하는 메서드
	//n~m 총 합 구해주는 메서드
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
	
	//문자열을 전부 대문자로 바꿔주는 메서드("HeLlo123" -> "HELLO123")
	//문자열을 거꾸로 바꿔주는 메서드("Hello" --> "olleH")
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
	
	
	//문자열이 숫자로 이루어져 있는지 검사하는 메서드("123" --> O / "1HH261" --> X)
	boolean isDigit(String msg) {
		for (int i = 0; i < msg.length(); i++) {
			char ch = msg.charAt(i);
			if(ch < '0' || ch > '9') {
				return false;
			}
		}
		return true;
	}
	//문자열의 소문자는 대문자로, 대문자는 소문자로, 나머지는 그대로 바꿔주는 메서드
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
	
	//정수를 한글로 바꿔주는 메서드(107474 -> "일공칠사칠사")
	
	String changeToHamgle(int num) {
		String hangle = "공일이삼사오육칠팔구";
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
	
	//파일 하나 새로 만들어서 하기!
	//원하는만큼 정수 계속 추가되는 배열구조 만들기
	//1. 데이터 추가 2.데이터 삭제 3.데이터 목록보기
}
