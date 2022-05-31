package cafe;

//인터페이스는 추상메서드와 상수만 존재할 수 있다.
//그냥 선언해도 자동으로 추상메서드와 상수로 처리해준다.
public interface Cafe {
	String owner = "해진";
	abstract void sell();
	void drip();
}
