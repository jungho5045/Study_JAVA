package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		set.add("이순신");
		set.add("김유신");
		set.add("강감찬");
		set.add("이순신");
		
		// toString()을 이용하여 한번에 출력
		System.out.println(set);	// 순서와 상관없이 저장, 중복을 허용하지 않음(고유 키값(학번, 주민등록번호 등)을 관리할 때 사용)
		
		// Iterator를 이용하여 순회 하나씩 출력
		Iterator<String> ir = set.iterator();
		
		while(ir.hasNext()) {	// hasNext() 다음 요소가 있는지 확인, 리턴값은 boolean
			String str = ir.next();
			System.out.println(str);
		}
		
	}

}