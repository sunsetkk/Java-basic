package zoo;

public class Meerkat extends Animal{

	public Meerkat() {}

	public Meerkat(String name, String gen, int age) {
		super(name, gen, age);
	}

	@Override
	void cry() {
		System.out.println(name + "이(가) 꾸릉꾸릉 우는 중");
	}
	
	@Override
	void move() {
		System.out.println(name + "이(가) 오도도도ㅗ 걸어가는 중");
	}
	
	void debug() {
		System.out.println("코딩의 오류 찾기");
	}
}
