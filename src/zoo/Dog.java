package zoo;

public class Dog extends Animal{

	public Dog() {}

	public Dog(String name, String gen, int age) {
		super(name, gen, age);
	}

	@Override
	void cry() {
		System.out.println(name + "��(��) ���������� �п��� ��Ŀ��� ��� ��");
	}
	
	@Override
	void move() {
		System.out.println(name + "��(��) �y�y �ɾ�� ��");
	}

}