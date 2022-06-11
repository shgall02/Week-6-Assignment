
public class App {

	public static void main(String[] args) {

		Player p1 = new Player("Shawntel");
		Player p2 = new Player("Gemma");
		Deck deck = new Deck();
		deck.shuffle();
		
		
		for(int i = 0; i < 52; i++) {
			if(i % 2 == 0) {
				p1.draw(deck);
			}else {
				p2.draw(deck);
			}
		}
			
		for(int j = 0; j < 26; j++ ) {
			if (p1.flip().getValue() > p2.flip().getValue())
			{
				p1.incrementScore();
			}
			else
			{
				p2.incrementScore();
			}
		}
		System.out.println("p1 score: "+p1.getScore()+", p2 score: "+p2.getScore());

	}
}
