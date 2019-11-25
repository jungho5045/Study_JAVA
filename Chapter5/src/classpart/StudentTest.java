package classpart;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student("이정호");	// 객체 생성, ()관호 안에는 생성자의 매개변수가 들어간다.
		//studentLee.studentName = "이정호";	// 생성한 객체의 멤버 변수 지정
		//studentLee.address = "성남";			// 생성한 객체의 멤버 변수 지정
		
		studentLee.showStudentInfo();		// 생성한 객체의 멤버 함수(메소드) 실행
		
		
		Student studentKim = new Student(123, "이정호");
		studentKim.studentName = "김유신";
		studentKim.address = "경주";
		
		studentKim.showStudentInfo();
		
		System.out.println(studentLee);
		System.out.println(studentKim);
		
		// 자바 파일 하나에 여러 개의 클래스가 존재 할 수 도 있음k
		// 단, public 클래스는 하나이고, public 클래스와 자바 파일 이름은 동일해야 함
		
	}

}
