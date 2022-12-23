package arrayListandArrayListMethods;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/*
Example 1: Creating an ArrayList and Adding New Elements
This example shows:
How to create an ArrayList using the ArrayList() constructor.
How to add new elements to an ArrayList using the add() method.
Create a class named “CreateArrayListExample” and add the code below:
 */
public class CreateArrayListExample {


    public static void main(String[] args) {
    	
        // Creating an ArrayList of String
        List<String> animals = new ArrayList<>();

        // Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");

        System.out.println("----------- Output for example 1 -------------");
        System.out.println();

        System.out.println(animals);

  // Adding an element at a particular index in an ArrayList
        animals.add(2, "Elephant");

        System.out.println(animals);
        
        System.out.println("\n----------- Output for example 2 -------------");
        /*
         Example 2: Creating an ArrayList From Another Collection
		This example shows:
		How to create an ArrayList from another collection using the ArrayList(Collection
		 c) constructor.
		How to add all of the elements from an existing collection to the new ArrayList using 
		the addAll() method.
		
		Create a new class named “CreateArrayListFromCollectionExample” and 
		add the code below in that class.
         */
        
        List<Integer> firstFivePrimeNumbers = new ArrayList<>();
        firstFivePrimeNumbers.add(2);
        firstFivePrimeNumbers.add(3);
        firstFivePrimeNumbers.add(5);
        firstFivePrimeNumbers.add(7);
        firstFivePrimeNumbers.add(11);

        // Creating an ArrayList from another collection
        List<Integer> firstTenPrimeNumbers = new ArrayList<>(firstFivePrimeNumbers);

        List<Integer> nextFivePrimeNumbers = new ArrayList<>();
        nextFivePrimeNumbers.add(13);
        nextFivePrimeNumbers.add(17);
        nextFivePrimeNumbers.add(19);
        nextFivePrimeNumbers.add(23);
        nextFivePrimeNumbers.add(29);

        // Adding an entire collection to an ArrayList
        firstTenPrimeNumbers.addAll(nextFivePrimeNumbers);
        System.out.println();

        System.out.println(firstTenPrimeNumbers);
        
        
        System.out.println("\n----------- Output for example 3 -------------");
        System.out.println();

        /*
         Example 3: Accessing Elements from an ArrayList
			This example shows:
			The use of the isEmpty() method to check if an ArrayList is empty.
			The use of the size() method to find the size of an ArrayList.
			The use of the get() method to access an element at a particular index in an ArrayList.
			The use of the set() method to modify the element at a particular index in an ArrayList.
			Create a new class named “CreateArrayListFromCollectionExample” 
			and add the code below in that class.

         */
        
        List<String> topCompanies = new ArrayList<>();

        // Check if an ArrayList is empty
        System.out.println("Is the topCompanies list empty? : " + topCompanies.isEmpty());

        topCompanies.add("Google");
        topCompanies.add("Apple");
        topCompanies.add("Microsoft");
        topCompanies.add("Amazon");
        topCompanies.add("Facebook");

        // Find the size of an ArrayList
        System.out.println("Here are the top " + topCompanies.size() + " companies in the world");
        System.out.println(topCompanies);

        // Retrieve the element at a given index
        String bestCompany = topCompanies.get(0);
        String secondBestCompany = topCompanies.get(1);
        String lastCompany = topCompanies.get(topCompanies.size() - 1);

        System.out.println("Best Company: " + bestCompany);
        System.out.println("Second Best Company: " + secondBestCompany);
        System.out.println("Last Company in the list: " + lastCompany);

        // Modify the element at a given index
        topCompanies.set(4, "Walmart");
        System.out.println("Modified top companies list: " + topCompanies);

        System.out.println("\n----------- Output for example 4 -------------");
        System.out.println();

        /*
         Example 4: Removing Elements from an ArrayList
		This example shows:
		How to remove an element at a given index in an ArrayList | remove(int index).
		How to remove an element from an ArrayList | remove(Object o).
		How to remove all of the elements from an ArrayList that exist 
		in a given collection | removeAll().
		How to remove all of the elements matching a given predicate | removeIf().
		How to clear an ArrayList | clear().
		
		Create a new class named “RemoveElementsFromArrayList” and add the code below in that class.

         */
        
        List<String> programmingLanguages = new ArrayList<>();
        programmingLanguages.add("C");
        programmingLanguages.add("C++");
        programmingLanguages.add("Java");
        programmingLanguages.add("Kotlin");
        programmingLanguages.add("Python");
        programmingLanguages.add("Perl");
        programmingLanguages.add("Ruby");

        System.out.println("Initial List: " + programmingLanguages);

        // Remove the element at index `5`
        programmingLanguages.remove(5);
        System.out.println("After remove(5): " + programmingLanguages);

        // Remove the first occurrence of the given element from the ArrayList
        // (The remove() method returns false if the element does not exist in the ArrayList)
        boolean isRemoved = programmingLanguages.remove("Kotlin");
        System.out.println("After remove(\"Kotlin\"): " + programmingLanguages);
     // Remove all the elements that exist in a given collection
        List<String> scriptingLanguages = new ArrayList<>();
        scriptingLanguages.add("Python");
        scriptingLanguages.add("Ruby");
        scriptingLanguages.add("Perl");

        programmingLanguages.removeAll(scriptingLanguages);
        System.out.println("After removeAll(scriptingLanguages): " + programmingLanguages);

        // Remove all elements from the ArrayList
        programmingLanguages.clear();
        System.out.println("After clear(): " + programmingLanguages);

        
        
        System.out.println("\n----------- Output for example 5 -------------");
        System.out.println();

        /*
         Example 5: Iterating over an ArrayList
			The following example shows how to iterate over an ArrayList using:
			iterator().
			iterator() and forEachRemaining() method.
			listIterator().
			Simple for loop.
			Enhanced for loop with index.
			Create a new class named “IterateOverArrayList” and add the code below in that class.

         */
        
        List<String> tvShows = new ArrayList<>();
        tvShows.add("Breaking Bad");
        tvShows.add("Game Of Thrones");
        tvShows.add("Friends");
        tvShows.add("Prison break");
        System.out.println("\n=== Iterate using an iterator() ===");
        Iterator<String> tvShowIterator = tvShows.iterator();
        while (tvShowIterator.hasNext()) {
           String tvShow = tvShowIterator.next();
           System.out.println(tvShow);
        }

   System.out.println("==Iterate using an iterator() and forEachRemaining() method ===");
        tvShowIterator = tvShows.iterator();
        tvShowIterator.forEachRemaining(tvShow -> {
           System.out.println(tvShow);
        });


        System.out.println("\n=== Iterate using simple for-each loop ===");
        for(String tvShow: tvShows) {
           System.out.println(tvShow);
        }

        System.out.println("\n=== Iterate using for loop with index ===");
        for(int i = 0; i < tvShows.size(); i++) {
        	System.out.println(tvShows.get(i));
        }
        System.out.println("\n=== Iterate iterator ===");
        ListIterator iterator = tvShows.listIterator();
        System.out.println("Elements in forward direction");

        System.out.println("\n====== Iterate using while loop=======");

        while (iterator.hasNext())
        {
           System.out.println(iterator.next());
        }

        System.out.println("=========Elements in backward direction======");

        while (iterator.hasPrevious())
        {
           System.out.println(iterator.previous());
        }

        System.out.println("\n----------- Output for example 6 -------------");
        System.out.println();

        /*
         The example below shows how to:
			Check if an ArrayList contains a given element | contains().
			Find the index of the first occurrence of an element in an ArrayList | indexOf().
			Find the index of the last occurrence of an element in an ArrayList | lastIndexOf().
			Create a new class named “SearchElementsInArrayListExample” and add the code below in that class.

         */
        
        List<String> names = new ArrayList<>();
        names.add("John");
        names.add("Alice");
        names.add("Bob");
        names.add("Steve");

        names.add("John");
        names.add("Steve");
        names.add("Maria");

      // Check if an ArrayList contains a given element
        System.out.println("Does names array contain \"Bob\"? : " + names.contains("Bob"));

      // Find the index of the first occurrence of an element in an ArrayList
        System.out.println("indexOf \"Steve\": " + names.indexOf("Steve"));
        System.out.println("indexOf \"Mark\": " + names.indexOf("Mark"));

      // Find the index of the last occurrence of an element in an ArrayList
        System.out.println("lastIndexOf \"John\" : " + names.lastIndexOf("John"));
        System.out.println("lastIndexOf \"Bill\" : " + names.lastIndexOf("Bill"));

        
        
     }
 }


