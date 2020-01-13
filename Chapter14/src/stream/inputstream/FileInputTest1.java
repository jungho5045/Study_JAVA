package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest1 {

	public static void main(String[] args) {
		
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("input.txt");
			
			int i;
			while ( (i = fis.read()) != -1){		// read()는 한 바이트씩 읽기 때문에 한글(멀티 바이트)은 깨진다.
				System.out.print((char)i);
			}
//			System.out.println((char)i);	// a
//			i = fis.read();
//			System.out.println((char)i);	// b
//			i = fis.read();
//			System.out.println((char)i);	// c
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			try {
				fis.close();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("end");
		
	}

}
