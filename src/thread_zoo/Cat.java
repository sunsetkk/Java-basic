package thread_zoo;

public class Cat extends Animal implements Runnable{
	@Override
	void cry() {
		System.out.println("�̾߾ƾƾӿ�");
	}
	@Override
	public void run() {
		for (int i = 0; i < 25; i++) {
			cry();
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
			}
		}
	}
}
