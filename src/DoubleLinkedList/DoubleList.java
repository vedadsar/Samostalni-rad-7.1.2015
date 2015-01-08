package DoubleLinkedList;
/**
 * Class creates Double Linked List.
 * @author vedadzornic
 *
 */
public class DoubleList {

	private Node first;
	private Node last;
	private int size;
	
	public DoubleList(){
		first = null;
		last = null;
		size = 0;
	}
	/**
	 * Method which adds an element into our list. Since its Double linked list, we have to sent previous and next elements.
	 * @param element
	 */
	public void add(Node element){
	
		if(first == null){							//If our first is null, we added element into blank list.
				
				first = element;
				last = element;
				size++;
				
		}else{										//If our first elemt isn/t null. 
				
				Node current = first;
						
				while(current.getNext() != null){
					current = current.getNext();
					
				}
				
				current.setNext(element);
				element.setPrev(current);
				last = element;
				size++;
								
			}
	}
	
	/**
	 * Method which removes an Node from list.
	 * @param index
	 * @return
	 */
	public Node remove(int index){
	
		if(index == 0){
			first = first.getNext();
		}
		
		Node current = first;
		int counter = 0;
		
		while(counter < index -1){
			current = current.getNext();
			counter++;
		}
		
		Node prev = current;
		Node remove = prev.getNext();
		Node next = remove.getNext();
		
		prev.setNext(next);
		next.setPrev(prev);
		
		
		return current;
	}
	
	/**
	 * Method which returns an Node at which is at index "index" in our list.
	 * @param index
	 * @return
	 */
	public Node getElement(int index){
	
		Node current = first;
		int counter = 0;
		
		while(counter < index){
			current = current.getNext();
			counter++;
		}
		
		return current;
	
	}
	
	/**
	 * Method which returns size of list.
	 * @return
	 */
	public int getSize(){
		return size;
	}
	
	/**
	 * Method which returns this list converted to array.
	 * @return
	 */
	public Node[] toArray(){
		
		Node [] listToArray = new Node[size];
		Node current = first;
		
		for(int i=0; i<size;i++){
			
			listToArray[i] = current;
			current = current.getNext();
		}
		
		
		
		return listToArray;
	}
	
	/**
	 * To string method which returns our list converted to string.
	 */
	public String toString(){
		Node current = first;
		String out = "";
		
		while(current != null){
			out += " "+current.getValue();
			current = current.getNext();
		}
		
		return out;
	}
	
		
}
