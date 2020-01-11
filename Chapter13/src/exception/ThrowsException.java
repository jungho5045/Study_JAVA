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
		
		// throws로 미룬 예외는 메서드 호출 시 구현해야 한다.
		ThrowsException test = new ThrowsException();
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (ClassNotFoundException e) {
			System.out.println(e);
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (Exception e) {	// 디폴트 exceptoin으로 모든 예외처리의 최상위 예외이기 때문에 절대 앞쪽에 구현하면 안된다.
			System.out.println(e);
		}
		System.out.println("end");
	}

}
