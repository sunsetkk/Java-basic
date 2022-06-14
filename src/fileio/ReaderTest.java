package fileio;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReaderTest {
	public static void main(String[] args) {
		try {
			FileReader fr = new FileReader("test.txt");
			System.out.println("파일 준비 완료 !");
			
			BufferedReader br = new BufferedReader(fr);
			System.out.println("버퍼 준비 완료 !");
			
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
			System.out.println("파일이 존재하지 않습니다.");
		} catch (IOException ioe) {
			System.out.println("파일 읽기 오류 !");
		}
	}
}
