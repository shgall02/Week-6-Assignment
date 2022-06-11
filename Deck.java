import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Deck {

	
	private List<Card> deck = new ArrayList<Card>();
		

	public Deck() {		
		int[] value = {2,3,4,5,6,7,8,9,10,11,12,13,14};
		String[] suits = {"Hearts", "Spades", "Diamonds", "Clubs"};
		for(String suit : suits) {
			for(int val : value) {
				deck.add(new Card(suit, val));
			}
		}
	}
	
	public void shuffle() {
		Collections.shuffle(deck);
	}
	
	public Card draw() {
		return deck.remove(0);
	}
	
	public List<Card> getDeck() {
		return this.deck;
	}
	
}
