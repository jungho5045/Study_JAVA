package operator;

public class OperatorEx7 {

	public static void main(String[] args) {
		
		int num1 = 0B00001010;	// 10
		int num2 = 0B00000101;	// 5
		
		System.out.println(num1 & num2);	// 0
		System.out.println(num1 | num2);	// 15
		System.out.println(num1 ^ num2);	// 15
		
		System.out.println(num2 << 1);	// 10
		System.out.println(num2 << 2);	// 20
		System.out.println(num2 << 3);	// 40
		
		System.out.println(num2 >> 1);	// 2
		System.out.println(num2 >> 2);	// 1
		System.out.println(num2 >> 3);	// 0
		
		
		/*
		 * 비트 연산자
		 * 
		 * 연산자			기능								연산 예
		 * ~			비트의 반전 (1의 보수)				a = ~a;
		 * &			비트 단위 AND						1&1 1반환 그 외는 0
		 * |			비트 단위 OR						0|0 0반환 그 외는 1
		 * ^			비트 단위 XOR						두개의 비트가 서로 다른 경우에 1을 반환
		 * <<			왼쪽 Shift						a << 2 변수 a를 2비트 만큼 왼쪽으로 이동
		 * >>			오른쪽 Shift						a >> 2 변수 a를 2비트 만큼 오른으로 이동
		 * >>>			오른쪽 Shift						>> 동일한 연산, 채워지는 비트가 부호와 상관 없이 0 임
		 * 
		 * 대입연산자와 다른 연산자가 함께 쓰임
		 * 마스크 : 특정 비트를 가리고 몇 개의 비트 값만 사용할 때
		 * 비트켜기 : 특정 비트들만을 1로 설정해서 사용하고 싶을 때
		 * 예) &00001111 (하위 4비트 중 1이 비트만 꺼내기)
		 * 비트끄기 : 특정 비트들만을 0으로 설정해서 사용하고 싶을 때
		 * 예) |11110000 (하위 4비트 중 0인 비트만 0으로 만들기)
		 * 비트 토글 : 모든 비트들을 0은 1로, 1은 0으로 바꾸고 싶을 떄
		 */
	}

}
