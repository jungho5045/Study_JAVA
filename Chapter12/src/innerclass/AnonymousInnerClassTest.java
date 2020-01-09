package innerclass;

class Outer2{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {	// Runnable 타입의 메서드
		
		int num = 100;	// num은 getRunnable 메서드가 시작해서 끝날때까지만 유효한 지역변수
		
		return new Runnable() {			// 익명 내부 클래스

			@Override
			public void run() {
				
				// 메서드 안에서 지역변수를 사용할 경우 값을 변경할 수 없다.(유효성이 짧다)
				// num += 10;
				// i = 200;
				System.out.println(num);		// 값을 참조하는것은 가능하지만 변경은 할 수 없다.
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
				
			}
			
		};		// 구현의 끝을 알리는 ;을 적어준다
		
	}
	
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			
			System.out.println("test");
			
		}
	};
	
}


public class AnonymousInnerClassTest {

	public static void main(String[] args) {
		
		Outer2 outer = new Outer2();
		outer.runner.run();// 익명 내부 클래스
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();
		
	}

}
