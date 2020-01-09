package lamda;

// Java8 부터 지원하며, 함수형 인터페이스를 지정하는 어노테이션입니다.
// 만약 메서드가 존재하지 않거나, 1개 이상의 메서드(default 메서드 제외)가 존재할 경우 컴파일 오류를 발생 시킵니다.
@FunctionalInterface
public interface MyMaxNumber {
	
	int getMaxNumber(int x, int y);
	// void add(int x, int y);		// @FunctionalInterface이므로 메서드 1개 이상 선언 시 에러발생
	
}
