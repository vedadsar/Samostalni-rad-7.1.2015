package Emir2;

public class List {

	private Node first;
	 private Node last;
	 private  int size;
	
	 
	 /**
	  * Constructor
	  */
	 public List(){
		 first = null;
		 last = null;
		 size = 0;
	 }
	 
	 /**
	  * Adding Node sent as parameter into our list
	  * @param next
	  */
	 public void add(Object next){
		 
		 Node node = new Node(next); 										//Casting object into Node
		 
		 if(last != null){													//If our last node is different then 'null' we're setting sent object to last.setNext
			 last.setNext(node);
			 last = node;													// now last is our added object	
		 }else																// If our last node is null, that means our list is empty so our node is first and last.
			 first = last = node;										
		 
		 
		 size++;
	 }
	 
	 /**
	  * Method for getting node at index sent as parameter.
	  * @param index
	  * @return
	  */
	 public Node getNode (int index){
		 int counter = 0;
		 Node current = first;
		 
		 while(counter < index){												//Loop while our counter is lower then index of Node we want
			 
			 if(current.getNext() != null){										//IF our current.getNext is different then null, we'll move our current to current.getNext	
				 current = current.getNext();									
				 counter++;														//Increasing counter
			 }else
				 throw new IllegalArgumentException("Index is out of bounds");
		 }
		 
		 return current;
		 
	 }
	 
	 /**
	  * Method for adding a Node sent as parameter into first place.
	  * @param next
	  */
	 public void push(Object next){
		 
		 Node node = new Node(next);
		 
		 node.setNext(first);											//Setting next node of our parameter to first.
		 first = node;													// First will become our new node
		 size++;														//Increasing size
	 }
	 
	 /**
	  * Method removing a node which is on first place.
	  */
	 public Object pop(){
		
		 if (first != null) {											//Checking if first Node is null
				Object value = first.getValue();						// Object we're going to return
				first = first.getNext();								//Moving first Node to first.getNext ( next node)
							
				if (first == null) {									//If first node is null that means that last node is also null and list is empty
					last = null;
				
				}
				size--;													//Decreasing size
				return value;											// Returning deleted object
				
			}
			
		 throw new IllegalArgumentException("U're trying to remove more elements then list got");
		}
	 
	 
	 /**
	  * Method for inserting node (next) which is sent as parameter into slot at index (index) sent as parameter.
	  * @param index index place in list where we'll add Node
	  * @param next Node which we'll add.
	  */
	 public void insertAt(int index, Object element){
		 
		 if (index == 0) 															//If index at which we want to add is 0, we simply use push.
				push(element);
			
		 else {													
				Node newNode = new Node(element);									//Casting our object into node
				Node prev = getNode(index - 1);										//getting previous node (position index-1). Using getNode method.
				
				if (prev != null) {													//Previous cannot be null !
					Node next = prev.getNext();										//Getting next node.	
					
					// [prev]->[newNode]->[next]
					newNode.setNext(next);											//Setting nextNode of our newNode.	 it looks like 	
					prev.setNext(newNode);											// And setting nextNode of our previous.	
			
					
					if (next == null) {												//If we're trying to add node at the end of list.	
						last = newNode;
					}
					
				} else 																//throwing exception in case prev is somehow equals to null
					throw new IllegalArgumentException();
				
		}
		 size++;
	}
		
	 
	 /**
	  * Method which removes an Object at index which is sent as parameter.
	  * @param index position of object we want to remove.
	  */
	 public void removeAt(int index){
		
		 int counter = 0;
		 Node current= first;
		 
		 while(counter < index-1 && index <= size){								//Loop while index is lower then counter and lower or equals to size.
			 			 current = current.getNext();
			 counter++;			 
		 }
		 
		 //[previous]-->[remove]-->[next]
		 Node previous = current;											
		 Node remove = current.getNext();
		 Node next = remove.getNext();
		 
		 //after removing, [previous] --> [next]
		 previous.setNext(next);
		
		size--;										


		 
		 
	 }
	 
	 /**
	  * method which returns size of our list
	  * @return
	  */
	 public int size(){
		 return this.size;
	 }
	 
	 /**
	  * Method which checks if our list is empty or not. returning true if its empty or false if its false.
	  * @return
	  */
	 public boolean isEmpty(){
		 
		 if(first==null)
			 return true;
		 
		 return false;
	 }
	 	 
	 @Override // To string method to print whole list
	 public String toString() {
		 
		 Node current = first;								//Creating current which will be first
		 String out = "[";									// Creating output string	
		 
		 if(first == null)									//If first == null, our list is empty so we return nothing		
			return out += "]";
		 
		 
		 while(current != null){							//loop while current isn't null we're adding values to our string			
			 
			 if(current.getNext()==null){					//Once our current's next is null, that means we are adding last element so we close our string.	
				 out += current.getValue() +"]";
				 break;
			 }
			
			 out += current.getValue() +",";
			 current = current.getNext();
					 
		 }
		 return out;
	 }
	 
}
