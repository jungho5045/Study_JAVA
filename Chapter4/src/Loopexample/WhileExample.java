package Loopexample;

import java.util.Scanner;

public class WhileExample {

	public static void main(String[] args) {
		
//		int num = 1;
//		int sum = 0;
//		
//		while( num <= 10) {
//			sum+= num;
//			num++;	//11
//		}
//		
//		System.out.println(sum);
//		System.out.println(num);
		
		int input;
		int sum = 0;
		Scanner scanner = new Scanner(System.in);
		input = scanner.nextInt();
		
		while(input != 0) {
			sum += input;
			input = scanner.nextInt();
		}
		
		System.out.println(sum);
		
	}

}

/*
 * �ݺ���
 * ������ ���๮�� ���ǿ� �´� ���� �����ϵ��� �ϴ� ���
 * ����)
 * 1. �޸��� �ڵ���
 * 2. ���� Ƚ����ŭ ���ư��� ����
 * 3. Ư�� �µ����� �����Ǵ� ������
 * 
 * while��
 * ������ ���� ���� ���๮�� �ݺ��ؼ� �����
 * while(���ǽ�){
 * 	���๮1;
 * 	...
 * }
 * 	���๮2;
 * 	...
 */
