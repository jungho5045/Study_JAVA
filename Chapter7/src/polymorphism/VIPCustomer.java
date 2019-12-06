package polymorphism;

public class VIPCustomer extends Customer{	// Customer 클래스 상속
	
	//멤버 변수(속성)	
	double salesRatio;
	private int agentID;
	
	/*
	public VIPCustomer() {
		
		//super();	// super 키워드는 상위 클래스의 참조 값을 가지고 있다.
		super(0, null);
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer() 생성자 호출");
	}
	*/
	
	// 메소드 오버라이딩(재정의), 상위 클래스에서 정의된 내용을 하위 클래스에서 재정의한다.
	@Override	// 오버라이딩 애노테이션
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price - (int)(price * salesRatio);
	}

	public VIPCustomer(int customerID, String customerName) {
		super(customerID, customerName);
		
		customerGrade = "VIP";
		bonusRatio = 0.05;
		salesRatio = 0.1;
		
		System.out.println("VIPCustomer(int, String) 생성자 호출");
	}
}
