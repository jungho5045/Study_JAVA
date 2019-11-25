package variable;

public class CharTest {

	public static void main(String[] args) {

		char ch = 'A';
		
		System.out.println(ch);
		System.out.println((int)ch);
		
		int iCh = 66;
		
		System.out.println(iCh);
		System.out.println((char)iCh);
		
		// char ch2 = -66;	// ���ڴ� ���������� ��� ���� ������ �� �ִ�.
		
		char hangul = '\uAC00';	// �����ڵ� �ִ� ���
		System.out.println(hangul);
		
		char ch2 = '��';
		System.out.println(ch2);
		/*
		 * ���� �ڷ���
		 * ���������δ� ��Ʈ�� �������� ǥ��
		 * ���ڵ� - �� ���ڿ� ���� Ư���� ���� ��(�ڵ� ��)�� �ο�
		 * ���ڵ� - ���� ���� ������ ���ڷ� ��ȯ
		 * 
		 * ���ڼ�Ʈ : ���ڸ� ���� �ڵ� �� (���� ��) ���� ���� ���� ��Ʈ
		 * �ƽ�Ű(ASCII) : 1����Ʈ�� ������, ����, Ư������ ���� ǥ�� ��
		 * �����ڵ�(Unicode) : �ѱ۰� ���� ������ �� ǥ���ϱ� ���� ǥ�� ���ڵ� UTF-8, UTF-16 �� ��ǥ��
		 * 					(https://www.unicode.org/charts/PDF/UAC00.pdf����)
		 * ���ڸ� ������ �����ϸ�? ���ڿ� �ش��ϴ� �ڵ� ���� �����
		 */

	}

}
