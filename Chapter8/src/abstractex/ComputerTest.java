package abstractex;

public class ComputerTest {

	public static void main(String[] args) {
		
		Computer computer = new DeskTop();	// 묵시적 형변환
		computer.display();
		computer.turnOff();
		
		Computer myNote = new MyNoteBook();
		
	}

}
