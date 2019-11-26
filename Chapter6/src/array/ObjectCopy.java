package array;

public class ObjectCopy {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];
		Book[] copyLibrary = new Book[5];
		
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		System.arraycopy(library, 0, copyLibrary, 0, 5);
		
		/*for(Book book : copyLibrary) {			// 향상된 for 문, for(데이터 타입, 변수명 : 목적 데이터 변수명) : 데이터타입의 변수에 목적데이터를 차례로 넣겠다는 의미
			book.showBookInfo();
		}*/
		
		// 객체 배역 복사 - 얕은 복사(같은 주소값을 가르킨다.)
		library[0].setTitle("나목");
		library[0].setAuthor("박완서");
		
		for(Book book : library) {
			book.showBookInfo();
		}
		System.out.println("=================");
		for(Book book : copyLibrary) {
			book.showBookInfo();
		}
		
	}

}
