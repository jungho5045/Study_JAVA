package cooperation;

public class Student {
	
	String studentName;  
	int grade;
	int money;
	
	public Student(String studuntName, int money) {
		this.studentName = studuntName;
		this.money = money;
	}
	
	public void takeBus(Bus bus) {	// ��ü�� �Ű������� �Ǵ� ����, � ������ Ÿ���� �Ű������� �޾ƾ��Ѵ�.
		bus.take(1000);
		this.money -= 1000;
	}
	
	public void takeSubway(Subway subway) {
		subway.take(1200);
		this.money -= 1200;
	}
	
	public void showInfo() {
		System.out.println(studentName + "���� ���� ���� " + money + "�� �Դϴ�.");
	}
	
}
