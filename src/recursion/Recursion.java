package recursion;

public class Recursion {

	public static void main(String[] args) {
		
	System.out.println(factorial(5));
	}
	
	public static int factorial(int value) {
		
		System.out.println("Value in factorial: "+value);
		
		if(value==1) {
			return 1;
		}
		
		
		return factorial(value-1);
		
	}
	
	
}
