package array;

import java.util.ArrayList;	// ArrayList 라이브러리 참조

public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> list = new ArrayList();
		
		list.add("aaa");
		list.add("bbb");
		list.add("ccc");
		
		for(int i=0; i<list.size(); i++) {
			String string = list.get(i);
			System.out.println(string);
		}
		
		for(String s : list) {
			System.out.println(s);
		}
		
	}

}
