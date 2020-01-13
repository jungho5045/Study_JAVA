package stream.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		
		// FileInputStream fis = new FileInputStream("reader.txt");					// 바이트 단위로 읽기 때문에 한글(멀티 바이트)과 같은 언어는 오류가 난다.
		
		// FileInputStream fis = new FileInputStream("reader.txt");					// 문자 단위로 읽기 때문에 한글(멀티 바이트)과 같은 언어도 오류가 나지 않는다.
		// InputStreamReader isr = new InputStreamReader(fis);							// 보조 스트림 InputStreamReader() : 바이트 단위를 문자 단위로 바꿔준다.
		
		FileReader fis = new FileReader("reader.txt");
		int i;
		while((i=fis.read()) != -1) {
			System.out.print((char)i);
		}
		
		fis.close();
		
	}

}
