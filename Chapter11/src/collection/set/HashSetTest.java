package collection.set;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetTest {

	public static void main(String[] args) {
		
		HashSet<String> set = new HashSet<String>();
		set.add("�̼���");
		set.add("������");
		set.add("������");
		set.add("�̼���");
		
		// toString()�� �̿��Ͽ� �ѹ��� ���
		System.out.println(set);	// ������ ������� ����, �ߺ��� ������� ����(���� Ű��(�й�, �ֹε�Ϲ�ȣ ��)�� ������ �� ���)
		
		// Iterator�� �̿��Ͽ� ��ȸ �ϳ��� ���
		Iterator<String> ir = set.iterator();
		
		while(ir.hasNext()) {	// hasNext() ���� ��Ұ� �ִ��� Ȯ��, ���ϰ��� boolean
			String str = ir.next();
			System.out.println(str);
		}
		
	}

}