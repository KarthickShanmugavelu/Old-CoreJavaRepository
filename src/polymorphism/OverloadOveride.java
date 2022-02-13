package polymorphism;

public class OverloadOveride {
	
	public void method1(int a, int b) {
		
		System.out.println("Parameter 1:"+a+"Parameter 2:"+b);
	}
	
	public void method1(int a, int b,String c) {
		
		System.out.println("Parameter 1:"+a+"Parameter 2:"+b+"Parameter 3:"+c);
		
	}
	
	public void overrideMethod() {
		System.out.println("Before Method is overriden");
	}
}
