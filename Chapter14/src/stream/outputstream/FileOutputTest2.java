package stream.outputstream;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileOutputTest2 {

	public static void main(String[] args) {
		
		byte[] bs = new byte[26];
		byte data = 65;
		for(int i=0; i<bs.length; i++) {
			bs[i] = data;
			data++;
		}
		
		try(FileOutputStream fos = new FileOutputStream("alpha.txt", true);		// 파일 뒤에 'true' 키워드를 사용하면 계속해서 append가 된다
				FileInputStream fis  = new FileInputStream("alpha.txt")) {
			
			fos.write(bs);
			int ch;
			while ( (ch = fis.read()) != -1) {
				System.out.print((char)ch);
			}
		}catch (IOException e) {
			System.out.println(e);
		}
		
	}

}
