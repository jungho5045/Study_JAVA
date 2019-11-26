package array;

public class Subject {
	
	// 멤버 변수
	private String name;
	private int score;
	
	// 생성자
	public Subject(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	// 멤버 함수
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	
}
