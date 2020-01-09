package lamda;

interface PrintString{
	void showString(String s);
}

public class TestLambda {

	public static void main(String[] args) {
		
		PrintString lambdStr = s->System.out.println(s);
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
