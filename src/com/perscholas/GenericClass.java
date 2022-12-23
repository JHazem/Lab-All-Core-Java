package com.perscholas;

/*
 A class can have more than one type parameter. 
 In this case, the type parameters are separated by a comma.

For the demonstration, we will initialize two  type parameters  in the Generic class. 
The names of the parameter types will be Datatypeone and DatatypeTwo, but these are only names. 
You are free to use “X” or “Z,” or any other identifier to name parameters.
 
Create a class named GMultipleDatatype: Write the below code.
 */

class GMultipleDatatype  <Datatypeone, DatatypeTwo>  {
	   Datatypeone valueOne;
	   DatatypeTwo valueTwo;

	   public GMultipleDatatype(Datatypeone v1, DatatypeTwo v2)
	   {
	       this.valueOne = v1;
	       this.valueTwo = v2;
	   }

	   public Datatypeone getValueOne() {
	       return valueOne;
	   }

	   public void setValueOne(Datatypeone valueOne) {
	       this.valueOne = valueOne;
	   }

	   public DatatypeTwo getValueTwo() {
	       return valueTwo;
	   }

	   public void setValueTwo(DatatypeTwo valueTwo) {
	       this.valueTwo = valueTwo;
	   }
	}


// Create a class named MyRunner(GenericClass) as shown below:



public class GenericClass {

	public static void main(String[] args) {

		// initialize generic class
	       // with String and Integer data
	       
	       GMultipleDatatype<String, Integer> mobj = new GMultipleDatatype("Per Scholas", 11025);

	       System.out.println(mobj.getValueOne());
	       System.out.println(mobj.getValueTwo());
	       
	         // initialize generic class
	       // with String and String data
	       GMultipleDatatype<String, String> mobj2 = new GMultipleDatatype("Per Scholas", "Non profit");
	       System.out.println(mobj2.getValueOne());
	       System.out.println(mobj2.getValueTwo());
	}
}

