package annoymousRoad;

public class Car {
	String brand;
	
	public Car() {}
	public Car(String brand) {
		this.brand = brand;
	}



	void engineStart() {
		System.out.println(brand + " 시동 켜기");
	}
}
