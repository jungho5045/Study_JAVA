package lamda;

// Java8 ���� �����ϸ�, �Լ��� �������̽��� �����ϴ� ������̼��Դϴ�.
// ���� �޼��尡 �������� �ʰų�, 1�� �̻��� �޼���(default �޼��� ����)�� ������ ��� ������ ������ �߻� ��ŵ�ϴ�.
@FunctionalInterface
public interface MyMaxNumber {
	
	int getMaxNumber(int x, int y);
	// void add(int x, int y);		// @FunctionalInterface�̹Ƿ� �޼��� 1�� �̻� ���� �� �����߻�
	
}
