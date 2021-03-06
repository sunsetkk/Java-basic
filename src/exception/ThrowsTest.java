package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsTest {
	public static void main(String[] args) throws Exception{
		div(10,3);//	10/3
		
		try {
			div(10,1);
		} catch (ArithmeticException ae) {
			
		}
		
		try {
			div(20,1);
		} catch (FileNotFoundException fnfe) {
			System.out.println("?Ϳ?");
		}
	}
	
	static int div(int num1, int num2) throws FileNotFoundException {
//		Alt + Shift + Z > ?? > enter : try~catch??
		if(num2 == 0) {
			throw new ArithmeticException();
		}
		if(num2 == 1) {
			throw new FileNotFoundException();
		}
		
		return num1/num2;
	}
	
}
