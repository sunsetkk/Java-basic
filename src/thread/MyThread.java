package thread;

public class MyThread extends Thread{
	String data;
	
	public MyThread(String data) {
		this.data = data;
	}

//	쓰레드가 시작되었을 때 수행할 작업은 run() 내부에 선언된 코드들이다.
	@Override
	public void run() {
		for (int i = 0; i < 10; i++) {
			System.out.println(data);
			try {
				sleep(1000);
			} catch (InterruptedException e) {
			}
		}
	}
}
