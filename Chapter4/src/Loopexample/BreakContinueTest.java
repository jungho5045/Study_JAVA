package Loopexample;

public class BreakContinueTest {

	public static void main(String[] args) {
		
		for(int i=2; i<10; i++) {
			if((i%2) == 1)
				continue;
			for(int j=1; j<10; j++) {
				if(i < j)
					break;
				System.out.println(i + " X " + j + " = " + i*j);
					
			}
			System.out.println("");
		}
	}
}

/*
 * break, continue ����
 * �������� ����� �� ¦�� �ܸ� ����ϸ鼭 �ܺ��� ���ϴ� ���� �۰ų� ���� �������� ����ϼ���
 */
