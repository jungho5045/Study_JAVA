package lamda;

public class TestMyNumber {

	public static void main(String[] args) {
		
		MyMaxNumber max = (x, y) -> (x >= y)?x : y;		// return ���� �ϳ��� �ڵ�� ������ �߰�ȣ�� return Ű���带 ���� �� �� �ִ�. - ������
		System.out.println(max.getMaxNumber(10, 20));
		
	}

}
