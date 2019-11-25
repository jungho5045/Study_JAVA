package variable;

public class BooleanTest {

	public static void main(String[] args) {
		
		boolean isMarried = false;
		
		System.out.println(isMarried);
		
		/*
		 * 자료형 없이 변수 사용하기 (JAVA 10 버전부터 가능)
		 * 지역 변수 자료형 추출(Local variable type inference)
		 * 변수의 타입을 정하지 않아도, 대입되는 값을 보고 컴파일러가 추론
		 * 
		 * var	num		=	10				int 	num		=	10;
		 * var	dNum	=	10.0			double	dNum	=	10.0;
		 * var	str		=	"hello";		String	str		=	"hello";
		 * 
		 * 상수와 리터럴
		 * 상수 (Constant) : 변하지 않는 수
		 * 리터럴 (Literal) : 프로그램에서 사ㅛㅇㅇ하는 모든 숫자, 값, 논리 값
		 * 					예) 10, 3.14, 'A', true
		 * 모든 리터럴은 상수 풀(Constant pool)에 저장되어 있음
		 * 상수 풀에 저장될 때 정수는 int, 실수는 double 로 저장 됨
		 * 
		 * 형 변환
		 * 서로 다른 자료형의 값이 대입되는 경우 형 변환이 일어 남
		 * 묵시적 형 변환 (Impolicit type conversion) : 작은 수 에서 큰 수로 덜 정밀한 수에서 더 정밀한 수로 대입되는 경우
		 * 명시적 형 변환 (Explicit type conversion) : 변환 되는 자료 형을 명시 자료의 손실이 발생 할 수 있음
		 * 
		 */

	}

}
