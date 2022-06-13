package thread;

public class ThreadTest {
	public static void main(String[] args) {
		MyThread t1 = new MyThread("♡");
		MyThread t2 = new MyThread("♥");
		
		MyRunnable r1 = new MyRunnable("☆");
		MyRunnable r2 = new MyRunnable("★");
		Thread t3 = new Thread(r1);
		Thread t4 = new Thread(r2);
		
		System.out.println("두개의 쓰레드 운영 시작 !");
//		start()는 완성된 쓰레드를 컴퓨터에 넘겨주며 스케쥴링 시키는 메서드이다.
//		스케쥴링이 되어야만 멀티쓰레드로 운영이 된다.
//		t1.start();
//		t2.start();
		
		t3.start();
		t4.start();
		
		
//		join() 메서드는 다른 쓰레드들을 본인이 완료될 때 까지 잠시 멈춰두는 역할을 한다.
		try {
//			t1.join();
//			t2.join();
			t3.join();
			t4.join();
		} catch (InterruptedException e) {
		}
		
		System.out.println("두 쓰레드 모두 종료!");
		
	}
}
