package tryWithResources;

public class Temp implements AutoCloseable {

	
	  @Override public void close() throws Exception {
	  System.out.println("Executing Close Method");
	  
	  }
	 
	
	public void dummy() {
		System.out.println("Executing dummy method");
	}

}
