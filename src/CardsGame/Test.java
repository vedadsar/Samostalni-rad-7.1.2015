package CardsGame;


public class Test  {

	public static void main(String[] args)  {
		//Deck ourDeck = new Deck();
		//System.out.println(ourDeck.toString());
		
		Table t = new Table();
		t.addPlayer(new Player("Vedad"));
		t.addPlayer(new Player("Gorjan"));
		t.addPlayer(new Player("Haris"));
		t.addPlayer(new Player("Mirza"));
		t.addPlayer(new Player("Emir"));
		
		System.out.println(t.toString());
	}
}
