package object;

class Book implements Cloneable{	// Cloneable�� ����ؾ� ��
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	// Object class�� toString �޼��带 ������(��ü ������ �Է��� title�� author�� ����ϴ� ���)�Ѵ�.
	@Override
	public String toString() {
		return author + ", " +title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {	// ���� ȣ���ϴ� �޼��尡 �ƴ� �ν��Ͻ��� �� �޸𸮿��� ������ �� ������ �ݷ��Ϳ� ���ؼ� ����Ǵ� �ڵ�
		// TODO Auto-generated method stub
		super.finalize();
	}
	
}

public class ToStringTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Book book = new Book("����", "�ڰ渮");
		
		System.out.println(book);
		
		String str = new String("����");
		System.out.println(str.toString());
		
		//---------------clone--------------
		Book book2 = (Book)book.clone();
		System.out.println(book2);
	}

}
