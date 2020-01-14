package thread;

class Bank{
	
	private int money = 10000;
	
	// public synchronized void saveMoney(int save) {			// synchronized 메서드 방식
	public void saveMoney(int save) {
		synchronized (this) {
	
			int m = this.getMoney();
			
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			setMoney(m + save);
		}
	}
	
	// public synchronized void minusMoney(int minus) {			// synchronized 메서드 방식
	public void minusMoney(int minus) {
		synchronized (this) {
			
			int m = this.getMoney();
			
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			setMoney(m - minus);
		}
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}
	
	

}

class Park extends Thread{			// 저축
	
	public void run() {
		synchronized (SyncTest.myBank) {				// run()에 synchronized를 걸려면
			System.out.println("start save");
			SyncTest.myBank.saveMoney(3000);
			System.out.println("save money : " + SyncTest.myBank.getMoney());
		}
	}
	
}

class ParkWife extends Thread{		// 소비
	
	public void run() {
		synchronized (SyncTest.myBank) {				// run()에 synchronized를 걸려면
			System.out.println("start minus");
			SyncTest.myBank.minusMoney(1000);
			System.out.println("minus money : " + SyncTest.myBank.getMoney());
		}
	}
	
}

public class SyncTest {

	public static Bank myBank = new Bank();
	
	public static void main(String[] args) throws InterruptedException {
		
		Park p = new Park();
		p.start();
		
		Thread.sleep(200);
		ParkWife pw = new ParkWife();
		pw.start();
		
	}

}
