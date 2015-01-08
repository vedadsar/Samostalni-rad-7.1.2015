package CardsGame;

public class Deck {

	private Card first;
	private Card last;
	private int size ;
	
	public Deck(){
		
		createDeck();
		size = 51;
		
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
	
	
	/**
	 * Method to get access to random card in our deck. Each time card is taken from deck
	 * the same card is removed from deck. 
	 * Each time card is taken we decrease size of deck so our random number is getting lower
	 * each time card is taken.  This method is similar to remove method from usual list.
	 * @return randomly chosen card.
	 */
	public Card getNextCard(){
		
		int randomIndex = (int) (Math.random()*size); //getting random index of deck
		int counter = 0;							  			
		Card current = first;
		
		if(randomIndex == 0){						 //In case random is 0	
			size--;									 //Decreasing size		
			Card temp = first;						//Saving first value into temp
			first = first.getNext();				//setting new first(removing true first)
			
			return temp;				
			
		}
		
		while(counter < randomIndex-1 ){			//In case randomIndex is not 0
			current = current.getNext();			//loop till we get to index-1 card
			counter++;
		}
		Card prev = current;						// index -1 card
		Card send = prev.getNext();					//card at index we want to remove
		Card next = send.getNext();					// next card
		
		prev.setNext(next);							//Removing card we send.
		
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

	