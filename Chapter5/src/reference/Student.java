package reference;

public class Student {
	
	int studentID;
	String studentName;
	
	Subject kor;
	Subject mat;
	Subject eng;
	
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		kor = new Subject();
		mat = new Subject();
		eng = new Subject();
	}
	
	public void setKorSubject(String name, int score) {
		kor.subjectName = name;
		kor.score = score;
	}
	
	public void setMatSubject(String name, int score) {
		mat.subjectName = name;
		mat.score = score;
	}
	
	public void setEngSubject(String name, int score) {
		eng.subjectName = name;
		eng.score = score;
	}
	
	public void showStudentScore() {
		int total = kor.score + mat.score + eng.score;
		System.out.println(studentName + " 학생의 총점은 " + total + "점 입니다.");
	}
}
