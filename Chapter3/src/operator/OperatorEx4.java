package operator;

public class OperatorEx4 {

	public static void main(String[] args) {
		
		int score = 100;
		
		System.out.println(++score);
		// score = score + 1;
		// score += 1;
		
		System.out.println(score++);
		System.out.println(score);
		
		System.out.println(--score);
		System.out.println(score--);
		System.out.println(score);
		
		
		/*
		 * ����, ���� ������
		 * ���� ������
		 * ������ ���� 1���ϰų� �� �� ���
		 * �����ڰ� ���� �տ� �ִ°� �ڿ� �ִ°��� ���� �� ����� �޶���
		 * 
		 * ������			���												���� ��
		 * ++			���� ���� 1�� ���մϴ�.								val = ++num;	// ���� num ���� 1 ������ �� val ������ ����
		 * 																val = num++;	// val ������ ���� num ���� ���� ������ �� num �� 1 ����
		 * --			���� ������ 1�� ���ϴ�.								val = --num;	// ���� num ���� 1 ������ �� val ������ ����
		 */
	}

}
