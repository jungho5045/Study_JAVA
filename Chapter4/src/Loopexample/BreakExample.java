package Loopexample;

public class BreakExample {

	public static void main(String[] args) {
		
		int sum = 0;
		int num;
		for(num = 1; ; num++) {
			sum += num;
			if(sum >= 100)
				break;
		}
		
		System.out.println(sum);
		System.out.println(num);
		
	}

}

/*
 * break문
 * 감싸고 있는 블록의 제어를 빠져나오는 기능
 * 반복문, 조건문, switch-case 등과 같이 쓰이며 현재 수행하고 있던 블록에서 수행을 중지하고 외부로 제어가 이동함
 * 반복문과 같이 사용하면 특정 조건일 때 반복을 중지 하는 기능을 구현할 수 있음
 * 
 * continue문
 * 반복의 수행 중 조건문과 조건이 맞는 경우 이후 블록 내부의 다른 수행문을 수행하지 않음
 */