package com.perscholas;


/*
 Create a class named DemoClass. As shown below, 
 we will create a generic method in this class:
 */
class DemoClass {

	  // create a generics method
	  public <T> void genericsMethod(T data) {
	    System.out.println("Generics Method:");
	    System.out.println("Data Passed: " + data);
	  }
} 
	
/*
 Create a class named myRunner. In this class, we will invoke the generic method.
 */
public class LABGenericMethodAndClass {

	public static void main(String[] args) {
	// initialize the class with Integer data
	   DemoClass dObj = new DemoClass();
	   
	   dObj.genericsMethod(25); // passing int
	   dObj.genericsMethod("Per Scholas"); // passing String
	   dObj.genericsMethod(2563.5); // passing float
	   dObj.genericsMethod('H'); // passing Char
	}
}
