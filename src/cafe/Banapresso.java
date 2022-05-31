package cafe;

public class Banapresso {
	void openCafe(Cafe c) {
		System.out.println("바나프레소가 열렸습니다.");
		System.out.println("원두 그라인딩");
		c.drip();
		c.sell();
		System.out.println("바나프레소가 닫혔습니다.");
	}
}
