package cage;

public class Racoon extends Animal implements Mammalia {

	public Racoon(String name, String gen, int age) {
		super(name, gen, age);
	}

	@Override
	public void cry() {
		System.out.println(name + "??(??) ???????? ???? ??");
	}

	@Override
	public void move() {
		System.out.println(name + "??(??) ?y?y?y?y ?????̴? ??");
	}

}
