package inheritance;

public class VIPCustomer extends Customer{	// Customer Ŭ���� ���
	
	//��� ����(�Ӽ�)	
	double salesRatio;
	private int agentID;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	// �޼ҵ� �������̵�(������), ���� Ŭ�������� ���ǵ� ������ ���� Ŭ�������� �������Ѵ�.
	@Override	// �������̵� �ֳ����̼�
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	};
	
	
	
	
}
