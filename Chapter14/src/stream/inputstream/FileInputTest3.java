package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest3 {

	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("input2.txt");) {
					
			int i;
			byte[] bs = new byte[10];
			while ( (i = fis.read(bs)) != -1){		// read()는 한 바이트씩 읽기 때문에 한글(멀티 바이트)은 깨진다.
				
				/*for(byte b : bs) {				// 읽은만큼 출력하지 않기때문에 뒤에 쓰레기값이 나올수있다.
					System.out.print((char)b);
				}*/
				
				for(int k=0; k<i; k++) {			// 읽은만큼만 출력하는 구문
					System.out.print((char)bs[k]);
				}
				
				System.out.println();
			}
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("end");
		
	}

}
