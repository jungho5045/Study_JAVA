package variable;

public class IntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte bs1 = -128;
		byte bs2 = 127;
		
		System.out.println(bs1);
		
		// int ival = 12345678900;	// out of range
		long lval = 12345678900L;
		
		System.out.println(lval);	// long �ڷ����� ����� ���� ������ ��� �� �ڿ� "L" �ĺ��ڸ� ����Ѵ�.
		
		/*
		 *  �ڷ���
		 * �⺻�� : �ڹ� ���� �⺻������ ������ �ִ� �ڷ���
		 * �޸��� ũ�Ⱑ ������ ����
		 * ������, ������, �Ǽ���, ����
		 * ������ : byte(1byte), short(2byte), int(4byte), long(8byte)
		 * ������ : char(2byte)	
		 * �Ǽ��� : float(4byte), double(8byte)
		 * ���� : boolean(1byte)
		 * 
		 * int �ڷ���
		 * - 4����Ʈ ���
		 * ���� ���� ���� ����
		 * -2^31 ~ 2^31 - 1 ���� ǥ��
		 * 
		 * ����Ʈ ũ��� ǥ�� ����
		 * byte : 1ũ��, -2^7 ~ 2^7 - 1
		 * short : 2ũ��, -2^15 ~ 2^15 - 1
		 * int : 4ũ��, -2^31 ~ 2^31 - 1
		 * long : 8ũ��, -2^63 ~ 2^63 - 1
		 * 
		 * 
		 * ������ : Ŭ���� �ڷ���
		 * JDK���� �����Ǵ� Ŭ������ ���α׷��Ӱ� �����ϴ� Ŭ����
		 * Ŭ������ ���� ����ϴ� ũ�Ⱑ �ٸ�
		 * ex) String, Student...
		 * 
		 */
	}

}
