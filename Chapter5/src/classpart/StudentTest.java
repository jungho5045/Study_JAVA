package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student("����ȣ");	// ��ü ����, ()��ȣ �ȿ��� �������� �Ű������� ����.
		//studentLee.studentName = "����ȣ";	// ������ ��ü�� ��� ���� ����
		//studentLee.address = "����";			// ������ ��ü�� ��� ���� ����
		
		studentLee.showStudentInfo();		// ������ ��ü�� ��� �Լ�(�޼ҵ�) ����
		
		
		Student studentKim = new Student(123, "����ȣ");
		studentKim.studentName = "������";
		studentKim.address = "����";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
		
		// �ڹ� ���� �ϳ��� ���� ���� Ŭ������ ���� �� �� �� ����k
		// ��, public Ŭ������ �ϳ��̰�, public Ŭ������ �ڹ� ���� �̸��� �����ؾ� ��
		
	}

}
