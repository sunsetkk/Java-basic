package zoo;

public class Cat extends Animal{
	
	public Cat() {}
	public Cat(String name, String gen, int age) {
		super(name, gen, age);
	}
	
	@Override
	void cry() {
		System.out.println(name + "��(��) �̾߾ƾƾƿ� ��� ��");
	}
	@Override
	void move() {
		System.out.println(name + "��(��) ��ӻ�� �ɾ�� ��");
	}
}