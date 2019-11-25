package Chapter5;

public class OrderTest {

	public static void main(String[] args) {
		
		Order order = new Order();
		
		order.orderNumber = 201907210001L;
		order.orderID = "abc123";
		order.orderDate = "2019년 7월 21일";
		order.orderName = "홍길순";
		order.orderProductNumber = "PD0345-12";
		order.orderAddress = "서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문 번호 : " + order.orderNumber);
		System.out.println("주문자 아이디 : " + order.orderID);
		System.out.println("주문 날짜 : " + order.orderDate);
		System.out.println("주문자 이름 : " + order.orderName);
		System.out.println("주문 상품 번호 : " + order.orderProductNumber);
		System.out.println("배송 주소 : " + order.orderAddress);
		
	}

}
