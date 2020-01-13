package stream.inputstream;

import java.io.Console;

public class ConsoleTest {

	public static void main(String[] args) {
		
		// Console�� eclipse�� ������ �ȵ��־ cmd���� ����ؾ� �Ѵ�.
		// cmd���� �ش� java ������Ʈ bin ���͸� ��ġ���� "java �ش� ��Ű����.���ϸ�"�� �����ϸ� Ȯ���� �� �ִ�.
		// ex) C:\Users\JungHo_Lee\git\Study_JAVA\Chapter14\bin>java stream.inputstream.ConsoleTest
		
		Console console = System.console();
		
		System.out.println("�̸� : ");
		String name = console.readLine();
		
		System.out.println("��й�ȣ : ");
		char[] password = console.readPassword();
		
		System.out.println(name);
		System.out.println(password);
	}

}
