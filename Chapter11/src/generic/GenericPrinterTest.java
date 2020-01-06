package generic;

public class GenericPrinterTest {

	public static void main(String[] args) {
		
		GenericPrinter<Powder> powderPrinter = new GenericPrinter<Powder>();
		Powder powder = new Powder();
		powderPrinter.setMaterial(powder);
		System.out.println(powderPrinter);
		
		GenericPrinter<Plastic> plasticPrinter = new GenericPrinter<Plastic>();
		Plastic plastic = new Plastic();
		plasticPrinter.setMaterial(plastic);
		System.out.println(plasticPrinter);
		
		// 제네릭 타입을 한정하기 위해 상위 클래스를 상속받아 사용한다.(Water는 Meterial을 상속받지 않아 제네릭 타입으로 쓸 수 없다.)
		// GenericPrinter<Water> waterPrinter = new GenericPrinter<Water>();
		
		powderPrinter.printing();
		plasticPrinter.printing();
		
		GenericPrinter printer = new GenericPrinter();
		
	}

}