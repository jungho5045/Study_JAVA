package Chapter6;

import java.util.ArrayList;

public class Student {
	
	// �ɹ�����
	String studentName;
		// Book ������ ������ bookList �̸��� ���� ArrayList ����
	ArrayList<Book> bookList;
	
	// ������
	public Student(String studentName) {
		this.studentName = studentName;
		bookList = new ArrayList<Book>();
	}
	
	public void addBook(String name) {
		Book book= new Book(name);
		bookList.add(book);
	}
	
	public void showStudentInfo() {
		
		System.out.print(studentName + " �л��� ���� å�� : ");
		for(Book book : bookList) {
			System.out.print(book.getName() + " ");
		}
		System.out.println("�Դϴ�.");
	}
	
}
