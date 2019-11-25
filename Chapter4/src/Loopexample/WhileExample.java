package Loopexample;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		
//		int num = 1;
//		int sum = 0;
//		
//		while( num <= 10) {
//			sum+= num;
//			num++;	//11
//		}
//		
//		System.out.println(sum);
//		System.out.println(num);
		
		int input;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		
		while(input != 0) {
			sum += input;
			input = scanner.nextInt();
		}
		
		System.out.println(sum);
		
	}

}

/*
 * 반복문
 * 동일한 수행문을 조건에 맞는 동안 수행하도록 하는 기능
 * 예시)
 * 1. 달리는 자동차
 * 2. 일정 횟수만큼 돌아가는 나사
 * 3. 특정 온도까지 가동되는 에어컨
 * 
 * while문
 * 조건이 참인 동안 수행문이 반복해서 수행됨
 * while(조건식){
 * 	수행문1;
 * 	...
 * }
 * 	수행문2;
 * 	...
 */
