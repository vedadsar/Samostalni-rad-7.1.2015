package SortedLinkedList;

public class TestSortedClass {

	public static void main(String[] args) {
		SortedList even = new SortedList();
		SortedList odd = new SortedList();

		even.add(2);
		even.add(8);
		even.add(6);
		even.add(4);
		
		odd.add(7);
		odd.add(3);
		odd.add(1);
		odd.add(9);
		
		even.add(odd);		
		
		System.out.println(even.toString() +" " +even.getSize());

		
	
		
	
	}
}
