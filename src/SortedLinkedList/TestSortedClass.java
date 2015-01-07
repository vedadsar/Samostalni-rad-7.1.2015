package SortedLinkedList;

public class TestSortedClass {

	public static void main(String[] args) {
		SortedList even = new SortedList();
		SortedList odd = new SortedList();

		even.add(2);
		even.add(8);
		even.add(6);
		even.add(4);
		even.add(1);
		even.add(9);
		even.add(3);
		even.add(7);
		even.add(5);
				
		System.out.println(even.toString() +" " +even.getSize());
		
		
		SortedList reverseEven = new SortedList();
		reverseEven = even.reverse();
		
		System.out.println(reverseEven.toString() +" " +reverseEven.getSize());
	
	}
}
