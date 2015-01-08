package CardsGame;

public class Table {

	private Player first;
	private Player last;
	private int size;
	private Deck deck;
		
	public Table(){
		first = last = null;
		size = 0;
		deck = new Deck();
	}
	
	/**
	 * Method which adds an player to our table.
	 * @param p
	 */
	public void addPlayer(Player p){
		
		if(first == null){						//Case where our first is null
			first = last = p;
			size++;
		}else{									//Other cases		
			
			last.setNext(p);			
			last = p;
			last.setNext(first);
			
			size++;
		}
	}
	
	public String toString(){
		String out = "";
		Player current = first;
		int counter = 0;
		
		while(counter < size){
			out += current.toString();
			current = current.getNext();
			counter++;
		}
		
		return out;
	}
	
}
