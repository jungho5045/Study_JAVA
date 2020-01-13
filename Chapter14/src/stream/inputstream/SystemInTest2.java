package stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {
		
		// 모든 I/O는 Exception 처리를 해야 한다.
		System.out.println("입력 후 '끝' 이라고 쓰세요 : ");
		try {
			int i;
			InputStreamReader isr = new InputStreamReader(System.in);		// InputStreamReader() 보조 스트림 : 바이트로 읽은 값을 문자로 바꿔준다.
			while( (i = isr.read()) != '끝') {								// read()의 반환값이 int형 이고, 한 바이트씩 저장이 된다.
				System.out.print((char)i);
			}		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

}
