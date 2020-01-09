package innerclass;

class Outer{
	
	int outNum = 100;
	static int sNum = 200;
	
	Runnable getRunnable(int i) {	// Runnable Ÿ���� �޼���
		
		int num = 100;	// num�� getRunnable �޼��尡 �����ؼ� ������������ ��ȿ�� ��������
		
		class MyRunnable implements Runnable {			// ���� ���� Ŭ����

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
			
		}
		
		return new MyRunnable();
		
	}
	
}


public class LocalInnerClassTest {

	public static void main(String[] args) {
		
		Outer outer = new Outer();
		Runnable runnable = outer.getRunnable(50);
		
		runnable.run();
		
	}

}
