package wrapper;

public class WrapperTest2 {
	public static void main(String[] args) {
//		System.out.println(Integer.toHexString(1711685));
//		Integer obj2 = 1711685;
		
//		f1(10);
//		f2(20);
		
		f(10);
		f(11.1);
		f((Integer)20);
		Object obj = (Integer)10;
		f(obj);
		
	}
	
	static void f(int data) {
		System.out.println("int Ÿ������ ȣ���� �޼��� ! " + data);
	}
	static void f(Integer obj) {//Integer obj = 20;
		System.out.println("Integer Ÿ������ ȣ���� �޼��� ! " + obj.intValue());
	}
	//int, Integer ���� ��� ��, ��ü
	static void f(Object obj) {//Object obj = new Integer(10);
		System.out.println("Object Ÿ������ ȣ���� �޼��� !");
	}
}