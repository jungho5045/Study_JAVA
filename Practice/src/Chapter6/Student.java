package Chapter6;

import java.util.ArrayList;

public class Student {
	
	// 맴버변수
	String studentName;
		// Book 데이터 형식의 bookList 이름을 가진 ArrayList 선언
	ArrayList<Book> bookList;
	
	// 생성자
	public Student(String studentName) {
		this.studentName = studentName;
		bookList = new ArrayList<Book>();
	}
	
	public void addBook(String name) {
		Book book= new Book(name);
		bookList.add(book);
	}
	
	public void showStudentInfo() {
		
		System.out.print(studentName + " 학생이 읽은 책은 : ");
		for(Book book : bookList) {
			System.out.print(book.getName() + " ");
		}
		System.out.println("입니다.");
	}
	
}
