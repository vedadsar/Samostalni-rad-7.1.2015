package CardsGame;

public class Test {

	public static void main(String[] args) {

			
			Table t = new Table();
			String name = "";
			
			while(!name.equalsIgnoreCase("end")){
				System.out.println("Enter name / end if want to finish");
				name = TextIO.getln();	
				t.addPlayer(new Player(name));
			}
			
			
			GameLogic ourGame = new GameLogic(t);
			
			/*for(int i = 0; i < 51; i++){
			ourGame.makeMove();
			}*/
			while(ourGame.getTable().getDeck().getSize() > 0){
				ourGame.makeMove();
			}
			
			
			
		
			System.out.println(t.toString() + " size of deck " +t.getDeck().getSize());
			
			
	}
}
