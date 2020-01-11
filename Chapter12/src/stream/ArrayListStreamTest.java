package stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class ArrayListStreamTest {

	public static void main(String[] args) {
		
		List<String> sList = new ArrayList<String>();
		sList.add("Tomas");
		sList.add("Edward");
		sList.add("Jack");
		
		Stream<String> stream = sList.stream();			// 이미 사용한 stream을 재사용 할 수 없다.
		stream.forEach(s->System.out.print(s + " "));
		System.out.println();
		
		sList.stream().sorted().forEach(s->System.out.println(s + " "));	// stream 생성 -> 중간연산(정렬_sorted) -> 최종연산(람다식 이용 요소값 출력)
		System.out.println();
		
		sList.stream().map(s->s.length()).forEach(n->System.out.println(n));// stream 생성 -> 중간연산(map 이용 string 길이 반환_length()) -> 최종연산(람다식 이용 요소값 출력)
		
	}

}
