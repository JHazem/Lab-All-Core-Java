package linkedListProcessingPracticeLab30381;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {

	public static void main(String[] args) {
   
		//Create linked list
		 LinkedList<String> linkObj = new LinkedList<String>();
		 //Adding elements
		 linkObj.add("A");
		 linkObj.add("B");
		 linkObj.add("C");
		 linkObj.add("D");
		 System.out.println(linkObj);
		 //Add elements at specified position
		 linkObj.add(4, "A");
		 linkObj.add(5, "A");
		 System.out.println(linkObj);
		 //Adding an element to the first position
		 linkObj.addFirst("AddedOnFirst");
		 //Adding an element to the last position
		 linkObj.addLast("Lastadded");
		 System.out.println(linkObj);
		 System.out.println("ELement on Index 4: "+ linkObj.get(4));
		 // set() method for overide or replace any element
		 linkObj.set(2, "B is relace by BBBBB");
		 System.out.println(linkObj);
		 //Remove element
		 linkObj.remove(0); //removes AddedOnFirst
		 System.out.println(linkObj);
		 linkObj.remove("A"); //removes A
		 System.out.println(linkObj);
		  
	
		/*
		 Output:
			[A, B, C, D]
			[A, B, C, D, A, A]
			[AddedOnFirst, A, B, C, D, A, A, Lastadded]
			ELement on Index 4: D
			[AddedOnFirst, A, B is relace by BBBBB, C, D, A, A,
			Lastadded]
			[A, B is relace by BBBBB, C, D, A, A, Lastadded]
			[B is relace by BBBBB, C, D, A, A, Lastadded]
		 */
		
		 System.out.println("--------------------");

		// Example: Iterating using Iterator interface
		
		LinkedList<String> l = new LinkedList<String>();
		 l.add("John");
		 l.add("Sara");
		 l.add("Susan");
		 l.add("Betty");
		 l.add("Nathan");
		 System.out.println("The LinkedList elements are: ");
		 Iterator itr = l.iterator();
		 while(itr.hasNext()){
		 System.out.println(itr.next());
		 }
		 System.out.println("--------------------");
		 // Example: Iterating using Enhanced for loop
		 LinkedList<String> g = new LinkedList<String>();
		 g.add("John");
		 g.add("Sara");
		 g.add("Susan");
		 g.add("Betty");
		 g.add("Nathan");
		 System.out.println("The LinkedList elements are: ");
		// Enhanced for each loop
		for (String st: g) {
		 System.out.println(st);
		}
	
	 }
	
	 
	 
	}
 