package Chapter5;

import Chapter5.Taxi;

public class Student {
	
	// 멤버변수
	String studentName;
	int money;
	
	// 생성자
	public Student(String name, int money) {
		this.studentName = name;
		this.money = money;
	}
	
	// 멤버함수
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	
	public void takeTaxi(Taxi taxi) {
		taxi.take(1000);
		this.money -= 1000;
	}
	
	public void showStudentInfo() {
		System.out.println("학생 이름 : " + studentName);
		System.out.println(studentName + "이 가진 돈은 " + money + "원 입니다.");
	}
	
}
