package annoymousRoad;

public class Road {
	public static void main(String[] args) {
//		익명 클래스는 앞에 있는 생성자의 클래스를 상속받고 있는
//		이름 없는 자식 클래스이다. 일회용 클래스이다.
//		그 앞에있는 생성자를 통해 만드는 객체 딱 하나만을 위한 클래스이다.
//		그 때 만들어지는 객체는 익명 클래스 안에서 구현한 메서드의 내용을 가지게 된다.
//		이렇게 만들어지는 객체는 익명구현객체 라고 한다.
		Car mycar = new Car("Ferrari") {
			
			@Override
			void engineStart() {
				System.out.println(brand + " 터치로 시동 켜기");
			}
			
//			새로운 메서드를 구현하게 되면 자식에서 내용을 추가하는 것이나 마찬가지이고
//			만들어지는 객체를 이 익명클래스 타입으로 다운캐스팅을 해야만 사용 가능하다.
//			하지만 익명클래스는 일회용으로 이름이 없기 때문에 다운캐스팅이 불가능하다.
//			따라서 새로운 메서드는 이 영역 내부에서만 사용 가능하다.
			void f() {
				System.out.println("새로운 메서드");
			}
		};
		
		mycar.engineStart();
		
	}
}
