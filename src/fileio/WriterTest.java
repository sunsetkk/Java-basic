package fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {
	public static void main(String[] args) {
		try {
//			FileWriter fw = new FileWriter("C:\\asdasfkejfk\\test.txt");
//			FileWriter fw = new FileWriter("test.txt");
			FileWriter fw = new FileWriter("test.txt", true);
			System.out.println("���� ���� �غ� �Ϸ�!");
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			System.out.println("���� �غ� �Ϸ� !");
			
//			bw.write("Hello Java!\r\n");
//			bw.write("�ڹ��� ������ ���������~");
			bw.write("\r\nBye Java!");
			
//			bw.flush();
			bw.close();
			
			System.out.println("���Ͽ� ���� �Ϸ�!");
			
		} catch (IOException e) {
			System.out.println("���� ��� �̻�");
		}
		
		
	}
}