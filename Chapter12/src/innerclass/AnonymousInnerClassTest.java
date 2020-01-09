package innerclass;

class Outer2{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {	// Runnable Ÿ���� �޼���
		
		int num = 100;	// num�� getRunnable �޼��尡 �����ؼ� ������������ ��ȿ�� ��������
		
		return new Runnable() {			// �͸� ���� Ŭ����

			@Override
			public void run() {
				
				// �޼��� �ȿ��� ���������� ����� ��� ���� ������ �� ����.(��ȿ���� ª��)
				// num += 10;
				// i = 200;
				System.out.println(num);		// ���� �����ϴ°��� ���������� ������ �� �� ����.
				System.out.println(i);
				System.out.println(outNum);
				System.out.println(Outer.sNum);
				
			}
			
		};		// ������ ���� �˸��� ;�� �����ش�
		
	}
	
	Runnable runner = new Runnable() {
		
		@Override
		public void run() {
			
			System.out.println("test");
			
		}
	};
	
}


public class AnonymousInnerClassTest {

	public static void main(String[] args) {
		
		Outer2 outer = new Outer2();
		outer.runner.run();// �͸� ���� Ŭ����
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();
		
	}

}
