
public class SortedList {

	private Element first; // First element in our list
	private Element last; // Last element in our list
	private  int size;   // Size of list
	
	/**
	 * Constructor for sorted list.
	 */
	public SortedList(){
		first = null;
		last = null;
		size = 0;
	}
	
	/**
	 * Push method. I made it private since this is sorted list and its not allowed to add
	 * element on first slot if it isnt sorted. Made this method just to make add method shorter.
	 * @param el value of element.
	 */
	private void push(int el){
		
		Element newEl = new Element(el);
		
		if(first == null){
			first=last=newEl;
			size++;
		}else{
			newEl.setNext(first);
			first = newEl;
			size++;
		}
	}
	
	
	/**
	 * Method which adds and element to our list. This method is adding element in 'sort' way.
	 * Method is checking values of element before it add element. This is way to make our list sorted.
	 * @param el value of element we are going to make.
	 */
	public void add(int el){
		Element newEl = new Element(el);
		
		if(first==null){
			push(el);
			return;	
		}
			
		if(newEl.getValue() < first.getValue()){				//Case when our new el is lower then first.
				push(el);
				return;
			}
		
		if(newEl.getValue() >= last.getValue()){
				last.setNext(newEl);
				last = newEl;
				size++;
				return;
			}
			
		Element current = first;			
		while(current.getNext() != null){
		// Sorting our element in list.
			if(newEl.getValue() < current.getNext().getValue() && newEl.getValue() >= current.getValue()){
					newEl.setNext(current.getNext());
					current.setNext(newEl);
					size++;
					return;
				}
			current = current.getNext();
			}
		
			
			
		
	}
	
	/**
	 * Method which removes and element from our list at index sent as parameter.
	 * @param index is index of element in our sorted list that we want to remove.
	 * @return a removed element
	 */
	public Element removeAt(int index){
		
		Element current = first;
		int counter = 0;
		
		if(index == 0){										//Case where we want to remove first element
			first = first.getNext();
			size --;
			return first;
		}
		
		while(counter < index-1){							//Case we want to remove not first element	
			counter++;										//Counter which will count till we get to index			
			current = current.getNext();					//current becomes next current	
		}
		
		Element prev = current;								//Previous element
		Element remove = current.getNext();					//Element we will remove
		Element next = remove.getNext();					//Elements that will take slot instead of removed element
		
		prev.setNext(next);	
		size--;
		return remove;
		
	}

	@Override
	/**
	 * Method which converts our list into string and returning that string
	 */
	public String toString(){
		
		String out = "";
		Element current = first;
		
		while (current != null){
			out += current.toString() +" ";
			current = current.getNext();
			
		}
				
		return out;
		
	}
	
	/**
	 * Method which just returns size of list.
	 * @return
	 */
	public int getSize(){
		return size;
	}
	
	
}
