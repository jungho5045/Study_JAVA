package Chapter6;

public class StudentTest {

	public static void main(String[] args) {
		
		Student studentLee = new Student("Lee");
		studentLee.addBook("�¹���1");
		studentLee.addBook("�¹���2");
		
		Student studentKim = new Student("Kim");
		studentKim.addBook("����1");
		studentKim.addBook("����2");
		studentKim.addBook("����3");
		
		Student studentCho = new Student("Cho");
		studentCho.addBook("�ظ�����1");
		studentCho.addBook("�ظ�����2");
		studentCho.addBook("�ظ�����3");
		studentCho.addBook("�ظ�����4");
		studentCho.addBook("�ظ�����5");
		studentCho.addBook("�ظ�����6");
		
		studentLee.showStudentInfo();
		studentKim.showStudentInfo();
		studentCho.showStudentInfo();
		
		
	}

}

/*
 * ArrayList�� Ȱ���� ���� ���α׷�
 * 
 * ��� �б��� �л��� 3���� �ֽ��ϴ�. �� �л����� ���� å�� ����ϰ� �ֽ��ϴ�.
 * Student Ŭ������ ����� �� �л����� ���� å�� Student Ŭ���� ���� ArrayList��
 * �����Ͽ� �����ϵ��� �մϴ�.
 * ������ ���� ��� �ǵ��� Student, Book, StudentTest Ŭ������ ����� �����ϼ���
 * 
 * Lee �л��� ���� å�� : �¹���1 �¹���2 �Դϴ�.
 * Kim �л��� ���� å�� : ����1 ����2 ����3 �Դϴ�.
 * Cho �л��� ���� å�� : �ظ�����1 �ظ�����2 �ظ�����3 �ظ�����4 �ظ�����5 �ظ�����6 �Դϴ�
 */