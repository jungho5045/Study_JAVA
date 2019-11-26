package array;

public class BookArrayTest {

	public static void main(String[] args) {
		
		Book[] library = new Book[5];	// 객체 5개가 생성된 것이 아니라 배열이 생성 된 것일 뿐, 객체는 각자 따로 생성을 해줘야 한다.
		
		// 객체 생성이 아닌 배열 생성을 확인하기 위한 for 문
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
		}
		
		// 객체 생성 후 배열 값 확인을 위한 for 문
		library[0] = new Book("태백산맥1", "조정래");
		library[1] = new Book("태백산맥2", "조정래");
		library[2] = new Book("태백산맥3", "조정래");
		library[3] = new Book("태백산맥4", "조정래");
		library[4] = new Book("태백산맥5", "조정래");
		
		for(int i=0; i<library.length; i++) {
			System.out.println(library[i]);
			library[i].showBookInfo();
		}
		
	}

}
