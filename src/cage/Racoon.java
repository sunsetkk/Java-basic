package cage;

public class Racoon extends Animal implements Mammalia {

	public Racoon(String name, String gen, int age) {
		super(name, gen, age);
	}

	@Override
	public void cry() {
		System.out.println(name + "이(가) 쿠에에엥 우는 중");
	}

	@Override
	public void move() {
		System.out.println(name + "이(가) 챱챱챱챱 움직이는 중");
	}

}
