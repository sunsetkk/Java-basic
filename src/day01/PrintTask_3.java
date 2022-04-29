package day01;

//Ctrl + N : New창 (클래스, 패키지, .. 등등 만드는 창)
public class PrintTask_3 {
	public static void main(String[] args) {
		//------ 해진 님의 정보 ------
		//이름 : 해진
		//나이 : 10살
		//키 : 165.3cm
		//몸무게 : 48.55kg
		//성적 : A
		//---------- \O/ ----------
		
		//데이터 분리해서 출력하기
		System.out.println("------- " + "해진" + "님의 정보 -------");
		System.out.println("이름 : " + "해진");
		System.out.println("나이 : " + 10 + "살");
		System.out.println("키 : " + 165.3 + "cm");
		System.out.println("몸무게 : " + 48.55 + "kg");
		System.out.println("성적 : " + 'A');
		System.out.println("---------- \\O/ ----------");
		
//		Ctrl + Alt + ↓(↑) : 아래(위)쪽으로 한줄 복사
//		Alt + ↓(↑) : 아래(위)쪽으로 한줄 이동
		//printf()로 출력
		System.out.printf("------- %s 님의 정보 -------\n", "해진");
		System.out.printf("이름 : %s \n", "해진");
		System.out.printf("나이 : %d 살 \n", 10);
		System.out.printf("키 : %.2f cm \n", 165.3211114);
		System.out.printf("몸무게 : %.3f kg \n", 48.55);
		System.out.printf("성적 : %c \n", 'A');
		System.out.println("---------- \\O/ ----------");
		
//		10 10 10 10 10 10 10 10 10 10 10 10 10 ...
//		System.out.println(10 + " " + 10 + " " + 10);
		
//		%1$d : 1번째로 넘겨주는 정수값을 이 자리에 붙여라!
		System.out.printf("%1$d %1$d %1$d %1$d %1$d %1$d %1$d %1$d", 10);
		
//		"키 : 165.32 cm" 라는 문자열 값 자체가 필요한 경우
		String.format("키 : %.2f cm \n", 165.3211114);
		
	}
}
















