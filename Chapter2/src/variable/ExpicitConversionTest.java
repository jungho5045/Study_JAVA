package variable;

public class ExpicitConversionTest {

	public static void main(String[] args) {
		
		int i = 1000;
		byte bNum = (byte)i;	// �������� ������ �߻� �� �� �ִ�.
		
		System.out.println(bNum);
		
		double dNum1 = 1.2;
		float fNum = 0.9F;
		
		int iNum1 = (int)dNum1 + (int)fNum;
		int iNum2 = (int)(dNum1 + fNum);
		
		System.out.println(iNum1);
		System.out.println(iNum2);
		
		/*
		 * 2����, 8����, 16����
		 * 
		 * 10�� �� �������� ����...
		 * 
		 * 2���� 0B1010;
		 * 8���� 012;
		 * 16���� 0XA;
		 */
		
	}

}
