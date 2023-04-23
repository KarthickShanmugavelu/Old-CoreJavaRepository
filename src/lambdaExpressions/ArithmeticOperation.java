package lambdaExpressions;

class ProcessOperands{
	
	public void add(ArithmeticInterface iobj,int a,int b) {
		
		int sum = iobj.sum(a,b);
		System.out.println("The sum is: "+sum);
		
	}
}

public class ArithmeticOperation {
	
	public static void main(String args[]) {
		ProcessOperands pobj = new ProcessOperands();
		pobj.add((int a,int b)->{return a+b;},9,410);
	}
	

}
