package lamda;

public class TestMyNumber {

	public static void main(String[] args) {
		
		MyMaxNumber max = (x, y) -> (x >= y)?x : y;		// return 문이 하나인 코드기 때문에 중괄호와 return 키워드를 생략 할 수 있다. - 구현부
		System.out.println(max.getMaxNumber(10, 20));
		
	}

}
