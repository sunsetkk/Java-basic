package fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("test.txt");
			System.out.println("���� �غ� �Ϸ� !");
			
			BufferedReader br = new BufferedReader(fr);
			System.out.println("���� �غ� �Ϸ� !");
			
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			System.out.println(br.readLine());
			
			fr = new FileReader("test.txt");
			br = new BufferedReader(fr);
			
			while(true) {
				String line = br.readLine();
				if(line == null) {
					break;
				}
				System.out.println(line);
			}
			
			
		} catch (FileNotFoundException fnfe) {
			System.out.println("������ �������� �ʽ��ϴ�.");
		} catch (IOException ioe) {
			System.out.println("���� �б� ���� !");
		}
	}
}