package mainClass;

import exceptions.UncheckedExceptions;

public class UncheckedExceptionsMainClass {
	
	public static void main(String args[]) {
		
		UncheckedExceptions aob = new UncheckedExceptions();
		
		  try { System.out.println("Val :"+aob.val);
		  System.out.println("Starting Length");
		  System.out.println("Legth :"+aob.text.length());
		  System.out.println("Ending Length");
		  System.out.println("Array :"+aob.a[9]); } catch(Exception e){
		  System.out.println("Unchecked Exception Occured");
		  
		  }
		 
	}

}
