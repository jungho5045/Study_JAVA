package ifexample;

import java.util.Scanner;

public class ifexample2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		int charge = 0;
		
		if(age < 8) {
			charge = 1000;
		} else if(age < 14) {
			charge = 1500;
		} else if(age < 20) {
			charge = 2000;
		} else {
			charge = 3000;
		}
		
		System.out.println("나이 : " + age);
		System.out.println("요금 : " + charge);
		
		/*
		 * if-else if-else문
		 * 하나의 조건에 대한 여러 경우에 대해 수행문이 각각 다른 경우
		 * if(조건식){
		 * 		수행문1;
		 * }else if(조건식){
		 * 		수행문2;
		 * }else if(조건식){
		 * 		수행문3;
		 * }else{
		 * 		수행문4;
		 * }
		 * 
		 * -------------------------------------------
		 * 
		 * if, if와 if, if else의 차이는 배타적인 관계로 한번 더 조건문을 실행하는지의 차이가 있다.(if, if면 모든 조건문을 실행한다.)
		 */
	}

}
