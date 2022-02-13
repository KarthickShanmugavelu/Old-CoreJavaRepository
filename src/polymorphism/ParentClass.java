package polymorphism;

public class ParentClass {
	
	public int varParent=22;
	
	public void testMethod() {
		System.out.println("Method in both parent and child class");
	}

	public void onlyParent() {
		System.out.println("Method only in Parent class");
	}
}
