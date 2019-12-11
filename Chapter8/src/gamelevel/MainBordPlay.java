package gamelevel;

public class MainBordPlay {

	public static void main(String[] args) {
		
		Player player = new Player();
		player.play(1);
		
		AdvancedLevel aLevel = new AdvancedLevel();
		player.upgrade(aLevel);
		player.play(2);
		
		SuperLevel sLevel = new SuperLevel();
		player.upgrade(sLevel);
		player.play(3);
		
	}

}
