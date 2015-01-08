package CardsGame;

public class Test {

	public static void main(String[] args) {

			
			Table t = new Table();
			String name = "";
			
			do{
				System.out.println("Enter name / end if want to finish");
				name = TextIO.getln();	
				
				if(name.equalsIgnoreCase("end"))
					break;
				
				
				t.addPlayer(new Player(name));
				
			
			}while(true);
			
			
			GameLogic ourGame = new GameLogic(t);
			
			do{
				
				if(ourGame.getTable().getDeck().getSize() <0)
					break;
				
				System.out.println("Enter move for making new move or end for ending game");
				String what = TextIO.getln();
				
				
				if (what.equalsIgnoreCase("move"))
					ourGame.makeMove();
				if(what.equalsIgnoreCase("end"))
					break;				
				
				
				
			}while(true);
					
			System.out.println(t.toString() + " size of deck " +(t.getDeck().getSize()+1));
			
			
	}
}
