package Loopexample;

import java.util.Scanner;

public class DoWhileExample {

	public static void main(String[] args) {
		
//		int num = 1;
//		int sum = 0;
//		
//		do{
//			sum+= num;
//			num++;	//11
//		}while( num <= 10);
//		
//		System.out.println(sum);
//		System.out.println(num);

		Scanner scanner = new Scanner(System.in);
		int input;
		int sum = 0;
		do {
			input = scanner.nextInt();
			sum += input;
		}while(input != 0);
		
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
 * do-while��
 * ���� ���๮�� �����ϰ� ���� üũ
 * �ѹ� �̻� ���๮�� ����Ǿ�� �ϴ� ��� ���
 * do{
 * 	���๮1;
 * 	...
 * } while(���ǽ�);
 * 	���๮2;
 * 	...
 * 
 * while���� do-while�� ��
 * �Է� �޴� ������ ��� ���� �ݴϴ�.
 * �Էµ� ������ 0�̸� �ݺ����� ���� ���ɴϴ�.
 */
