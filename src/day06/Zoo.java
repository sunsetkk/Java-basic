package day06;

public class Zoo {
	public static void main(String[] args) {
		//�̸�, ����, ����, ��
		//�Ա�, �ڱ�, �����̱�, ���
		//���� ������ ���� ����ϱ�
		Animal dog = new Animal("�ٵ���", 8, "��", "��Ƽ��");
		Animal cat = new Animal("ŰƼ", 5, "��", "�丣�þ�");
		Animal horse = new Animal("���", 20, "��", "�ȷι̳�");
		
		dog.cry();
		cat.cry();
		horse.cry();
	}
}

class Animal {
	String name;
	int age;
	String gen;
	String sort;
	
	//Alt + Shift + S > O : �ʵ带 �̿��ؼ� ������ �����
	public Animal(String name, int age, String gen, String sort){
		this.name = name;
		this.age = age;
		this.gen = gen;
		this.sort = sort;
	}
	
	void eat() {
		System.out.println(name + "��(��) �ȳ� �Դ´�.");
	}
	void sleep() {
		System.out.println(name + "��(��) ���� �ܴ�.");
	}
	void move() {
		System.out.println(name + "��(��) �������� �����δ�.");
	}
	void cry() {
		System.out.println(name + "��(��) ���� ���.");
	}
	
}
