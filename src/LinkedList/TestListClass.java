package LinkedList;


public class TestListClass {
	public static void main(String[] args) {
//	
//		List test = new List();
//		System.out.println("Empty list: " + test+" "+test.size());
//		
//		test.add(5);
//		test.add("D");
//		System.out.println("After add: " + test+" "+test.size());
//		
//		test.push("A");
//		test.push("X");
//		System.out.println("After push: " + test +" "+test.size());
//		
//		test.pop();
//		System.out.println("After pop: " + test+test.size());
//		
//		test.insertAt(2,"C");
//		System.out.println("After insert: " + test+test.size());
//		
//		test.insertAt(4,"X");
//		System.out.println("After insert at end: " + test+test.size());
//		
//		test.removeAt(4);
//		System.out.println("After remove from end: " + test+test.size());
//		
//		for (int i=0; i<4; i++) {
//			test.pop();
//		}
//		System.out.println("After popping all: " + test+test.size());
//		
//		test.add("Z");
//		System.out.println("After add: " + test+test.size());
//		test.push(5);
//		test.push(12);
//		test.push(55);
//		
//		Node [] array = test.toArray();
//		
//		for(int i=0; i<array.length; i++)
//			System.out.print(array[i] +" ");
//		
		
		
		List first = new List();
		List second = new List();
		
		first.add(55);
		first.add(56);
		first.add(57);
		
		second.add(58);
		second.add(59);
		second.add(60);
		
		first.add(second);
		
		System.out.println(first +" " +first.size());
		
		
		
		
	}
}
