package SortedLinkedList;

public class Element {

	public int value;
	public Element next;
	
	public Element(int value){
		this.value = value;
	}
	
	public Element getNext(){
		return next;
	}
	
	public void setNext(Element other){
		this.next = other;
	}
	
	public int getValue(){
		return value;
	}

	@Override
	public String toString() {
		return "[" + value + "]";
	}
	
}
