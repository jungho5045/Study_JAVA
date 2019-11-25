package Loopexample;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		
//		int num = 1;
//		int sum = 0;
//		
//		do{
//			sum+= num;
//			num++;	//11
//		}while( num <= 10);
//		
//		System.out.println(sum);
//		System.out.println(num);

		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;
		do {
			input = scanner.nextInt();
			sum += input;
		}while(input != 0);
		
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
 * do-while문
 * 먼저 수행문을 수행하고 조건 체크
 * 한번 이상 수행문이 수행되어야 하는 경우 사용
 * do{
 * 	수행문1;
 * 	...
 * } while(조건식);
 * 	수행문2;
 * 	...
 * 
 * while문과 do-while문 비교
 * 입력 받는 정수를 모두 더해 줍니다.
 * 입력된 정수가 0이면 반복문을 빠져 나옵니다.
 */
