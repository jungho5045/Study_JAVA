package Chapter5;

public class OrderTest {

	public static void main(String[] args) {
		
		Order order = new Order();
		
		order.orderNumber = 201907210001L;
		order.orderID = "abc123";
		order.orderDate = "2019�� 7�� 21��";
		order.orderName = "ȫ���";
		order.orderProductNumber = "PD0345-12";
		order.orderAddress = "����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ� ��ȣ : " + order.orderNumber);
		System.out.println("�ֹ��� ���̵� : " + order.orderID);
		System.out.println("�ֹ� ��¥ : " + order.orderDate);
		System.out.println("�ֹ��� �̸� : " + order.orderName);
		System.out.println("�ֹ� ��ǰ ��ȣ : " + order.orderProductNumber);
		System.out.println("��� �ּ� : " + order.orderAddress);
		
	}

}
