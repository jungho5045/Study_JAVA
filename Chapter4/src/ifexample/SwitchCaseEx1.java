package ifexample;

import java.util.Scanner;

public class SwitchCaseEx1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int rank = scanner.nextInt();
		char medalColor;
		
		switch(rank) {
			case 1: medalColor = 'G';
				System.out.println("�ݸ޴�");
				break;
			case 2: medalColor = 'S';
				System.out.println("���޴�");
				break;
			case 3: medalColor = 'B';
				System.out.println("���޴�");
				break;
			default : medalColor = 'A';
		}
		
		System.out.println(rank + "���� 8"
				+ "" + medalColor + "�޴� �Դϴ�.");
		
		
		/*
		 * switch=case ��
		 * ������ ����, ���ڿ� ������ �� ���� ���� ���� ����� �޶����� ���
		 * if-else if-else �� ���� �ǹ̷� ����
		 * 1)if-else ��
		 * if(rank == 1){
		 * 	madalColor = 'G';
		 * } else if(rank == 2) {
		 * 	madalColor = 'S';
		 * } else if(rank == 3) {
		 * 	madalColor = 'B';
		 * } else {
		 * 	madalColor = 'A';
		 * }
		 * 
		 * 2)switch-case ��
		 * switch(rank){
		 * 	case 1: medalColor = 'G';
		 * 		break;
		 * 	case 2: medalColor = 'S';
		 * 		break;
		 * 	case 3: medalColor = 'B';
		 * 		break;
		 * 	default : medalColor = 'A';
		 * }
		 * -------------------------------------------------
		 * default�� ���� ���� �� �ʱ갪�� �����ؾ� �Ѵ�.
		 * -------------------------------------------------
		 * ���ǿ� ���ڿ� ����ϱ�
		 * �ڹ� 7 ���� ���ڿ� ��� ����
		 * switch(medal){
		 * 	case "Gold":
		 * 		System.out.println("�ݸ޴�");
		 * 		break;
		 * case "Silver":
		 * 		System.out.println("���޴�");
		 * 		break;
		 * case "Bronze":
		 * 		System.out.println("���޴�");
		 * 		break;
		 * default:
		 * 		System.out.println("�޴��� �����ϴ�.");
		 * 		break;
		 * }
		 */
	}

}
