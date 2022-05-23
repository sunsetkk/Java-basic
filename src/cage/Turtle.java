package cage;

//파충류
public class Turtle extends Animal implements Reptilia {

	public Turtle(String name, String gen, int age) {
		super(name, gen, age);
	}

	@Override
	public void cry() {
		System.out.println(name + "이(가) 끡끡끢끡 우는 중");
	}

	@Override
	public void move() {
		System.out.println(name + "이(가) 느릿느릿 걷는 중");
	}
}
