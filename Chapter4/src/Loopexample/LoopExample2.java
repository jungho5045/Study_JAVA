package Loopexample;

public class LoopExample2 {

	public static void main(String[] args) {
				
		for(int i=0; i<7; i++) {
			if(i<4) {
				for(int j=3; j>i; j--)
					System.out.print(" ");
				for(int j=0; j<i*2+1; j++)
					System.out.print("*");
			}
			if(i>3) {
				for(int j=0; j<i-3; j++)
					System.out.print(" ");
				for(int j=5; j>(i-4)*2; j--)
					System.out.print("*");
			}
			System.out.println("");
		}
	}

}

/*
 * 2번 문제
 * 다음 다이아몬드를 출력해 보세요
 */
