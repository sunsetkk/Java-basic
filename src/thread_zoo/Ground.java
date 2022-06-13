package thread_zoo;

public class Ground {
	public static void main(String[] args) {
//		동물 세마리 만들어서 동시에 울게하기
//		한마리는 300밀리초마다, 한마리는 500밀리초마다, 한마리는 200밀리초마다 울게
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
