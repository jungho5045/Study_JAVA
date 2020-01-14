package stream.inputstream;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputTest3 {

	public static void main(String[] args) {
		
		try (FileInputStream fis = new FileInputStream("input2.txt");) {
					
			int i;
			byte[] bs = new byte[10];
			while ( (i = fis.read(bs)) != -1){		// read()�� �� ����Ʈ�� �б� ������ �ѱ�(��Ƽ ����Ʈ)�� ������.
				
				/*for(byte b : bs) {				// ������ŭ ������� �ʱ⶧���� �ڿ� �����Ⱚ�� ���ü��ִ�.
					System.out.print((char)b);
				}*/
				
				for(int k=0; k<i; k++) {			// ������ŭ�� ����ϴ� ����
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