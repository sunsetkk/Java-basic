package inner;

import inner.Out.In;

public class InnerTest {
	public static void main(String[] args) {
//		B obj = new B();
		Out out = new Out();
		
//		import ���� �� �ܺ�Ŭ������.����Ŭ������ ���� ��üȭ ����
//		Out.In in = out.new In();
		In in = out.new In();
		in.f();
		
		In in2 = out.doSomething();
		
	}
}
class A{
	int data = 10;
}
class B extends A{
	void f() {
		System.out.println(data);
	}
}

class Out{
	int data = 20;
	
	In doSomething() {
		System.out.println("In Ÿ���� ��ü�� ����� �ٰԿ� ~!");
		return new In();
	}
	
	class In{
		void f() {
			System.out.println(data);
		}
	}
}