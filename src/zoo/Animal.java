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
		System.out.println(name + "��(��) �ȳ� �Դ� ��");
	}
	void sleep() {
		System.out.println(name + "��(��) ���� �ڴ� ��");
	}
	void cry() {
		System.out.println(name + "��(��) ���� ��� ��");
	}
	void move() {
		System.out.println(name + "��(��) �����̴� ��");
	}
	
}
