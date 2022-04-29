package day01;
//Alt + Shift + N > ↓ > Enter : 프로젝트 만들기
public class VariableTest_4 {
	public static void main(String[] args) {
		int age = 22;
		float height = 181.23f;
		double weight = 77.77;
		char score = 'A';
		String name = "해진";
		
		System.out.println("------- "+name+" 님의 정보 -------");
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age + "살");
		System.out.println("키 : " + height + "cm");
		System.out.println("몸무게 : " + weight + "kg");
		System.out.println("성적 : " + score);
	}
}
