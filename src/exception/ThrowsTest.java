package exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowsTest {
	public static void main(String[] args) {
		try {
			f();
		} catch (FileNotFoundException e) {
		}
	}
	static void f() throws FileNotFoundException {
//		Alt + Shift + Z > �� > enter : try~catch��
		new FileReader("");
	}
	
}
