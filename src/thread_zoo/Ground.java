package thread_zoo;

public class Ground {
	public static void main(String[] args) {
//		���� ������ ���� ���ÿ� ����ϱ�
//		�Ѹ����� 300�и��ʸ���, �Ѹ����� 500�и��ʸ���, �Ѹ����� 200�и��ʸ��� ���
		Cat cat = new Cat();
		Dog dog = new Dog();
		Pig pig = new Pig();
		
		Thread[] threads = {
				new Thread(cat),
				new Thread(dog),
				new Thread(pig)
		};
		
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
		
	}
}