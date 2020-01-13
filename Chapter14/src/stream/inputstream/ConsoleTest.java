package stream.inputstream;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		
		// Console은 eclipse와 연동이 안되있어서 cmd에서 사용해야 한다.
		// cmd에서 해당 java 프로젝트 bin 디렉터리 위치에서 "java 해당 패키지명.파일명"을 실행하면 확인할 수 있다.
		// ex) C:\Users\JungHo_Lee\git\Study_JAVA\Chapter14\bin>java stream.inputstream.ConsoleTest
		
		Console console = System.console();
		
		System.out.println("이름 : ");
		String name = console.readLine();
		
		System.out.println("비밀번호 : ");
		char[] password = console.readPassword();
		
		System.out.println(name);
		System.out.println(password);
	}

}
