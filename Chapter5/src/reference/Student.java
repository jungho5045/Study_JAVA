package reference;

public class Student {
	
	// �ɹ�����(�Ӽ�)
		// �⺻ �ڷ���, �ٷ� ���� ���� 
	int studentID;
		// ���� �ڷ���, ������ String�� ���ڿ� Ư���� �ٷ� ���� ����
	String studentName;
		// ���� �ڷ���, ���� �� ���(*)
	Subject kor;
	Subject mat;
	Subject eng;
	
	// ������
	public Student(int id, String name) {
		studentID = id;
		studentName = name;
		
		// �����ڷ��� ������ ���� ����(*)
		kor = new Subject();
		mat = new Subject();
		eng = new Subject();
	}
	
	// ����Լ�(�޼���)
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
		System.out.println(studentName + " �л��� ������ " + total + "�� �Դϴ�.");
	}
}
