package Chapter5;

public class Taxi {
	
	// ��� ����
	int taxiNumber;
	String taxiDriverName;
	int money;
	int passengerCount;
	
	// ������
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	// ��� �Լ�
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showTaxiInfo() {
		System.out.println(taxiNumber + "�� �ý��� �°��� " + passengerCount + "�� �̰�, ������ " + money + "�Դϴ�.");
	}
}
