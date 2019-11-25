package variable;

public class ImplicitConversionTest {

	public static void main(String[] args) {
		
		// Ctrl + d : 한줄 삭제
		
		byte bNum = 10;
		int iNum = bNum;
		
		System.out.println(bNum);
		System.out.println(iNum);
		
		int iNum2 = 20;
		float fNum = iNum2;
		
		System.out.println(fNum);
		
		double dNum;
		dNum = fNum + iNum;
		
		System.out.println(dNum);
		
	}

}
