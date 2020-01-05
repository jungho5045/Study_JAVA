package object;

class Book implements Cloneable{	// Cloneable을 명시해야 함
	String title;
	String author;
	
	public Book(String title, String author) {
		this.title = title;
		this.author = author;
	}
	
	// Object class의 toString 메서드를 재정의(객체 생성시 입력한 title과 author을 출력하는 기능)한다.
	@Override
	public String toString() {
		return author + ", " +title;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	protected void finalize() throws Throwable {	// 직접 호출하는 메서드가 아닌 인스턴스가 힙 메모리에서 해제될 때 가비지 콜랙터에 의해서 수행되는 코드
		// TODO Auto-generated method stub
		super.finalize();
	}
	
}

public class ToStringTest {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		Book book = new Book("토지", "박경리");
		
		System.out.println(book);
		
		String str = new String("토지");
		System.out.println(str.toString());
		
		//---------------clone--------------
		Book book2 = (Book)book.clone();
		System.out.println(book2);
	}

}
