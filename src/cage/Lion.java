package cage;

public class Lion extends Animal implements Mammalia {

	public Lion(String name, String gen, int age) {
		super(name, gen, age);
	}

	@Override
	public void cry() {
		System.out.println(name + "��(��) ��ȿ ��");
	}

	@Override
	public void move() {
		System.out.println(name + "��(��) ��ݻ�� �ȴ� ��");
	}

}