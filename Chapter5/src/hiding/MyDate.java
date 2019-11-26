package hiding;

import reference.Subject;

public class MyDate {
	
	// ��� ����, Default�� ��� ���� ��Ű�� �ȿ����� ��� �����ϴ�. (�ٸ� ��Ű�� ���� ����Ϸ��� ��� ������ ���� �����ڸ� public���� �����ؾ��Ѵ�.)
	private int day;
	private int month;
	private int year;
	
	private boolean isValid;
	
	// ��� �Լ�(�޼ҵ�)
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		if(month < 1 || month > 12)
			isValid = false;
		else
			this.month = month;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void showDate() {
		if(isValid)
			System.out.println(year + "�� " + month + "�� " + day + "�� �Դϴ�.");
		else
			System.out.println("��ȿ���� ���� ��¥ �Դϴ�.");
	}
}
/*
 * ���� ������ ����
 * public(����, �ܺ� ����), private(Ŭ���� ���ο����� ���),
 * protected(��Ӱ��迡�� ���� Ŭ������ private�� ������ ���� Ŭ�������� public�ϰ� ��� ����),
 * �ƹ��͵� �������� ���� Default ���� ������(���� ��Ű�� �������� ���� ����)
 * 
 * private ������ �ܺο��� �����ϰ� �Ϸ��� public �޼��带 �����Ͽ� ���� �� �� �ִ�.
 * Ŭ���� ���� �����͸� �߸� ����ϴ� ������ ������ �� �ִ�.
 * 
 * 
 * ���� �� ��� set, ���� ������ �� get
 */