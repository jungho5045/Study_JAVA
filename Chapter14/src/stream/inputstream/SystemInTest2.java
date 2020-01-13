package stream.inputstream;

import java.io.IOException;
import java.io.InputStreamReader;

public class SystemInTest2 {

	public static void main(String[] args) {
		
		// ��� I/O�� Exception ó���� �ؾ� �Ѵ�.
		System.out.println("�Է� �� '��' �̶�� ������ : ");
		try {
			int i;
			InputStreamReader isr = new InputStreamReader(System.in);		// InputStreamReader() ���� ��Ʈ�� : ����Ʈ�� ���� ���� ���ڷ� �ٲ��ش�.
			while( (i = isr.read()) != '��') {								// read()�� ��ȯ���� int�� �̰�, �� ����Ʈ�� ������ �ȴ�.
				System.out.print((char)i);
			}		
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
		
	}

}
