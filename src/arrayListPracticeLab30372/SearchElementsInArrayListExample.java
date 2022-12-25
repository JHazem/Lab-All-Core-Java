package arrayListPracticeLab30372;

import java.util.ArrayList;
import java.util.List;

// Example 6: Searching for Elements in an ArrayList

public class SearchElementsInArrayListExample {

	public static void main(String[] args) {
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
	/*
	 
	 # Output
	Does names array contain "Bob"? : true
	indexOf "Steve": 3
	indexOf "Mark": -1
	lastIndexOf "John" : 4
	lastIndexOf "Bill" : -1
	 */
}
