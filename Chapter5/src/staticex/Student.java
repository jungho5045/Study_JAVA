package staticex;

public class Student {
	
	// ��� ����(�Ӽ�)
	private static int serialNumber = 1000;
	public int studentID;
	public String studentName;
	public String address;
	
	// ������
	public Student() {
		serialNumber++;
	}	//Default ������, �ϳ� �̻��� �����ڰ� ���� ��� Default �����ڴ� ������ ���� �ʴ´�.
	
	public Student(String name) {	// �Ű������� 'name' �ϳ��� ������
		studentName = name;
		serialNumber++;
		studentID = serialNumber;
	}
	
	public Student(int id, String name) {	// �Ű������� 'id', 'name' �ΰ��� ������
		studentID = id;
		studentName = name;
		address = "�ּ� ����";
		serialNumber++;
	}
	
	public Student(int id, String name, String address) {
		studentID = id;
		studentName = name;
		address = address;
		serialNumber++;
	}
	
	// ��� �Լ�(�޼ҵ�)
	public void showStudentInfo() {
		System.out.println(studentID + ", " + studentName + ", " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
	
	public int getStudentID() {
		return studentID;
	}

	public static int getSerialNumber() {
		return serialNumber;
	}

	public static void setSerialNumber(int serialNumber) {
		Student.serialNumber = serialNumber;
	}
	
	
}