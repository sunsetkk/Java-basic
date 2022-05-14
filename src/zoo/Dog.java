package zoo;

public class Dog extends Animal{

	public Dog() {}

	public Dog(String name, String gen, int age) {
		super(name, gen, age);
	}

	@Override
	void cry() {
		System.out.println(name + "이(가) 으르르르릉 왈오라 컹커어엌 우는 중");
	}
	
	@Override
	void move() {
		System.out.println(name + "이(가) 챱챱 걸어가는 중");
	}

}
