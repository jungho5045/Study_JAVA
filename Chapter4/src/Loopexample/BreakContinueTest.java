package Loopexample;

public class BreakContinueTest {

	public static void main(String[] args) {
		
		for(int i=2; i<10; i++) {
			if((i%2) == 1)
				continue;
			for(int j=1; j<10; j++) {
				if(i < j)
					break;
				System.out.println(i + " X " + j + " = " + i*j);
					
			}
			System.out.println("");
		}
	}
}

/*
 * break, continue 문제
 * 구구단을 출력할 때 짝수 단만 출력하면서 단보다 곱하는 수가 작거나 같을 때까지만 출력하세요
 */
