package Loopexample;

import java.util.*;

public class LoopExample1 {

	public static void main(String[] args) {
		
		// if-else if-else��
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
		
		// switch-case��
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
 * 1�� ����
 * �����ڿ� �� ���� ������ ������ �� ��Ģ������ ���� �Ǵ� ���α׷��� ����� ������.
 * if-else if-else, swich-case �� ��� ��� ������ ���ϴ�.
 */
