package lamda;

interface PrintString{
	void showString(String s);
}

public class TestLambda {

	public static void main(String[] args) {
		
		PrintString lambdStr = s->System.out.println(s);	// 매개변수로 s를 사용하고, 기능은 전달받은 s를 출력하는 기능을 구현하여 람다식을 사용한다.
		lambdStr.showString("Test");
		
		showMyString(lambdStr);
		
		PrintString test = returnString();
		test.showString("Test3");
	}
	
	public static void showMyString(PrintString p) {
		p.showString("Test2");
	}
	
	public static PrintString returnString() {
		return s->System.out.println(s +"!!!");
	}

}
