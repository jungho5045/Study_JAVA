package collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		// LinkedList는 순서에 따라 인덱스를 저장하고 관리한다
		LinkedList<String> myList = new LinkedList<String>();
		
		// 인덱스 추가
		myList.add("A");
		myList.add("B");
		myList.add("C");
		System.out.println(myList);
		
		// 중간 인덱스 추가
		myList.add(1, "D");
		System.out.println(myList);
		
		// 0번째 또는 마지막번째 인덱스 삭제
		// myList.removeFirst();
		myList.removeLast();
		System.out.println(myList);
		
		for(int i=0; i<myList.size(); i++) {
			String s = myList.get(i);
			System.out.println(s);
		}
		
	}

}
