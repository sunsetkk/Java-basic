package cage;

public abstract class Animal {
	String name;
	String gen;
	int age;
	
	public Animal(String name, String gen, int age) {
		this.name = name;
		this.gen = gen;
		this.age = age;
	}
	
	void eat() {
		System.out.println(name + "ÀÌ(°¡) ³È³È ¸Ô´ÂÁß...");
	}
	public abstract void cry();
	public abstract void move();
	
}
