package Loopexample;

public class ForExample2 {

	public static void main(String[] args) {
		
		// for문의 구구단
//		for(int i=2 ; i<10 ; i++) {
//			for(int j=1 ; j<10 ; j++)
//				System.out.println(i + " X " + j + " = " + i*j);
//			System.out.println("");
//		}
		
		// while문의 구구단
//		int i=2;
//		while(i<10) {
//			int j=1;
//			while(j<10) {
//				System.out.println(i + " X " + j + " = " + i*j);
//				j++;
//			}
//			i++;
//			System.out.println("");
//		}
		
		// 구구단 3단씩 출력
		for(int i=1; i<10; i+=3) {
			for(int j=1; j<10; j++){
				for(int k=i; k<i+3; k++) {
					System.out.print(k + " X " + j + " = " + j*k + "\t");
				}
				System.out.println();
			}
			System.out.println("*******************************************");
		}
		
		// for(;;) {} - for문의 무한루프
		// while(true) {} - while문의 무한루프
		
		
		/*
		 * 반복문의 쓰임
		 * 
		 * 			while문							do-while문						for문
		 * 
		 * 수행		조건이 참인 동안 반복 수행				조건이 참인 동안 반복 수행				초기화, 조건체크, 증감 순으로 수행
		 * 			조건이 맞지 않으면 수행되는 부분이 없음		수행문을 먼저 수행하고 조건 체크
		 * 
		 * 쓰임		조건식의 결과나 변수가 true, false		조건식의 겨로가나 변수가 true, false	특정 수의 범위, 쵯수와 관련하여 반복되는
		 * 			값인 경우 주로 사용					값인 경우 주로 사용					경우 주로 사용 배열과 함께 많이 사용됨
		 * 
		 * ------------------------------------------------------------------------------------------------------
		 * 중첩 반복문
		 * 반복문이 중첩되어 구현되는 경우
		 * 반복문 내부에 또 다른 반복문이 있음
		 * 외부 반복문과 내부 반복문 간의 변수 값 변화에 유의 하며 구현해야 함
		 * ------------------------------------------------------------------------------------------------------
		 * for를 이용한 반복문 문제(while 동일)
		 * 구구단을 구현해 봅시다.
		 */
	}

}
