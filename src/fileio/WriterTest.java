package fileio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriterTest {
	public static void main(String[] args) {
		try {
//			FileWriter fw = new FileWriter("C:\\asdasfkejfk\\test.txt");
			FileWriter fw = new FileWriter("test.txt");
			System.out.println("파일 쓰기 준비 완료!");
			
			BufferedWriter bw = new BufferedWriter(fw);
			
			System.out.println("버퍼 준비 완료 !");
			
			bw.write("Hello Java!");
			bw.write("자바의 마지막 파일입출력~");
//			bw.flush();
			bw.close();
			
			System.out.println("파일에 쓰기 완료!");
			
		} catch (IOException e) {
			System.out.println("폴더 경로 이상");
		}
		
		
	}
}
