package variable;

public class IntegerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		byte bs1 = -128;
		byte bs2 = 127;
		
		System.out.println(bs1);
		
		// int ival = 12345678900;	// out of range
		long lval = 12345678900L;
		
		System.out.println(lval);	// long 자료형을 사용할 때는 대입할 상수 맨 뒤에 "L" 식별자를 써야한다.
		
		/*
		 *  자료형
		 * 기본형 : 자바 언어에서 기본적으로 제공해 주는 자료형
		 * 메모리의 크기가 정해져 있음
		 * 정수형, 문자형, 실수형, 논리형
		 * 정수형 : byte(1byte), short(2byte), int(4byte), long(8byte)
		 * 문자형 : char(2byte)	
		 * 실수형 : float(4byte), double(8byte)
		 * 논리형 : boolean(1byte)
		 * 
		 * int 자료형
		 * - 4바이트 사용
		 * 가장 많이 쓰는 정수
		 * -2^31 ~ 2^31 - 1 까지 표현
		 * 
		 * 바이트 크기와 표현 범위
		 * byte : 1크기, -2^7 ~ 2^7 - 1
		 * short : 2크기, -2^15 ~ 2^15 - 1
		 * int : 4크기, -2^31 ~ 2^31 - 1
		 * long : 8크기, -2^63 ~ 2^63 - 1
		 * 
		 * 
		 * 참조형 : 클래스 자료형
		 * JDK에서 제공되는 클래스와 프로그래머가 정의하는 클래스
		 * 클래스에 따라 사용하는 크기가 다름
		 * ex) String, Student...
		 * 
		 */
	}

}
