package zoo;

public class Meerkat extends Animal{

	public Meerkat() {}

	public Meerkat(String name, String gen, int age) {
		super(name, gen, age);
	}

	@Override
	void cry() {
		System.out.println(name + "��(��) �ٸ��ٸ� ��� ��");
	}
	
	@Override
	void move() {
		System.out.println(name + "��(��) ���������� �ɾ�� ��");
	}
	
	void debug() {
		System.out.println("�ڵ��� ���� ã��");
	}
}