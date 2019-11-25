package classpart;

public class Student {
	
	// ��� ����(�Ӽ�)
	public int studentID;
	public String studentName;
	public String address;
	
	// ������
	public Student() {}	//Default ������, �ϳ� �̻��� �����ڰ� ���� ��� Default �����ڴ� ������ ���� �ʴ´�.
	
	public Student(String name) {	// �Ű������� 'name' �ϳ��� ������
		studentName = name;
	}
	
	public Student(int id, String name) {	// �Ű������� 'id', 'name' �ΰ��� ������
		studentID = id;
		studentName = name;
		address = "�ּ� ����";
	}
	
	public Student(int id, String name, String address) {
		studentID = id;
		studentName = name;
		address = address;
	}
	
	// ��� �Լ�(�޼ҵ�)
	public void showStudentInfo() {
		System.out.println(studentID + ", " + studentName + ", " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
}

// class ��� JAVA ���� �����ؾ� �Ѵ�.(�� public Ű���带 ������ �Ѵ�.)
// ��ü�� ��������� �� ���� �������� �ʾҰ�, ���������� �ʾҴ�.
// �̸��� ���� �������� �޼ҵ尡 ���� ��� '�����ε�'�̶� �Ѵ�.