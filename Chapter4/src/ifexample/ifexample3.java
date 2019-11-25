package ifexample;

import java.util.Scanner;

public class ifexample3 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		char grade = 0;
		
		if(score >= 90) {
			grade = 'A';
		} else if(score >= 80 && score < 90) {
			grade = 'B';
		} else if(score >= 70 && score < 80) {
			grade = 'C';
		} else if(score >= 60 && score < 70) {
			grade = 'D';
		} else {
			grade = 'F';
		}
		
		System.out.println("점수 : " + score);
		System.out.println("학점 : " + grade);
		
		/*
		 * if-else if-else 문 문제
		 * 성적에 따라 학점 부여하기
		 * 100-90 점 : A
		 * 89-80 점 : B
		 * 79-70 점 : C
		 * 69-60 점 : D
		 * 59 점 이하 : F
		 * 
		 * 점수를 입력 받아 학점을 출력 하세요
		 */
	}

}
