package mainClass;

import polymorphism.ChildClass;
import polymorphism.ParentClass;

public class PolymorphismMainClass {
	
	public static void main(String[] args) {
		ParentClass ob1 = new ChildClass();
		ob1.testMethod();
		ob1.onlyParent();
		System.out.println(ob1.varParent);
		//ob1.onlyChild();
		ChildClass ob2 = new ChildClass();
		ob2.exStatic();
		System.out.println(ob2.varParent);
		ParentClass ob3 = new ParentClass();
		System.out.println(ob3.varParent);
		
	}

}
