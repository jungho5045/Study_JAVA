package operator;

public class OperatorEx4 {

	public static void main(String[] args) {
		
		int score = 100;
		
		System.out.println(++score);
		// score = score + 1;
		// score += 1;
		
		System.out.println(score++);
		System.out.println(score);
		
		System.out.println(--score);
		System.out.println(score--);
		System.out.println(score);
		
		
		/*
		 * 증가, 감소 연산자
		 * 단항 연산자
		 * 변수의 값을 1더하거나 뺄 때 사용
		 * 연산자가 항의 앞에 있는가 뒤에 있는가에 따라 그 결과가 달라짐
		 * 
		 * 연산자			기능												연산 예
		 * ++			항의 값에 1을 더합니다.								val = ++num;	// 먼저 num 값이 1 증가한 후 val 변수에 대입
		 * 																val = num++;	// val 변수에 기존 num 값을 먼저 대입한 후 num 값 1 증가
		 * --			항의 값에서 1을 뺍니다.								val = --num;	// 먼저 num 값이 1 감소한 후 val 변수에 대입
		 */
	}

}
