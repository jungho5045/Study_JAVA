package innerclass;

class OutClass{
	
	private int num = 10;
	private static int sNum = 20;
	private InClass inClass;
	
	public OutClass(){
		inClass = new InClass();
	}
	
	class InClass{						// OutClass 생성 후 사용
		int iNum = 100;
		
		void inTest() {
			System.out.println(num);
			System.out.println(sNum);
		}
	}
	
	public void usingInner() {
		inClass.inTest();
	}
	
	static class InStaticClass{			// OutClass 생성 여부와 상관없이 사용 가능
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(sNum);
		}
		
		static void sTest() {
			// System.out.println(inNum);		// inNum 변수는 InStaticClass 생성 후 만들어지기 때문에 sTest() static 클래스에서 쓸 수 없다.
			System.out.println(sInNum);
			System.out.println(sNum);
		}
		
	}
	
}

public class InnerTest {

	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		outClass.usingInner();
		
		OutClass.InClass myInClass = outClass.new InClass();	// 외부에서 InnerClass 접근방법
		myInClass.inTest();
		
		System.out.println();
		
		// OutClass.InStaticClass sInClass = new OutClass.InStaticClass();	// OutClass 선언없이, InClass에 있은 static 클래스를 바로 생성할 수 있다.
		
		OutClass.InStaticClass.sTest();	// InClass에 있는 static class
		
	}

}
