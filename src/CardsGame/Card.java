package CardsGame;

public class Card {
	private String value;
	private Card next;
	
	public Card(String value){
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public Card getNext() {
		return next;
	}

	public void setNext(Card next) {
		this.next = next;
	}
}
