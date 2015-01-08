package DoubleLinkedList;

public class TestClass {
	public static void main(String[] args) {
			
	DoubleList newList = new DoubleList();
	Node n15 = new Node(15);
	Node n22 = new Node(22);
	Node n55 = new Node(55);
	Node n1 = new Node(1);
	Node n86 = new Node(86);
	

	
	newList.add(n15);
	
	newList.add(n22);
	
	newList.add(n55);
	
	
	newList.add(n1);
	
	newList.add(n86);
	
	System.out.println(n1.getPrev().getValue() + " " +n1.getNext().getValue());
	System.out.println(newList.toString());
			
	}
}
