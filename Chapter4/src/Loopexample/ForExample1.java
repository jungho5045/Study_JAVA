package Loopexample;

public class ForExample1 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int count = 1 ; count <=10 ; count++)	// 주로 초기화식은 카운팅은 0부터 한다.(배열의 인덱스는 0부터 시작)
			sum += count;
		
		System.out.println(sum);
		
		int num = 1;
		int total = 0;
		while(num <= 10) {
			total += num;
			num++;
		}
		
		System.out.println(total);
		
		/*
		 * for문
		 * 반복문 중 가장 많이 사용됨
		 * 일정 횟수에 기반한 반복을 구현할 때 효율적임
		 * for(초기화식; 조건식; 증감식){
		 * 		수행문;
		 * }
		 * -------------------------------
		 * for문
		 * 1부터 10까지 더하여 결과를 출력해 보자
		 * -------------------------------
		 * 초기화식, 조건식, 증감식은 ','를 구분으로 여러개 사용 가능하다.
		 */
	}

}
