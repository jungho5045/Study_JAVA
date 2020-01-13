package stream.reader;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class FileReaderTest {

	public static void main(String[] args) throws IOException {
		
		// FileInputStream fis = new FileInputStream("reader.txt");					// ����Ʈ ������ �б� ������ �ѱ�(��Ƽ ����Ʈ)�� ���� ���� ������ ����.
		
		// FileInputStream fis = new FileInputStream("reader.txt");					// ���� ������ �б� ������ �ѱ�(��Ƽ ����Ʈ)�� ���� �� ������ ���� �ʴ´�.
		// InputStreamReader isr = new InputStreamReader(fis);							// ���� ��Ʈ�� InputStreamReader() : ����Ʈ ������ ���� ������ �ٲ��ش�.
		
		FileReader fis = new FileReader("reader.txt");
		int i;
		while((i=fis.read()) != -1) {
			System.out.print((char)i);
		}
		
		fis.close();
		
	}

}
