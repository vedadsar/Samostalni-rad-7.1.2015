package CardsGame;

public class Deck {

	private Card first;
	private Card last;
	private int size;
	
	public Deck(){
		
		createDeck();
		shuffle();
	}
	
	private void createDeck(){
		first = new Card(2, "TEST");
		Card current = first;
		
		for(int i=1; i<14;i++){				//For loop where we create our cards
			
			current.setNext(new Card(i, "Hearts"));
			current = current.getNext();
					
			current.setNext(new Card(i, "Spades"));
			current = current.getNext();
			

			current.setNext(new Card(i, "Diamonds"));
			current = current.getNext();


			current.setNext(new Card(i, "Clubs"));
			current = current.getNext();
		}
		
		first = first.getNext();
		
	}
	
	
	
	private void shuffle(){
		
	}
	
	private void addNext(Card card){
		
	}
	
	
	public String toString(){
		String out = "";
		Card current = first;
		while(current != null){
			out += "[ " +current.getValue()+" of " +current.getSymbol() +" ]";
			current = current.getNext();
		}
		return out;
	}
	
}

	