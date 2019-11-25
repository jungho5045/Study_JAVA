package classpart;

public class Student {
	
	// 멤버 변수(속성)
	public int studentID;
	public String studentName;
	public String address;
	
	// 생성자
	public Student() {}	//Default 생성자, 하나 이상의 생성자가 있을 경우 Default 생성자는 생성이 되지 않는다.
	
	public Student(String name) {	// 매개변수가 'name' 하나인 생성자
		studentName = name;
	}
	
	public Student(int id, String name) {	// 매개변수가 'id', 'name' 두개인 생성자
		studentID = id;
		studentName = name;
		address = "주소 없음";
	}
	
	public Student(int id, String name, String address) {
		studentID = id;
		studentName = name;
		address = address;
	}
	
	// 멤버 함수(메소드)
	public void showStudentInfo() {
		System.out.println(studentID + ", " + studentName + ", " + address);
	}
	
	public String getStudentName() {
		return studentName;
	}
}

// class 명과 JAVA 명이 동일해야 한다.(꼭 public 키워드를 가져야 한다.)
// 객체의 구성요소일 뿐 값을 대입하지 않았고, 생성하지도 않았다.
// 이름이 같은 여러개의 메소드가 있을 경우 '오버로딩'이라 한다.