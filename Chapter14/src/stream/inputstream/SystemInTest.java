package stream.inputstream;

import java.io.IOException;

public class SystemInTest {

	public static void main(String[] args) {
		
		// 모든 I/O는 Exception 처리를 해야 한다.
		System.out.println("입력 : ");
		try {
			int i = System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	// read()의 반환값이 int형이다.
		
	}

}
