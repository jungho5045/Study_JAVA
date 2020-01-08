package innerclass;

class OutClass{
	
	private int num = 10;				// private ���������� : Ŭ���� ���ο����� ���ٰ���
	private static int sNum = 20;		// static ���� : ���� Ÿ���� ������, �ν��Ͻ� �������� �޸𸮿� �Ҵ�ȴ�.(����)
	private InClass inClass;			// InClass Ÿ���� inClass ��ü ����
	
	public OutClass(){					// �����ڿ� InnerClass ������ �����Ѵ�.
		inClass = new InClass();		// InClass Ÿ������ ������ inClass ��ü�� InClass() �����ڸ� �̿��Ͽ� �����Ѵ�.
	}
	
	class InClass{						// OutClass ���� �� ���
		int iNum = 100;					// ��� ����
		
		void inTest() {					// �޼���
			System.out.println(num);
			System.out.println(sNum);
		}
	}
	
	public void usingInner() {
		inClass.inTest();
	}
	
	static class InStaticClass{			// OutClass ���� ���ο� ������� ��� ����
		int inNum = 100;
		static int sInNum = 200;
		
		void inTest() {
			System.out.println(inNum);
			System.out.println(sInNum);
			System.out.println(sNum);
		}
		
		static void sTest() {
			// System.out.println(inNum);		// inNum ������ InStaticClass ���� �� ��������� ������ sTest() static Ŭ�������� �� �� ����.
			System.out.println(sInNum);
			System.out.println(sNum);
		}
		
	}
	
}

public class InnerTest {

	public static void main(String[] args) {
		
		OutClass outClass = new OutClass();
		outClass.usingInner();
		
		OutClass.InClass myInClass = outClass.new InClass();	// �ܺο��� InnerClass ���ٹ��
		myInClass.inTest();
		
		System.out.println();
		
		// OutClass.InStaticClass sInClass = new OutClass.InStaticClass();	// OutClass �������, InClass�� ���� static Ŭ������ �ٷ� ������ �� �ִ�.
		
		OutClass.InStaticClass.sTest();	// �ܺο��� static class �ٷ� �����ϴ� ���
		
	}

}
