package collection;

import java.util.LinkedList;

public class LinkedListTest {

	public static void main(String[] args) {
		
		// LinkedList�� ������ ���� �ε����� �����ϰ� �����Ѵ�
		LinkedList<String> myList = new LinkedList<String>();
		
		// �ε��� �߰�
		myList.add("A");
		myList.add("B");
		myList.add("C");
		System.out.println(myList);
		
		// �߰� �ε��� �߰�
		myList.add(1, "D");
		System.out.println(myList);
		
		// 0��° �Ǵ� ��������° �ε��� ����
		// myList.removeFirst();
		myList.removeLast();
		System.out.println(myList);
		
		for(int i=0; i<myList.size(); i++) {
			String s = myList.get(i);
			System.out.println(s);
		}
		
	}

}
