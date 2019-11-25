package variable;

public class CharTest {

	public static void main(String[] args) {

		char ch = 'A';
		
		System.out.println(ch);
		System.out.println((int)ch);
		
		int iCh = 66;
		
		System.out.println(iCh);
		System.out.println((char)iCh);
		
		// char ch2 = -66;	// 문자는 내부적으로 양수 값만 저장할 수 있다.
		
		char hangul = '\uAC00';	// 유니코드 넣는 방법
		System.out.println(hangul);
		
		char ch2 = '한';
		System.out.println(ch2);
		/*
		 * 문자 자료형
		 * 내부적으로는 비트의 조합으로 표현
		 * 인코딩 - 각 문자에 따른 특정한 숫자 값(코드 값)을 부여
		 * 디코딩 - 숫자 값을 원래의 문자로 변환
		 * 
		 * 문자세트 : 문자를 위한 코드 값 (숫자 값) 들을 정해 놓은 세트
		 * 아스키(ASCII) : 1바이트로 영문자, 숫자, 특수문자 등을 표현 함
		 * 유니코드(Unicode) : 한글과 같은 복잡한 언어를 표현하기 위한 표준 인코등 UTF-8, UTF-16 이 대표적
		 * 					(https://www.unicode.org/charts/PDF/UAC00.pdf참고)
		 * 문자를 변수에 저장하면? 문자에 해당하는 코드 값이 저장됨
		 */

	}

}
