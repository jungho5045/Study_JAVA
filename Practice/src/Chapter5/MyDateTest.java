package Chapter5;

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate date1 = new MyDate(30, 2, 2000);		// day, month, year ������ �Է�
		System.out.println(date1.isValid());
		MyDate date2 = new MyDate(2, 10, 2006);
		System.out.println(date2.isValid());
		
	}

}

/*
 * �����
 * date1 : ��ȿ���� ���� ��¥�Դϴ�.
 * date2 : ��ȿ�� ��¥�Դϴ�.
 * -------------------------
 */