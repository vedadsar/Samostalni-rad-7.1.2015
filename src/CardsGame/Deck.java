package CardsGame;

public class Deck {

	private Card first;
	private Card last;
	private int size = 51;
	
	public Deck(){
		
		createDeck();
		
	}
	
	/**
	 * Method which creates our cards deck.
	 */
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
	
		
	public Card getNextCard(){
		int randomIndex = (int) (Math.random()*size);
		int counter = 0;
		Card current = first;
		
		if(randomIndex == 0){
			size--;
			Card temp = first;
			first = first.getNext();
			
			return temp;
			
		}
		
		while(counter < randomIndex-1 ){
			current = current.getNext();
			counter++;
		}
		Card prev = current;
		Card send = prev.getNext();
		Card next = send.getNext();
		
		prev.setNext(next);
		
		size--;
		return send;
				
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

	