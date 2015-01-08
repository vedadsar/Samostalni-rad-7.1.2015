package CardsGame;


public class Test  {

	public static void main(String[] args)  {
		Deck ourDeck = new Deck();
		//System.out.println(ourDeck.toString());
		for(int i=0 ; i<51; i++){
			System.out.println(	ourDeck.getNextCard().toString());		
		}
	}
}
