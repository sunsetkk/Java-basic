package day05;

public class MethodTest_3 {
	public static void main(String[] args) {
//		Scanner scan = new Scanner(System.in);
		MethodTest_3 m = new MethodTest_3();
		
		//리턴값이 있는 메서드는 사용부 통째로가 값이기 때문에 그 값을 활용 가능
		System.out.println(m.f(3));
		//리턴값이 없는 메서드는 사용부가 절대 값이 아니다.
		m.printName("sunsetz");
	}
	
	//f(x) = 2x+1
	int f(int x) {
//		x = 넘기는 값;
		return 2*x+1;
	}
	
	//내이름을 10번 출력하는 메서드
	void printName(String name) {
		for (int i = 0; i < 10; i++) {
			System.out.println(name);
		}
	}
	
	//현재 시간정보를 알려주는 메서드
//	시간타입 getTime() {
//		return 시간정보;
//	}
	
//	구구단의 단 출력하는 메서드
	void printDan(int dan) {
		for (int i = 1; i < 9; i++) {
			System.out.printf("%d X %d = %d\n", dan, i, dan*i);
		}
	}
	
//	정수가 양수(0보다 크거나 같음)인지 츰수인지 판단하는 메서드
	boolean signOf(int num) {
		return num >= 0;
	}
}
