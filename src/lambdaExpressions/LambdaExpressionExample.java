package lambdaExpressions;

interface Executable {
	int execute(int a,int b);
}

interface StringExecutable{
	int execute(String s);
}

class Runner {
	public void run(Executable e) {
		System.out.println("Executing run method of Runner...");
		int value=e.execute(55,65);
		System.out.println("Returned Value in execute method: "+value);
	}
	public void run(StringExecutable e) {
		System.out.println("Executing run method of Runner...");
		int value=e.execute("Che");
		System.out.println("Returned Value in execute method: "+value);
	}
}

public class LambdaExpressionExample {

	public static void main(String[] args) {

		 int d= 100;
		Runner runner = new Runner();
		runner.run(new Executable() {

			@Override
			public int execute(int a,int b) {
				System.out.println("Executing execute method using anonymous class");
				return a+b+d;
			}
		});

		System.out.println("*******Using Lambda Expression*******");

		/*
		 * Single line implementation using Lambda expression runner.run(() ->
		 * System.out.println("Executing execute method using Lambda expression"));
		 */

		/*
		 *Multiline implementation using Lambda expression 
		 * runner.run(() -> {
		 * System.out.println("Multiline implmentation using Lambda Expresion");
		 * System.out.println("Line 2 of multiline implementation"); });
		 */
		
		/*
		 * Executing method with return value using lambda expression runner.run(()->{
		 * System.out.
		 * println("Executing method with return value using lambda expression"); return
		 * 19; });
		 */
		
		/*
		 * If the method implementation is only returning a single value then below are
		 * the various ways to do that. runner.run(() -> 8); runner.run(() ->{return
		 * 8;});
		 */
		
		/*
		 * If the method in functional interface is having paramters below methods can be used. runner.run((int
		 * a)->{System.out.println("The paramter value is : "+a); return a; });
		runner.run((b)->{
			System.out.println("The paramter value is : "+b); return b; 
		});
		
		runner.run(b -> {
			System.out.println("The paramter value is : "+b); return b; 
		});*/
		
		/*
		 * Incase of ambiguity the type of parameter is explicitly mentioned.
		 * runner.run((String arg) -> { System.out.println("The argument is: "+arg);
		 * return 0; });
		 */
		
		/*
		 * Incase of multiple parameters and no ambiguity runner.run((a,b) -> a+b);
		*/
		/*
		 * can access only effectively final & final varibles in anonymous class and
		 * lambd expresion runner.run((a,b)->a+b+d);
		 */
		
		/*
		 * runner.run((a,b)->{ int d=87;//can't do this coz lambda expression doesn't
		 * have its own new scope. return a+b+d; });
		 */
		
		//Passing lambda expressions as objects
		Executable ex = (a,b) -> a+b+d;
		
		runner.run(ex);
		
		//Casting to super class
		Object obj = (Executable)(a,b)->a+b+d+25;
		
		runner.run((Executable) obj);
		
		
		
		
		
		
		
		
		
		
		

	}

}
