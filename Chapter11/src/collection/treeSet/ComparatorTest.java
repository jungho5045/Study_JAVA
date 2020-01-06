package collection.treeSet;

import java.util.Comparator;
import java.util.TreeSet;

class MyCompare implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		return s1.compareTo(s2) * (-1);		//기존에 정의되있는 Comparable 대신 새로 정의한 Compartor로 구현된다. - 내림차순(* (-1))
	}
	
}

public class ComparatorTest {

	public static void main(String[] args) {
		
		TreeSet<String> treeSet = new TreeSet<String>(new MyCompare());		// 생성자에 새로운 방식을 지정해야한다.
		treeSet.add("홍길동");
		treeSet.add("강감찬");
		treeSet.add("이순신");
		
		for(String str : treeSet) {
			System.out.println(str);
		}
		
	}

}
