package inheritance;

public class OverridingTest {

	public static void main(String[] args) {
		
		Customer customerLee = new Customer(10010, "이순신");
		// customerLee.setCustomerName("이순신");
		// customerLee.setCustomerID(10010);
		customerLee.bonusPoint = 1000;
		
		VIPCustomer customerKim = new VIPCustomer(10020, "김유신");
		// customerKim.setCustomerName("김유신");
		// customerKim.setCustomerID(10020);                               
		customerKim.bonusPoint = 10000;
		
		int priceLee = customerLee.calcPrice(10000);
		int priceKim = customerKim.calcPrice(10000);
		
		System.out.println(customerLee.showCustomerInfo() + "지불금액은 " + priceLee + "원 입니다.");
		
		System.out.println(customerKim.showCustomerInfo() + "지불금액은 " + priceKim + "원 입니다.");
		
		Customer customerNo = new VIPCustomer(10030, "나몰라");
		// customerNo.setCustomerName("나몰라");
		// customerNo.setCustomerID(10030);
		customerNo.bonusPoint = 10000;
		System.out.println(customerNo.showCustomerInfo() + "지불금액은" + customerNo.calcPrice(10000) + "원 입니다.");	// 인스턴스(생성자)의 메소드가 호출됨
		
		/*
		 * 가상 메서드(virtual method)
		 * 메서드의 이름과 메서드 주소를 가진 가상 메서드 테이블에서 호출될 메서드의 주소를 참조함
		 * 
		 * Customer vc = new VIPCustomer(); 일때
		 * vc.calcPrice(); -> calcPrice() 재정의 안된  경우 호출 => Customer 클래스의 calcPrice()
		 * 				   -> calcPrice() 재정의 된 경우 호출     => VIPCustomer 클래스의 calcPrice()
		 */
	}

}
