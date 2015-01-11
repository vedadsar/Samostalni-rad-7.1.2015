package CardsGame;

/**
 * This class is source of our game. It connects all classes and makes move in our game.
 * @author Vedad_2
 *
 */
public class GameLogic {

	private int moveCounter;
	private Player previousPlayer;
	private Player activePlayer;
	private Table table;
	
	public GameLogic(Table table){
		this.table = table;
		this.moveCounter = 0;
		this.activePlayer = table.getFirst();
		
	}
	
	public Table getTable() {
		return table;
	}

	public void setTable(Table table) {
		this.table = table;
	}

	/**
	 * Method which allows us to make move. This method is setting points of player
	 * if card he throws is higher then previous card.
	 * @param c
	 */
	public void makeMove(Card c){
		
		activePlayer.setHandCard(c);
		
		if(moveCounter == 0){							//If game just started.
			previousPlayer = activePlayer;
			activePlayer = activePlayer.getNext();
			moveCounter++;
		}else{
			//In case activePlayer's card is higher then previousPlayer's card.
			if(activePlayer.getHandCard().getValue() > previousPlayer.getHandCard().getValue()){
				
				activePlayer.setPoints(activePlayer.getPoints()+1);
				
				previousPlayer = activePlayer;
				activePlayer = activePlayer.getNext();
				moveCounter++;
				
				return;
			}
			
			previousPlayer = activePlayer;
			activePlayer = activePlayer.getNext();
			moveCounter++;
									
		}
		
	}

	public Player getActivePlayer() {
			return activePlayer;
	}
	
		
}


