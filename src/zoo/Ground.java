package zoo;

public class Ground {
	public static void main(String[] args) {
		//���� ������ ���� ����ϱ�
		//�� ������ �����Ҹ� �ٸ���
		//�� �������� Ư¡���� �ൿ�� �ϳ��� �ϱ�
		
//		Cat cat = new Cat("ŰƼ", "��", 8);
//		Dog dog = new Dog("����", "��", 7);
//		Meerkat meer = new Meerkat("�ٸ�", "��", 5);
		
		Animal[] zoo = {
				new Cat("ŰƼ", "��", 8),
				new Dog("����", "��", 7),
				new Meerkat("�ٸ���", "��", 5)
		};
		
		for (int i = 0; i < zoo.length; i++) {
			zoo[i].cry();
			zoo[i].move();
		}
	}
}