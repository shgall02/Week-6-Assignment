public class Card {

	
	private int value;
	private String name;
	String[] values = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
	
	
	public Card(String suit, int value)
	{
		this.value = value;
		this.name = values[value-2] +" of " + suit;
	}
	
	public String toString()
	{
		return this.name;
	}
	
	public void describe() {
		System.out.println("This card is the " + this.value + "of " + this.name);
	}
		
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
