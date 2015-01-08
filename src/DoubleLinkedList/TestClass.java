package DoubleLinkedList;

public class TestClass {
	public static void main(String[] args) {
			
	DoubleList newList = new DoubleList();
		
	
	newList.add(new Node(1));
	newList.add(new Node(2));
	newList.add(new Node(3));
	newList.add(new Node(4));
	newList.add(new Node(5));
	newList.add(new Node(6));
	newList.add(new Node(7));
	newList.add(new Node(8));
	newList.add(new Node(9));
	newList.push(new Node(0));
	
	System.out.println(" List before removing " +newList.toString());
	
	newList.remove(5);
	newList.remove(0);
	
	System.out.println(" List after removing " +newList.toString());
	
	newList.pop();
	newList.pop();
	newList.pop();
	newList.pop();

	System.out.println(" List after 4 pops " +newList.toString());
	System.out.println(newList.contains(8));
	
	
	}
}
