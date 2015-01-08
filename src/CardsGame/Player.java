package CardsGame;

public class Player {
	
	private String name;
	private int points;
	private Card handCard;
	private Player next;
	
	public Player(String name){
		this.name = name;
		this.handCard = null;
		this.points = 0;
	}
	
	public Card getHandCard() {
		return handCard;
	}

	public void setHandCard(Card handCard) {
		this.handCard = handCard;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public Player getNext() {
		return next;
	}

	public void setNext(Player next) {
		this.next = next;
	}

	

	@Override
	public String toString() {
		return "["+name + ", points=" + points + "]";
	}
	
	
}
