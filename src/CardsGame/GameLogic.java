package CardsGame;

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

	public void makeMove(){
		
		activePlayer.setHandCard(table.getDeck().getNextCard());
		
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
	
	
	
}


