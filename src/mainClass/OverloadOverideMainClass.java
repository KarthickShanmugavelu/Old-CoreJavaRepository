package mainClass;

import polymorphism.OverloadOveride;

public class OverloadOverideMainClass extends OverloadOveride {
	
	byte a;
	short b;
	int c;
	float d=9.987f;
	char e;
	double f;
	long g;
	
	@Override
	public void overrideMethod() {
		System.out.println("After Method is overriden");
	}
	
	public static void main(String args[]) {
		OverloadOverideMainClass ob1= new OverloadOverideMainClass();
		OverloadOveride ob2 = new OverloadOveride();
		ob1.method1(3, 4);
		ob1.method1(1, 2, "sam");
		ob1.overrideMethod();
		ob2.overrideMethod();
		OverloadOveride ob3=new OverloadOverideMainClass();
		ob3.overrideMethod();
		System.out.println(Long.MAX_VALUE);
		
		
		
	}


}
