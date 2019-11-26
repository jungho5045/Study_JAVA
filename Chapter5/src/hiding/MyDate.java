package hiding;

import reference.Subject;

public class MyDate {
	
	// 멤버 변수, Default인 경우 같은 페키지 안에서만 사용 가능하다. (다른 패키지 에서 사용하려면 멤버 변수의 접근 제어자를 public으로 지정해야한다.)
	private int day;
	private int month;
	private int year;
	
	private boolean isValid;
	
	// 멤버 함수(메소드)
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
			System.out.println(year + "년 " + month + "월 " + day + "일 입니다.");
		else
			System.out.println("유효하지 않은 날짜 입니다.");
	}
}
/*
 * 접근 제어자 종료
 * public(내부, 외부 오픈), private(클래스 내부에서만 사용),
 * protected(상속관계에서 상위 클래스의 private한 변수를 하위 클래스에서 public하게 사용 가능),
 * 아무것도 지정하지 않은 Default 접근 제어자(같은 패키지 내에서만 참조 가능)
 * 
 * private 변수를 외부에서 접근하게 하려면 public 메서드를 제공하여 접근 할 수 있다.
 * 클래스 내부 데이터를 잘못 사용하는 오류를 방지할 수 있다.
 * 
 * 
 * 값을 쓸 경우 set, 값을 가졍올 때 get
 */