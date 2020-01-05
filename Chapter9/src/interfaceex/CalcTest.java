package interfaceex;

public class CalcTest {

	public static void main(String[] args) {
		
		calc Calc = new CompleteCalc();
		int n1 = 10;
		int n2 = 2;
		
		System.out.println(Calc.add(n1, n2));
		System.out.println(Calc.substract(n1, n2));
		System.out.println(Calc.times(n1, n2));
		System.out.println(Calc.divide(n1, n2));
		
		Calc.description();
		
		int[] arr = {1, 2, 3, 4, 5};
		int sum = calc.total(arr);
		System.out.println(sum);
		
	}

}
