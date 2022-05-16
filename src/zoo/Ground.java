package zoo;

public class Ground {
	public static void main(String[] args) {
		//동물 세마리 만들어서 울게하기
		//각 동물은 울음소리 다르게
		//각 동물마다 특징적인 행동들 하나씩 하기
		
//		Cat cat = new Cat("키티", "여", 8);
//		Dog dog = new Dog("개리", "남", 7);
//		Meerkat meer = new Meerkat("꾸릉", "여", 5);
		
		Animal[] zoo = {
				new Cat("키티", "여", 8),
				new Dog("개리", "남", 7),
				new Meerkat("꾸릉이", "여", 5)
		};
		
		for (int i = 0; i < zoo.length; i++) {
			zoo[i].cry();
			zoo[i].move();
		}
	}
}
