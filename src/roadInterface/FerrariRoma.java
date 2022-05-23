package roadInterface;

public class FerrariRoma extends Car implements Ferrari{

	@Override
	public void engineStart() {
		System.out.println(brand + " 터치로 시동켜기");
	}

	@Override
	public void engineStop() {
		System.out.println(brand + " 터치로 시동끄기");
	}

}
