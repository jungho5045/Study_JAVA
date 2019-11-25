package operator;

public class OperatorEx1 {

	public static void main(String[] args) {
		
		int num1 = -10;
		
		int num2 = 20;
		
		System.out.println(+num1);
		System.out.println(+num2);
		
		System.out.println(-num1);
		System.out.println(-num2);
		
		System.out.println(num1);
		System.out.println(num2);
		
		num1 = -num1;
		
		System.out.println(num1);
		
		/*
		 * Chapter 03
		 * 01 대입, 부호, 산술, 복합대입, 증가, 감소연산자
		 * 
		 * 항과 연산자
		 * 항 (operand) : 연산에 사용되는 값
		 * 연산자 (operator) : 항을 이용하여 연산하는 기호
		 * 
		 * 항에 개수와 연산자
		 * 연산자			설명				연산 예
		 * 단항 연산자		항에 한 개인 연산자	++num
		 * 이항 연산자		항이 두 개인 연산자	num1 + num2;
		 * 삼항 연산자		항이 세 개인 연산자	(5 > 3) ? 1 : 0;
		 * 
		 * 대입 연산자
		 * int age = 20;
		 * 왼쪽 변수의 값이 오른쪽에 대입
		 * 우선 순위가 가장 낮은 연산자
		 * 
		 * 부호 연산자
		 * 단항 연산자
		 * 변수의 부호를 유지 하거나(+) 바꿈(-)
		 * 실제 변수의 값이 변하려면 대입연산자를 사용해야 함
		 */
	}

}
