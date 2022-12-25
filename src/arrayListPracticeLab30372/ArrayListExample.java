package arrayListPracticeLab30372;

import java.util.ArrayList;
import java.util.List;

// Example 1: Creating an ArrayList and Adding New Elements

public class ArrayListExample {

	public static void main(String[] args) {
		// Creating an ArrayList of String
		List<String> animals = new ArrayList<>();
		// Adding new elements to the ArrayList
        animals.add("Lion");
        animals.add("Tiger");
        animals.add("Cat");
        animals.add("Dog");
        System.out.println(animals);

        // Adding an element at a particular index in an ArrayList
        animals.add(2, "Elephant");
        System.out.println(animals);
	}

	/*
	 * # Output
	[Lion, Tiger, Cat, Dog]
	[Lion, Tiger, Elephant, Cat, Dog]
	 */
}



