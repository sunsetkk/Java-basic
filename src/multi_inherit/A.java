package multi_inherit;

public interface A {
//	인터페이스에 default 키워드를 이용해서 일반 메서드를 선언할 수 있다.
//	public이 생략된 상태
	default void f() {
		System.out.println("A 인터페이스의 f()");
	}
}
