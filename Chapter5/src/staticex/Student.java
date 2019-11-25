package staticex;

public class Student {
	
	// 멤버 변수(속성)
	private static int serialNumber = 1000;
	public int studentID;
	public String studentName;
	public String address;
	
	// 생성자
	public Student() {
		serialNumber++;
	}	//Default 생성자, 하나 이상의 생성자가 있을 경우 Default 생성자는 생성이 되지 않는다.
	
	public Student(String name) {	// 매개변수가 'name' 하나인 생성자
		studentName = name;
		serialNumber++;
		studentID = serialNumber;
	}
	
	public Student(int id, String name) {	// 매개변수가 'id', 'name' 두개인 생성자
		studentID = id;
		studentName = name;
		address = "주소 없음";
		serialNumber++;
	}
	
	public Student(int id, String name, String address) {
		studentID = id;
		studentName = name;
		address = address;
		serialNumber++;
	}
	
	// 멤버 함수(메소드)
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