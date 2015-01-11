package CardsGame;

public class Test {

public static void main(String[] args) {

		
		Table t = new Table();
		String name = "";
		
		do{
			System.out.println("Enter name / end if want to finish");
			name = TextIO.getln();	
			
			if(name.equals("end"))
				break;
			
			
			t.addPlayer(new Player(name));
			
		
		}while(true);
		
		
		GameLogic ourGame = new GameLogic(t);
		Card  c = ourGame.getTable().getDeck().getNextCard();
		Player p = ourGame.getActivePlayer();
		

		String activePlayer;
		int cardValue ;
		
		do{
			
			activePlayer = p.getName();
			cardValue = c.getValue();
			
			if(ourGame.getTable().getDeck().getSize() <0)
				break;
			
			System.out.println("Enter 'm' for making new move or 'e' for ending game");
			char what = TextIO.getlnChar();
			
			
			if (what == 'm'){
								
			System.out.println("" +activePlayer + " throws card with value " +cardValue);
			ourGame.makeMove(c);
			p = p.getNext();
			 c = ourGame.getTable().getDeck().getNextCard();
			
			}
			
			if(what == 'e')
				break;				
			
			
			
		}while(true);
				
		System.out.println(t.toString() + " size of deck " );
		
		
}
}
