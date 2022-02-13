package exceptions;

public class UncheckedExceptions {
	public int val;
	public String text;
	public int[] a= {1,2,3};
	public UncheckedExceptions() {
	try {
	  val = 55/0;
	  text=null;
	  
	}
	catch(Exception e) {
		System.out.println("Unchecked Exception handled");
		
	}
	}
	
	

}
