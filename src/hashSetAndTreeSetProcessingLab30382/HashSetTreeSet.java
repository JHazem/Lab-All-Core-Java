package hashSetAndTreeSetProcessingLab30382;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class HashSetTreeSet {

	/*
	 Example one: Insert Elements to HashSet using addAll().
		addAll() - Inserts all of the elements of the specified collection to the set.
		Create a new Java project and create a new Class named
		“exampleOne.” Write the code below in the class.
	 */
	public static void main(String[] args) {

		HashSet<Integer> evenNumber = new HashSet<>();

		// Using add() method	
		evenNumber.add(2);
		evenNumber.add(4);
		evenNumber.add(6);
		System.out.println("HashSet:     " + evenNumber);
		HashSet<Integer> numbers = new HashSet<>();
		
		// Using addAll() method
		numbers.addAll(evenNumber);
		numbers.add(5);
		System.out.println("New HashSet: " + numbers);
		
		   System.out.println(" ----------------------------------------------\n");

		/*
		 Example two: Union of Sets.
			To perform the union between two sets, we can use the addAll() method.
			Create a new Class named “example two,” and then write the code below in the class.
		 */
		
		HashSet<Integer> evenNumbers = new HashSet<>();
		evenNumbers.add(2);
		evenNumbers.add(4);
		System.out.println("HashSet1: " + evenNumbers);
		HashSet<Integer> numbers2 = new HashSet<>();
		numbers2.add(1);
		numbers2.add(3);
		System.out.println("HashSet2: " + numbers2);
		// Union of two set
		numbers2.addAll(evenNumbers);
		System.out.println("Union is: " + numbers2);
		
		
		   System.out.println("----------------------------------------------\n");

		/*
		 Example three: Difference of Sets.
			To calculate the difference between the two sets, we can use the
			removeAll() method:
			Create a new Class named “examplethree,” and then write the
			code below in the class. */
		
		HashSet<Integer> primeNumbers = new HashSet<>();
		primeNumbers.add(2);
		primeNumbers.add(3);
		primeNumbers.add(5);
		System.out.println("HashSet1: " + primeNumbers);
		HashSet<Integer> oddNumbers = new HashSet<>();
		oddNumbers.add(1);
		oddNumbers.add(3);
		oddNumbers.add(5);
		System.out.println("HashSet2: " + oddNumbers);
		// Difference between HashSet1 and HashSet2
		primeNumbers.removeAll(oddNumbers);
		System.out.println("Difference : " + primeNumbers);
		
		   System.out.println("----------------------------------------------\n");

		/*
		 Example Four: Enhanced for() Loop
			Create a new Class named “examplefour,” and then write the
			code below in the class.*/
		// HashSet declaration
		   
		   
		   HashSet<String> hset = new HashSet<String>();
		   // Adding elements to the HashSet
		   hset.add("Apple");
		   hset.add("Mango");
		   hset.add("Grapes");
		   hset.add("Orange");
		   hset.add("Fig");
		   //Addition of duplicate elements
		   hset.add("Apple");
		   hset.add("Mango");
		   //Addition of null values
		   hset.add(null);
		   hset.add(null);
		   // Using advanced for loop
		   for (String str : hset) {
		   System.out.println(" ---> " + str);
		   }
		   
		   System.out.println("----------------------------------------------\n");


		   /*
		    				TreeSet Examples
		    				
			Example one: Iterate Through TreeSet.
			To access the individual elements of TreeSet, we need to iterate
			through the TreeSet. In other words, traverse through the TreeSet.
			We do this by declaring an Iterator for the TreeSet, and then use this
			Iterator to access each element. For this, we use the next () method
			of an iterator that returns the next element in the TreeSet.
			The following Java program demonstrates the use of the Iterator to
			iterate through TreeSet.*/
		   
		   TreeSet<Integer> num_Treeset = new TreeSet<>();
		   num_Treeset.add(20);
		   num_Treeset.add(5);
		   num_Treeset.add(15);
		   num_Treeset.add(25);
		   num_Treeset.add(10);
		   // Call iterator() method to define Iterator for TreeSet
		   Iterator<Integer> iter_set = num_Treeset.iterator();
		   System.out.print("TreeSet using Iterator: ");
		   // Access TreeSet elements using Iterator
		   while(iter_set.hasNext()) {
		   System.out.print(iter_set.next());
		   System.out.print(", ");
		   
		   }   

		   System.out.println("\n----------------------------------------------");

		   /**
		    * Example two: Remove Elements
				● remove() - removes the specified element from the set.
				● removeAll() - removes all the elements from the set.*/
		   
		   TreeSet<Integer> numbers3 = new TreeSet<>();
		   numbers3.add(2);
		   numbers3.add(5);
		   numbers3.add(6);
		   System.out.println("TreeSet: " + numbers3);
		   // Using the remove() method
		   boolean value1 = numbers3.remove(5);
		   System.out.println("Is 5 removed? " + value1);
		   // Using the removeAll() method
		   boolean value2 = numbers3.removeAll(numbers3);
		   System.out.println("Are all elements removed? " + value2);
		   
		   System.out.println("----------------------------------------------\n");

	
		   /*
		    * Example three: Methods for Navigation.
			Since the TreeSet class implements NavigableSet, it provides various
			methods to navigate over the elements of the TreeSet.
			1. first() and last() Methods
				● first() - returns the first element of the set.
				● last() - returns the last element of the set.*/
		   
		   TreeSet<Integer> numbers1 = new TreeSet<>();
		   numbers.add(2);
		   numbers.add(5);
		   numbers.add(6);
		   System.out.println("TreeSet: " + numbers);
		   // Using the first() method
		   int first = numbers1.first();
		   System.out.println("First Number: " + first);
		   // Using the last() method
		   int last = numbers1.last();
		   System.out.println("Last Number: " + last);
		   
	}

}
