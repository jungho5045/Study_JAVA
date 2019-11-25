package ifexample;

import java.util.Scanner;

public class SwitchCaseEx1 {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int rank = scanner.nextInt();
		char medalColor;
		
		switch(rank) {
			case 1: medalColor = 'G';
				System.out.println("금메달");
				break;
			case 2: medalColor = 'S';
				System.out.println("은메달");
				break;
			case 3: medalColor = 'B';
				System.out.println("동메달");
				break;
			default : medalColor = 'A';
		}
		
		System.out.println(rank + "들은 8"
				+ "" + medalColor + "메달 입니다.");
		
		
		/*
		 * switch=case 문
		 * 조건이 정수, 문자열 값으로 그 값에 따라 수행 결과가 달라지는 경우
		 * if-else if-else 와 같은 의미로 수행
		 * 1)if-else 문
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
		 * 2)switch-case 문
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
		 * default를 지정 안할 시 초깃값을 지정해야 한다.
		 * -------------------------------------------------
		 * 조건에 문자열 사용하기
		 * 자바 7 부터 문자열 사용 가능
		 * switch(medal){
		 * 	case "Gold":
		 * 		System.out.println("금메달");
		 * 		break;
		 * case "Silver":
		 * 		System.out.println("은메달");
		 * 		break;
		 * case "Bronze":
		 * 		System.out.println("동메달");
		 * 		break;
		 * default:
		 * 		System.out.println("메달이 없습니다.");
		 * 		break;
		 * }
		 */
	}

}
