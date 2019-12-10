package template;

public abstract class Car {
	
	public abstract void drive();
	public abstract void stop();
	
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}

	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
	public void washCar() {}	// 구현이 된 메서드, 하위 클래스에서 재정의하면 기능이 추가되는 메서드

	final public void run() {  // <-템플릿 메서드, 재정의 할 수 없음
		startCar();
		drive();
		stop();
		turnOff();
		washCar();
	}
}
