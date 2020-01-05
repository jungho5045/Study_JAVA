package object;

class Student{
	int studentNum;
	String studentName;
	
	public Student(int studentNum, String studentName) {
		this.studentNum = studentNum;
		this.studentName = studentName;
	}
	
	// equals ������
	@Override
	public boolean equals(Object obj) {

		if( obj instanceof Student) {
			Student std = (Student)obj;
			if(this.studentNum == std.studentNum)
				return true;
			else
				return false;
		}else {
			return false;
		}
		
	}

	@Override
	public int hashCode() {
		return studentNum;
	}
	
}

public class EqualsTest {

	public static void main(String[] args) {
		
//		String str1 = new String("abc");
//		String str2 = new String("abc");
//		
//		System.out.println(str1 == str2);		// ������ �������� ������
//		System.out.println(str1.equals(str2));	// ���� �������� ������
		
		Student Lee = new Student(100, "����ȣ");
		Student Lee2  = Lee;
		Student Jung = new Student(100, "����ȣ");
		
		System.out.println(Lee == Lee2);
		System.out.println(Lee == Jung);
		System.out.println(Lee.equals(Jung));
		
		System.out.println(Lee.hashCode());
		System.out.println(Jung.hashCode());
		
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i1.equals(i2));
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode());
		
		System.out.println(System.identityHashCode(i1));
		System.out.println(System.identityHashCode(i2));
		
	}

}
