package Chapter5;

import Chapter5.Taxi;

public class Student {
	
	// �������
	String studentName;
	int money;
	
	// ������
	public Student(String name, int money) {
		this.studentName = name;
		this.money = money;
	}
	
	// ����Լ�
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
		System.out.println("�л� �̸� : " + studentName);
		System.out.println(studentName + "�� ���� ���� " + money + "�� �Դϴ�.");
	}
	
}
