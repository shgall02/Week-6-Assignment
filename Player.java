import java.util.ArrayList;
import java.util.List;

public class Player {

	
	private List<Card> hand = new ArrayList<Card>();
	private int score = 0;
	private String name;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void describe(String value, int num) {
		System.out.println("UserName: " + this.name + "Score: " + this.score + "User Hand: " + this.hand);
	}
	
	public Card flip() {
		return hand.remove(0);
	}
	
	public void draw(Deck deck) {
		hand.add(deck.draw());
	}
	
	public void incrementScore() {
		score++;
	}
	
	public int getScore(){
		return this.score;
	}
}
