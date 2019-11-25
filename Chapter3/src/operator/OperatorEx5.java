package operator;

public class OperatorEx5 {

	public static void main(String[] args) {
		
		int num1 = 10;
		int i = 2;
		
		boolean value = ( (num1 = num1 + 10) < 10) && ( (i = i + 2) < 10);	// 앞의 연산만으로 short circuit evaluation이 발생하여 i는 그대로 '2'이다.
		
		System.out.println(num1);
		System.out.println(i);
		
		System.out.println(value);
		
		
		/*
		 * 관계 연산자
		 * 연산의 겨로가가 true/false로 반환 됨
		 * 비교 연산자 라고도 함
		 * 
		 * 연산자			기능												연산 예
		 * >			왼쪽 항이 크면 참을, 아니면 거짓을 반환합니다.				num > 3;
		 * <			왼쪽 항이 작으면 참, 아니면 거짓을 반환합니다.				num < 3;
		 * >=			왼쪽 항이 오른쪽 항보다 크거나 같으면 참, 아니면 거짓을 반환합니다.	num >= 3;
		 * <=			왼쪽 항이 오른쪽 항보다 작거나 같으면 참, 아니면 거짓을 반홥합키다.	num <= 3;
		 * ==			두 개 항의 값이 같으면 참, 아니면 거짓을 반환합니다.			num == 3;
		 * !=			두 개 팡이 다르면 참, 아니면 거짓을 반환합니다.				num != 3;
		 * 
		 * 논리 연산자
		 * 관계 연산자와 함께 많이 사용됨
		 * 연산의 결과가 true/false로 반환 됨
		 * 
		 * 연산자			기능												연산 예
		 * &&			두 항이 모두 참인 경우에만 결과 값이 참입니다.				bolleanval = (5 > 3) && (5 > 2);
		 * (논리 곱)		그렇지 않은 경우는 거짓입니다.							
		 * ||			두 항 중 하나의 항만 참이면 결과 값은 참입니다.				bolleanval = (5 > 3) || (5 > 2);
		 * (논리 합)		두 항이 모두 거짓이면 결과 값은 거짓입니다.							
		 * !			단항 연산자입니다. 참인 경우는 거짓으로 바꾸고,				bolleanval = !(5 > 3);
		 * (부정)			거짓인 경우는 참으로 바꿉니다.
		 * 
		 * 단락 회로 평가(short circuit evaluation)
		 * 논리 곱(&&)은 두 항이 모두 true 일 때만 결과가 true : 앞의 항이 false 이면 뒤 항의 결과를 평가하지 않아도 false 임
		 * 논리 합(||)은 두 항이 모두 false 일 때만 결과가 false : 앞의 항이 true 이면 뒤 항의 결과를 평가하지 않아도 true 임
		 * 실제 프로그램에서 예상하지 않는 결과가 발생할 수 있으므로 유의
		 */
	}

}
