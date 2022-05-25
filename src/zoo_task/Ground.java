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
//		������ �θ���, ����� �Ѹ���, ���� �Ѹ��� ����
//		���������� ����ϰ�, ������� �����̰� �ϱ�
//		������ �ִ� ��Ű���� cage
		Animal[] arAnimal = {
				new Dove("����", "��", 9),
				new Turtle("�α��", "��", 5),
				new Lion("�ɹ�", "��", 3),
				new Racoon("�ʱ���", "��", 2)
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