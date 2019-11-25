package reference;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student(100, "Lee");
		studentLee.setKorSubject("국어", 100);
		studentLee.setMatSubject("수학", 95);
		studentLee.setEngSubject("영어", 90);
		
		Student studentKim = new Student(101, "Kim");
		studentKim.setKorSubject("국어", 90);
		studentKim.setMatSubject("수학", 85);
		studentKim.setEngSubject("영어", 80);
		
		studentLee.showStudentScore();
		studentKim.showStudentScore();
		
	}

}
