package day06;

public class Zoo {
	public static void main(String[] args) {
		//이름, 나이, 성별, 종
		//먹기, 자기, 움직이기, 울기
		//동물 세마리 만들어서 울게하기
		Animal dog = new Animal("바둑이", 8, "남", "말티즈");
		Animal cat = new Animal("키티", 5, "여", "페르시안");
		Animal horse = new Animal("당근", 20, "여", "팔로미노");
		
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
	
	//Alt + Shift + S > O : 필드를 이용해서 생성자 만들기
	public Animal(String name, int age, String gen, String sort){
		this.name = name;
		this.age = age;
		this.gen = gen;
		this.sort = sort;
	}
	
	void eat() {
		System.out.println(name + "이(가) 냠냠 먹는다.");
	}
	void sleep() {
		System.out.println(name + "이(가) 쿨쿨 잔다.");
	}
	void move() {
		System.out.println(name + "이(가) 쿵쾅쿵쾅 움직인다.");
	}
	void cry() {
		System.out.println(name + "이(가) 엉엉 운다.");
	}
	
}
