package exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ThrowsException {

	public Class loadClass(String fileName, String className) throws ClassNotFoundException, FileNotFoundException {
		FileInputStream fis = new FileInputStream(fileName);
		Class c = Class.forName(className);
		return c;
	}
	
	public static void main(String[] args) {
		
		// throws�� �̷� ���ܴ� �޼��� ȣ�� �� �����ؾ� �Ѵ�.
		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {	// ����Ʈ exceptoin���� ��� ����ó���� �ֻ��� �����̱� ������ ���� ���ʿ� �����ϸ� �ȵȴ�.
			System.out.println(e);
		}
		System.out.println("end");
	}

}
