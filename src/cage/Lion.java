package cage;

public class Lion extends Animal implements Mammalia {

	public Lion(String name, String gen, int age) {
		super(name, gen, age);
	}

	@Override
	public void cry() {
		System.out.println(name + "이(가) 포효 중");
	}

	@Override
	public void move() {
		System.out.println(name + "이(가) 살금살금 걷는 중");
	}

}
