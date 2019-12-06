package polymorphism;

public class VIPCustomer extends Customer{	// Customer Ŭ���� ���
	
	//��� ����(�Ӽ�)	
	double salesRatio;
	private int agentID;
	
	/*
	public VIPCustomer() {
		
		//super();	// super Ű����� ���� Ŭ������ ���� ���� ������ �ִ�.
		super(0, null);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() ������ ȣ��");
	}
	*/
	
	// �޼ҵ� �������̵�(������), ���� Ŭ�������� ���ǵ� ������ ���� Ŭ�������� �������Ѵ�.
	@Override	// �������̵� �ֳ����̼�
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}

	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) ������ ȣ��");
	}
}
