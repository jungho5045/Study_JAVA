package cooperation;

public class Student {
	
	String studentName;  
	int grade;
	int money;
	
	public Student(String studuntName, int money) {
		this.studentName = studuntName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {	// 객체가 매개변수가 되는 형식, 어떤 버스를 타는지 매개변수로 받아야한다.
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	
	public void showInfo() {
		System.out.println(studentName + "님의 남은 돈은 " + money + "원 입니다.");
	}
	
}
