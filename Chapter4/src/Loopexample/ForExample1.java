package Loopexample;

public class ForExample1 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int count = 1 ; count <=10 ; count++)	// �ַ� �ʱ�ȭ���� ī������ 0���� �Ѵ�.(�迭�� �ε����� 0���� ����)
			sum += count;
		
		System.out.println(sum);
		
		int num = 1;
		int total = 0;
		while(num <= 10) {
			total += num;
			num++;
		}
		
		System.out.println(total);
		
		/*
		 * for��
		 * �ݺ��� �� ���� ���� ����
		 * ���� Ƚ���� ����� �ݺ��� ������ �� ȿ������
		 * for(�ʱ�ȭ��; ���ǽ�; ������){
		 * 		���๮;
		 * }
		 * -------------------------------
		 * for��
		 * 1���� 10���� ���Ͽ� ����� ����� ����
		 * -------------------------------
		 * �ʱ�ȭ��, ���ǽ�, �������� ','�� �������� ������ ��� �����ϴ�.
		 */
	}

}
