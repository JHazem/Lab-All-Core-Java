package hashSetAndTreeSetProcessingLab30382;

import java.util.Collections;
import java.util.LinkedList;

public class MainRunner {

	public static void main(String[] args) {

		/**
		 * LAB - 303.8.1  - LinkedList Processing

		In this lab, we will explore and demonstrate LinkedList using built-in methods.
		Example One: LinkedList Methods
		Create a class named “LinkedListExample” and add the code below:*/
		
		       /* Linked List Declaration */
		   System.out.println(" ---------------------- Linked Method ------------------------\n");

	       LinkedList<String> linkedlist = new LinkedList<String>();

	       /*add(String Element) is used for adding 
	        * the elements to the linked list*/
	       linkedlist.add("Item1");
	       linkedlist.add("Item5");
	       linkedlist.add("Item3");
	       linkedlist.add("Item6");
	       linkedlist.add("Item2");

	       /*Display Linked List Content*/
	       System.out.println("Linked List Content 111: " +linkedlist);

	       /*Add First and Last Element*/
	       linkedlist.addFirst("First Item");
	       linkedlist.addLast("Last Item");
	       System.out.println("LinkedList Content after addition 222: " +linkedlist);

	       /*This is how to get and set Values*/
	       Object firstvar = linkedlist.get(0);
	       System.out.println("First element 333: " +firstvar);
	       linkedlist.set(0, "Changed first item");
	       Object firstvar2 = linkedlist.get(0);
	   System.out.println("First element after update by set method 444: " +firstvar2);
 
	       /*Remove first and last element*/
	       linkedlist.removeFirst();
	       linkedlist.removeLast();
	       System.out.println("LinkedList after deletion of first and last element 555: " +linkedlist);

	       /* Add to a Position and remove from a position*/
	       linkedlist.add(0, "Newly added item");
	       linkedlist.remove(2);
	       System.out.println("Final Content 666: " +linkedlist); 
	     
		   System.out.println(" ---------------------- Sort Example ------------------------\n");

	       /*
		    * Example two: How to Sort LinkedList
			 In this example, we will demonstrate how to sort a LinkedList using the Collections.sort() method. 
			 Please note that for custom sorting of objects, 
			 we can use Collections.sort(linkedList, comparator) method.
			Create a class named “LinkedListsortExample” and add the code below:
			*/
		   
	       
	       //Create linked list       

	       LinkedList<String> linkedList = new LinkedList<>();

	       linkedList.add("A");
	       linkedList.add("C");
	       linkedList.add("B");
	       linkedList.add("D");

			//Unsorted
			       System.out.println("Fist print as is     " + linkedList);
		
			//1. Sort the list
			       Collections.sort(linkedList);
		
			//Sorted
			       System.out.println("Second after sort it " + linkedList);
		
			//2. Custom sorting
			       Collections.sort(linkedList, Collections.reverseOrder());
		
			//Custom sorted
			       System.out.println("After reserve list   " + linkedList);


	}

	
}
