package ifexample;

import java.util.Scanner;

public class ifexample2 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		int charge = 0;
		
		if(age < 8) {
			charge = 1000;
		} else if(age < 14) {
			charge = 1500;
		} else if(age < 20) {
			charge = 2000;
		} else {
			charge = 3000;
		}
		
		System.out.println("���� : " + age);
		System.out.println("��� : " + charge);
		
		/*
		 * if-else if-else��
		 * �ϳ��� ���ǿ� ���� ���� ��쿡 ���� ���๮�� ���� �ٸ� ���
		 * if(���ǽ�){
		 * 		���๮1;
		 * }else if(���ǽ�){
		 * 		���๮2;
		 * }else if(���ǽ�){
		 * 		���๮3;
		 * }else{
		 * 		���๮4;
		 * }
		 * 
		 * -------------------------------------------
		 * 
		 * if, if�� if, if else�� ���̴� ��Ÿ���� ����� �ѹ� �� ���ǹ��� �����ϴ����� ���̰� �ִ�.(if, if�� ��� ���ǹ��� �����Ѵ�.)
		 */
	}

}
