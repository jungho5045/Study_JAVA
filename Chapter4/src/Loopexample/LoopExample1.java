package Loopexample;

import java.util.*;

public class LoopExample1 {

	public static void main(String[] args) {
		
		// if-else if-else문
//		int a, b;
//		String operator;
//		
//		Scanner scanner = new Scanner(System.in);
//		a = scanner.nextInt();
//		b = scanner.nextInt();
//		operator = scanner.next();
//		
//		if(operator.equals("+")) {
//			System.out.println(a + " + " + b + " = " + (a+b));
//		}else if(operator.equals("-")){
//			System.out.println(a + " - " + b + " = " + (a-b));
//		}else if(operator.equals("*")){
//			System.out.println(a + " * " + b + " = " + (a*b));
//		}else {
//			System.out.println(a + " / " + b + " = " + (a/b));
//		}
		
		// switch-case문
		int a, b;
		String operator;
		
		Scanner scanner = new Scanner(System.in);
		a = scanner.nextInt();
		b = scanner.nextInt();
		operator = scanner.next();
		
		switch(operator) {
			case "+":
				System.out.println(a + " + " + b + " = " + (a+b));
				break;
			case "-":
				System.out.println(a + " - " + b + " = " + (a-b));
				break;
			case "*":
				System.out.println(a + " * " + b + " = " + (a*b));
				break;
			case "/":
				System.out.println(a + " / " + b + " = " + (a/b));
				break;
				
		}
		
	}

}

/*
 * 1번 문제
 * 연산자와 두 수를 변수로 선언한 후 사칙연산이 수행 되는 프로그램을 만들어 보세요.
 * if-else if-else, swich-case 두 방식 모두 구현해 봅니다.
 */
