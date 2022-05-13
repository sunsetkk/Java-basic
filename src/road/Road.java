package road;

public class Road {
	public static void main(String[] args) {
//		Alt + Shift + R : 선언부와 사용부를 동시에 이름 변경
		Car car0 = new Car("Ferrari", "Red", 65000);
		Car car1 = new Car("K7", "White", 7000);
		Car car2 = new Car(28000);
		Car[] garage = {
				new Car("Ferrari", "Red", 65000),
				new Car("K7", "White", 7000),
				new Car(28000)
		};
		
		car0.engineStart();
		car1.engineStart();
		car2.engineStart();
		
		int data0 = 0;
		int data1 = 10;
		int data2 = 42;
		int[] arData = {0, 10, 42};
	}
}
