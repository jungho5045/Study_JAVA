package polymorphism;

public class GoldCustomer extends Customer{
	
	//멤버 변수(속성)
	double salesRatio;
	
	public GoldCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "GOLD";
		bonusRatio = 0.02;
		salesRatio = 0.1;
	}

	public int clacPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}
	
}
