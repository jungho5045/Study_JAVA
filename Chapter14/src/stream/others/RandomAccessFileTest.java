package stream.others;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileTest {

	public static void main(String[] args) throws IOException {
		
		RandomAccessFile rf = new RandomAccessFile("random.txt", "rw");
		rf.writeInt(100);
		System.out.println(rf.getFilePointer());
		
		rf.writeDouble(3.14);
		rf.writeUTF("안녕하세요");
		
		rf.seek(0);				// 포인터를 0번째 위치로 옮긴다.(이유 : rf.writeUTF("안녕하세요"); 하는 순간 맨 끝으로 포인터가 이동하기 때문이다.)
		int i = rf.readInt();
		double d = rf.readDouble();
		String str = rf.readUTF();
		
		System.out.println(i);
		System.out.println(d);
		System.out.println(str);
		
	}

}
