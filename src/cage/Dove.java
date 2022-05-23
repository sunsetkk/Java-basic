package cage;

//조류
public class Dove extends Animal {

	public Dove(String name, String gen, int age) {
		super(name, gen, age);
	}

	@Override
	public void cry() {
		System.out.println(name + "이(가) 구구구 우는 중");
	}

	@Override
	public void move() {
		System.out.println(name + "이(가) 푸드득 푸드득 날아가는 중");
	}

}
