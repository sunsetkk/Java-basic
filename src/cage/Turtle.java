package cage;

//�����
public class Turtle extends Animal implements Reptilia {

	public Turtle(String name, String gen, int age) {
		super(name, gen, age);
	}

	@Override
	public void cry() {
		System.out.println(name + "��(��) �˅˅̅� ��� ��");
	}

	@Override
	public void move() {
		System.out.println(name + "��(��) �������� �ȴ� ��");
	}
}