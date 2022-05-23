package zoo_task;

import cage.Animal;
import cage.Dove;
import cage.Lion;
import cage.Mammalia;
import cage.Racoon;
import cage.Reptilia;
import cage.Turtle;

public class Ground{

	public static void main(String[] args) {
//		포유류 두마리, 파충류 한마리, 조류 한마리 만들어서
//		포유류들은 울게하고, 파충류는 움직이게 하기
//		동물이 있는 패키지는 cage
		Animal[] arAnimal = {
				new Dove("구구", "여", 9),
				new Turtle("부기맨", "남", 5),
				new Lion("심바", "남", 3),
				new Racoon("너굴맨", "여", 2)
		};
		
		for (int i = 0; i < arAnimal.length; i++) {
			if(arAnimal[i] instanceof Mammalia) {
				arAnimal[i].cry();
			}
			if(arAnimal[i] instanceof Reptilia) {
				arAnimal[i].move();
			}
		}
		
		
	}
}
