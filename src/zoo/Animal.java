package zoo;

public class Animal {
	String name;
	String gen;
	int age;
	
	public Animal() {}

	public Animal(String name, String gen, int age) {
		this.name = name;
		this.gen = gen;
		this.age = age;
	}
	
	void eat() {
		System.out.println(name + "ÀÌ(°¡) ³È³È ¸Ô´Â Áß");
	}
	void sleep() {
		System.out.println(name + "ÀÌ(°¡) ÄğÄğ ÀÚ´Â Áß");
	}
	void cry() {
		System.out.println(name + "ÀÌ(°¡) ¾û¾û ¿ì´Â Áß");
	}
	void move() {
		System.out.println(name + "ÀÌ(°¡) ¿òÁ÷ÀÌ´Â Áß");
	}
	
}
