package stream.decorator;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

public class FileCopy {

	public static void main(String[] args) {
		
		long milliseconds = 0;
		
		try( FileInputStream fis = new FileInputStream("KMSAuto_test.zip");
				FileOutputStream fos = new FileOutputStream("copy.zip");
				BufferedInputStream bis = new BufferedInputStream(fis);				// 보조스트림 BufferdInputStream
				BufferedOutputStream bos = new BufferedOutputStream(fos)){			// 보조스트림 BufferdOutputStream
			
			milliseconds = System.currentTimeMillis();
			
			int i;
			while((i = fis.read()) != -1) {
				fos.write(i);
			}
			
			milliseconds = System.currentTimeMillis() - milliseconds;
			
		} catch (IOException e) {
			System.out.println(e);
		}

		Socket socket = new Socket();
		
		// BufferedReader isr = new BufferedReader(new InputStreamReader(socket.getInputStream()));		// Decorator Pattern
		// isr.readLine();
		
		System.out.println("시간 : " + milliseconds);
	}

}
