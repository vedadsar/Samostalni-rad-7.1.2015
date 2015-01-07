package Emir2;

public class Node {
	private  final Object  value;
	private Node next;


		public Node(Object value){
			this.value = value;
		}
		
		
		public Node getNext (){
			return next;
		}
		
		
		public void setNext ( Node next){
			this.next = next;
		}
		
		public Object getValue (){
			return value;
		}


		@Override
		public String toString() {
			return "Node [value=" + value.toString() + "]";
		}
		
		
		
}
