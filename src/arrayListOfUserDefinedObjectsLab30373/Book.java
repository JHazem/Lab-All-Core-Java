package arrayListOfUserDefinedObjectsLab30373;

import java.util.ArrayList;

/*
	 Since ArrayList supports generics, you can create an ArrayList of any data type. 
	 It can be of simple types such as Integer, String, or Double, 
	 or complex types such as an ArrayList of ArrayLists, an ArrayList of HashMaps, 
	 or an ArrayList of any user-defined objects.
	In the following lab, you will learn how to create an ArrayList of user-defined objects. 
	We will utilize Arraylist, constructors, getters, and setters. This concept is very 
	important for future lectures such as DAO, Hibernate, and Spring Boot.
	Step 1: Create a new Java project and create a new Class named “Book,” 
	and then add the code below in the Book class.

 */
public class Book {

	
	  private  int number;
	  private  String name;
	  private String author;
	  private  String category;
	  
	  // Constructor with arguments
	  public Book(int number, String name, String author, String category){
	     this.name = name;
	     this.category = category;
	     this.author = author;
	     this.number = number;
	  }
	  
	  // Constructor without arguments
	  public Book(){ 
	  }
	  
	  public int getNumber() {
	     return number;
	  }
	  public void setNumber(int number) {
	     this.number = number;
	  }
	  public String getName1() {
	     return name;
	  }
	  public void setName(String name1) {
	     this.name = name1;
	  }
	  public String getAuthor() {
	     return author;
	  }
	  public void setAuthor(String author) {
	     this.author = author;
	  }
	  public String getCategory() {
	     return category;
	  }
	  public void setCategory(String category) {
	     this.category = category;
	  }

}
	  /*
	   Step 2: Create a new Class named “AddDataToArrayList,” 
	   and add the code below in the AddDataToArrayList class.
	   */
	  
	   class AddDataToArrayList {
	    public  ArrayList<Book> bookdetails() {
	        //User-defined class objects in Java ArrayList
	      
	       ArrayList<Book> list = new ArrayList<Book>();
	       // Passing data using Constructors
	        Book b1 = new  Book(1, "Death note", "John", "cartoon");
	        Book b2 = new Book(2, "Stranger Things", "brothers", "suspense");
	        Book b3 = new Book(3, "Spider man", "Alex", "Kids");
	        Book b4 = new Book(4, "GentleMen", "Max", "Action");
	        // Passing data using setter
	        Book b5 = new Book();
	        b5.setNumber(5);
	        b5.setName("Java FullStack");
	        b5.setAuthor("Flex");
	        b5.setCategory("Programming");
	       // Adding Books objects to Arraylist
	       list.add(b1);
	       list.add(b2);
	       list.add(b3);
	       list.add(b4);
	       list.add(b5);
	       return list;
	     }
	  }
	   
	  /*
	   Step 3: Create a new Class named “showData,” and add the code below in the showData class.
	   */
	  
	   class showData {
			public static void main(String[] args) {
				
		  // instantioation to class AddDataToArrayList   
		  AddDataToArrayList b = new AddDataToArrayList();
		  ArrayList<Book> mybooklist = b.bookdetails();
		         for(Book showValue: mybooklist) {
		     // ---- invoking getter method for geting Data---------       
				  System.out.println(showValue.getNumber() + " " + showValue.getName1() +" "+ 
				     showValue.getCategory() +" "+ showValue.getAuthor());
		         }
		}
	   }
