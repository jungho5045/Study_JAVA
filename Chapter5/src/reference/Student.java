package reference;

public class Student {
	
	// 맴버변수(속성)
		// 기본 자료형, 바로 접근 가능 
	int studentID;
		// 참조 자료형, 하지만 String은 문자열 특성상 바로 접근 가능
	String studentName;
		// 참조 자료형, 생성 후 사용(*)
	Subject kor;
	Subject mat;
	Subject eng;
	
	// 생성자
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		// 참조자료형 형식의 변수 생성(*)
		kor = new Subject();
		mat = new Subject();
		eng = new Subject();
	}
	
	// 멤버함수(메서드)
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
