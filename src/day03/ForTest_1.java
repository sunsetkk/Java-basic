package day03;

public class ForTest_1 {
	public static void main(String[] args) {
		int num = 0;
		
		while(num != 10) {
			System.out.print(++num+" ");
		}
		System.out.println();
		
		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
		}
		
		//20번 반복
		for (int i = 0; i < 40; i+=2) {
			
		}
		
		//100부터 -3씩 하며 13번
		//반복횟수 = (끝값-초기값)/증감량
		for(int i = 100; i > 61; i-=3) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		//2부터 26까지 2씩 증가
		for (int i = 2; i < 28; i+=2) {
			System.out.print(i + " ");
		}
		System.out.println();
		
		
		//for문도 결국 조건식이 참일동안 반복이다.
		//초기식, 조건식, 증감식은 다 생략이 가능
		//조건식을 생략할 시 무한반복
//		for(;true;) {
//			
//		}
		
//		"for" 작성 후 자동완성
		for (int i = 0; i < args.length; i++) {
			
		}
		
		
	}
}
