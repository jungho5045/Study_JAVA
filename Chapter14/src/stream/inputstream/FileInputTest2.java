package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest2 {

	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("input.txt");) {
					
			int i;
			while ( (i = fis.read()) != -1){		// read()는 한 바이트씩 읽기 때문에 한글(멀티 바이트)은 깨진다.
				System.out.print((char)i);
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
		
	}

}
