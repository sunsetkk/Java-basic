package cage;

//����
public class Dove extends Animal {

	public Dove(String name, String gen, int age) {
		super(name, gen, age);
	}

	@Override
	public void cry() {
		System.out.println(name + "��(��) ������ ��� ��");
	}

	@Override
	public void move() {
		System.out.println(name + "��(��) Ǫ��� Ǫ��� ���ư��� ��");
	}

}
