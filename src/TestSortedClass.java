
public class TestSortedClass {

	public static void main(String[] args) {
		SortedList list = new SortedList();
		
		list.add(5);
		list.add(9);
		list.add(2);
		list.add(7);
		list.add(1);
		list.add(3);
		list.add(6);
		list.add(0);
		list.add(4);
		list.add(8);
				
		list.removeAt(0);
		list.removeAt(0);
		list.removeAt(0);

		Element [] array = list.toArray();
		
		for(int i=0; i<array.length; i++){
			System.out.println(array[i]);
		}
		
	
	}
}
