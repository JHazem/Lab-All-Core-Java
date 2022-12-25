package arrayListPracticeLab30372;

import java.util.ArrayList;
import java.util.List;

// Example 3: Accessing Elements from an ArrayList
public class AccessElementsFromArrayListExample {

	public static void main(String[] args) {
		
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

    }
/*
 	# Output
		Is the topCompanies list empty? : true
		Here are the top 5 companies in the world
		[Google, Apple, Microsoft, Amazon, Facebook]
		Best Company: Google
		Second Best Company: Apple
		Last Company in the list: Facebook
		Modified top companies list: [Google, Apple, Microsoft, Amazon, Walmart]
 */

}
