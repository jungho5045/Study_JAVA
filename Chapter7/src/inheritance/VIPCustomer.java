package inheritance;

public class VIPCustomer extends Customer{	// Customer 클래스 상속
	
	//멤버 변수(속성)	
	double salesRatio;
	private int agentID;
	
	public VIPCustomer() {
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
	}
	
	// 메소드 오버라이딩(재정의), 상위 클래스에서 정의된 내용을 하위 클래스에서 재정의한다.
	@Override	// 오버라이딩 애노테이션
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	};
	
	
	
	
}
