package CardsGame;
/**
 * Class that creates card. Object card has symbol, value and pointer to next card.
 * @author Vedad_2
 *
 */
public class Card  {
	private String symbol;
	private int value;
	private Card next;
	
	public Card(int value, String symbol){
				
		if(value < 0 || value > 13)
			throw new IllegalArgumentException("Wrong value of card");
		
		
		this.value = value;
		this.symbol = symbol;
	}

	public String getSymbol() {
		return symbol;
	}


	public int getValue() {
		return value;
	}

	public Card getNext() {
		return next;
	}

	public void setNext(Card next) {
		this.next = next;
	}

	public void setSymbol(String symbol) {
		this.symbol = symbol;
	}

	public void setValue(int value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return	 "[ " +getValue()+" of " +getSymbol() +" ]";
		
		
	
	}
}
	
	


