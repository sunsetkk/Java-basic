package thread_zoo;

public class Dog extends Animal implements Runnable{
	@Override
	void cry() {
		System.out.println("�пͷξƷ֤�ī����Į�ƤǶ���");
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			cry();
			try {
				Thread.sleep(300);
			} catch (InterruptedException e) {
			}
		}
	}
}
