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
		
		System.out.println("���� : " + score);
		System.out.println("���� : " + grade);
		
		/*
		 * if-else if-else �� ����
		 * ������ ���� ���� �ο��ϱ�
		 * 100-90 �� : A
		 * 89-80 �� : B
		 * 79-70 �� : C
		 * 69-60 �� : D
		 * 59 �� ���� : F
		 * 
		 * ������ �Է� �޾� ������ ��� �ϼ���
		 */
	}

}
