package linkedListProcessingPracticeLab30381;

import java.util.Collections;
import java.util.LinkedList;

// Example two: How to Sort LinkedList
	/*
	  In this example, we will demonstrate how to sort a LinkedList using
	  the Collections.sort() method. Please note that for custom sorting of objects, 
	  we can use Collections.sort(linkedList, comparator) method.
	*/
public class LinkedListsortExample {

	public static void main(String[] args)
	   {
	       //Create linked list       

	       LinkedList<String> linkedList = new LinkedList<>();

	       linkedList.add("A");
	       linkedList.add("C");
	       linkedList.add("B");
	       linkedList.add("D");

	//Unsorted
	       System.out.println(linkedList);

	//1. Sort the list
	       Collections.sort(linkedList);

	//Sorted
	       System.out.println(linkedList);

	//2. Custom sorting
	       Collections.sort(linkedList, Collections.reverseOrder());

	//Custom sorted
	       System.out.println(linkedList);

	   }

	/*
	 Output:
		[A, C, B, D]
		[A, B, C, D]
		[D, C, B, A]

	 */
}
