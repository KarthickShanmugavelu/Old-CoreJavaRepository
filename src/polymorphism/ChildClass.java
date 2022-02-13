package polymorphism;

public class ChildClass extends ParentClass {
	
	public ChildClass() {
	varParent=44;
	}

	@Override
	public void testMethod() {
		System.out.println("Common method overridden in child class");
	}

	public void onlyChild() {
		System.out.println("Method only in Child class");
	}
	
	public static void exStatic() {
		System.out.println("Static Method for testing");
	}
}
