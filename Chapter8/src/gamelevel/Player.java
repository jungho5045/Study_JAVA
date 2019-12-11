package gamelevel;

public class Player {
	
	private Playerlevel level;
	
	public Player() {
		level = new BeginnerLevel();
		level.showLevelMessage();
	}
	
	public Playerlevel getLevel() {
		return level;
	}
	
	public void upgrade(Playerlevel level) {
		this.level = level;
		level.showLevelMessage();
	}
	
	public void play(int count) {
		level.go(count);
	}
	
}
