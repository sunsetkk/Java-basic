package generic;

public class GenericMain {
	public static void main(String[] args) {
		//1. ���׸� Ŭ����
//		GClassTest<String> obj = new GClassTest<String>("�ܿ� �ʹ� �߿�");
//		GClassTest<Integer> obj2 = new GClassTest<Integer>(10);
		
//		System.out.println(obj.data);
//		System.out.println(obj2.data);
		
		//2. ���׸� �޼���
//		GMethodTest obj = new GMethodTest();
//		obj.<String>f("Hello");
//		obj.<Character>f('A');
//		obj.<Double>f(1);
//		���׸� �޼������ �Ϲ������� Ÿ���� �� �� �ִ� ��찡 ��κ��̴�.
//		�����ȣ�� �̿��ؼ� Ÿ���� ���������� ���� �ʾƵ� �ȴ�.
//		obj.f(12.24);
		
		//3. ���׸� �������̽�
		GInterTest<Integer, Double> obj = new GInterTest<Integer, Double>() {
			
			@Override
			public Double div(Double num1, Double num2) {
				return num1/num2;
			}
			
			@Override
			public Integer add(Integer num1, Integer num2) {
				return num1+num2;
			}
		};
		GInterImpl obj2 = new GInterImpl();
		
	}
}