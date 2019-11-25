package Chapter5;

public class Taxi {
	
	// 멤버 변수
	int taxiNumber;
	String taxiDriverName;
	int money;
	int passengerCount;
	
	// 생성자
	public Taxi(int taxiNumber) {
		this.taxiNumber = taxiNumber;
	}
	
	// 멤버 함수
	public void take(int money) {
		this.money += money;
		passengerCount++;
	}
	
	public void showTaxiInfo() {
		System.out.println(taxiNumber + "번 택시의 승객은 " + passengerCount + "명 이고, 수입은 " + money + "입니다.");
	}
}
