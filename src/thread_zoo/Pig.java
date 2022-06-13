package thread_zoo;

public class Pig extends Animal implements Runnable{
	@Override
	void cry() {
		System.out.println("꾸에에엑 꾸이꾸이");
	}
	@Override
	public void run() {
		for (int i = 0; i < 30; i++) {
			cry();
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
 			}
		}
	}
}
