package DoubleLinkedList;

public class DoubleList {

	private Node first;
	private Node last;
	private int size;
	
	public DoubleList(){
		first = null;
		last = null;
		size = 0;
	}
	
	public void add(Node element){
		
		//Node element = new Node(value);
		
		if(first == null){
				
				first = element;
				last = element;
				size++;
			
//			}else if(first.getNext() == null){
//				
//				first.setNext(element);	
//				element.setPrev(first);
//				last = element;
//				size++;
			
			}else{
				
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
	
	
	/*public Node remove(int index){
		return removedNode;
	}*/
	
	/*public Node getElement(int index){
	
		return nodeAtIndex;
	}*/
	
	public int getSize(){
		return size;
	}
	
	public Node[] toArray(){
		
		Node [] listToArray = new Node[size];
		Node current = first;
		
		for(int i=0; i<size;i++){
			
			listToArray[i] = current;
			current = current.getNext();
		}
		
		
		
		return listToArray;
	}
	
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
