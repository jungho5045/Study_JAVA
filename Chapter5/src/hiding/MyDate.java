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

// 값을 쓸 경우 set, 값을 가졍올 때 get