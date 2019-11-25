package ifexample;

import java.util.Scanner;

public class ifexample4 {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 20;
		
		int max;
		
		max = (a>b)?a:b;
		System.out.println(max);
		
		/*
		 * 조거문과 조건 연산자
		 * if-else 문은 조건 연산자로 구현 할 수 있음
		 * 1) if-else 문
		 * if(a>b)
		 * 	max = a;
		 * else
		 * 	max = b;
		 * 
		 * 2) 조건 연산자
		 * max = (a > b) ? a : b;
		 */
	}

}
