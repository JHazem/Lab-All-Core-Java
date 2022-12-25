package arrayListPracticeLab30372;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

		//---------------------- S - 43 -------------------------
		//Sort an ArrayList Using Collections.sort() Method
public class ArrayListCollectionsSortExacmple {

	public static void main(String[] args) {
		
		//  create an ArrayList
		ArrayList<Integer> numbers = new ArrayList<>();
		 numbers.add(13);
		 numbers.add(7);
		 numbers.add(18);
		 numbers.add(5);
		 numbers.add(2);
		 System.out.println("Before : " + numbers);
		 // Sorting an ArrayList using Collections.sort() method
		 Collections.sort(numbers);
		 System.out.println("After : " + numbers);
	
		 /*
		    # Output
			Before : [13, 7, 18, 5, 2]
			After : [2, 5, 7, 13, 18]
		  */
		// ---------------------- S - 44 -------------------------
		//Sort an ArrayList Using Arraylist.sort() and Comparator
		
		 // create an ArrayList
		 ArrayList<String> languages = new ArrayList<>();
		 // add elements to ArrayList
		 languages.add("Python");
		 languages.add("Swift");
		 languages.add("C");
		 languages.add("JavaScript");
		 System.out.println("Unsorted ArrayList: " + languages);
		 // sort the ArrayList in ascending order
		 languages.sort(Comparator.reverseOrder());
		 System.out.println("Sorted ArrayList: " + languages);

		 /*
		   Output
		   Unsorted ArrayList: [Python, Swift, C, JavaScript]
		   Sorted ArrayList: [Swift, Python, JavaScript, C]
		  */
	}
}
	
