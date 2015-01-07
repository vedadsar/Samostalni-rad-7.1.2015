
public class SortedList {

	private Element first;
	private Element last;
	private  int size;
	
	
	public SortedList(){
		first = null;
		last = null;
		size = 0;
	}
	
	public void push(int el){
		
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
	
	
	
	public void add(int el){
		Element newEl = new Element(el);
		
		if(first==null){
			push(el);
		
		}else{
			
			if(newEl.getValue() < first.getValue()){				//Case when our new el is lower then first.
				push(el);
				size++;
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
			}
		}
			
			
		
	}

	@Override
	public String toString(){
		
		String out = "";
		Element current = first;
		
		while (current != null){
			out += current.toString() +" ";
			current = current.getNext();
			
		}
				
		return out;
		
	}
	
	
}
