package variable;

public class ExpicitConversionTest {

	public static void main(String[] args) {
		
		int i = 1000;
		byte bNum = (byte)i;	// 데이터의 유실이 발생 할 수 있다.
		
		System.out.println(bNum);
		
		double dNum1 = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum1 + (int)fNum;
		int iNum2 = (int)(dNum1 + fNum);
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		/*
		 * 2진수, 8진수, 16진수
		 * 
		 * 10을 각 진법으로 쓰면...
		 * 
		 * 2진수 0B1010;
		 * 8진수 012;
		 * 16진수 0XA;
		 */
		
	}

}
