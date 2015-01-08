package CardsGame;


public class Test  {

	public static void main(String[] args)  {
		//Deck ourDeck = new Deck();
		//System.out.println(ourDeck.toString());
		
		Table t = new Table();
		t.addPlayer(new Player("Vedad"));
		t.addPlayer(new Player("Gorjan"));
	
		
		System.out.println(t.toString());
		
		GameLogic ourGame = new GameLogic(t);
		for(int i = 0; i < 52; i++){
		ourGame.makeMove();
		}
	
		System.out.println(t.toString() + " size of deck " +t.getDeck().getSize());
		
		
	}
}
