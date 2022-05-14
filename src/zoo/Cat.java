package zoo;

public class Cat extends Animal{
	
	public Cat() {}
	public Cat(String name, String gen, int age) {
		super(name, gen, age);
	}
	
	@Override
	void cry() {
		System.out.println(name + "이(가) 미야아아아옹 우는 중");
	}
	@Override
	void move() {
		System.out.println(name + "이(가) 사뿐사뿐 걸어가는 중");
	}
}
