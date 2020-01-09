package lamda;

public class TestStringConcat {

	public static void main(String[] args) {
		
		// 기존 사용 방식
		StringConImpl impl = new StringConImpl();
		impl.makeString("hello", "world");
		
		// 람다식 방식(클래스 구현하여 함수를 따로 구현하지 않아도 된다)
		StringConcat concat = (s, v) -> System.out.println(s+","+v);
		concat.makeString("hello", "world");
		
		// 람다식은 내부적으로 익명 내부 클래스가 선언된다.
		StringConcat concat2 = new StringConcat() {
			
			@Override
			public void makeString(String s1, String s2) {
				System.out.println(s1+","+s2);
			}
		};
		
		concat2.makeString("hello", "world");
		
	}

}
