package reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "Lee");
		studentLee.setKorSubject("����", 100);
		studentLee.setMatSubject("����", 95);
		studentLee.setEngSubject("����", 90);
		
		Student studentKim = new Student(101, "Kim");
		studentKim.setKorSubject("����", 90);
		studentKim.setMatSubject("����", 85);
		studentKim.setEngSubject("����", 80);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
		
	}

}
