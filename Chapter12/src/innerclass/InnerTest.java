package innerclass;

class OutClass{
	
	private int num = 10;				// private 접근지정자 : 클래스 내부에서만 접근가능
	private static int sNum = 20;		// static 변수 : 정적 타입의 변수로, 인스턴스 생성전에 메모리에 할당된다.(고정)
	private InClass inClass;			// InClass 타입의 inClass 객체 선언
	
	public OutClass(){					// 생성자에 InnerClass 생성을 구현한다.
		inClass = new InClass();		// InClass 타입으로 선언한 inClass 객체를 InClass() 생성자를 이용하여 생성한다.
	}
	
	class InClass{						// OutClass 생성 후 사용
		int iNum = 100;					// 멤버 변수
		
		void inTest() {					// 메서드
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
		
		OutClass.InStaticClass.sTest();	// 외부에서 static class 바로 접근하는 방법
		
	}

}
