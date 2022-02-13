package interfaces;

public class Iphone implements OperatingSystem,Specifications {
	
	String os="MAC OS";
	String ram="Apple core processor";

	@Override
	public void printSpec() {
		System.out.println("OS is :"+ os);
		
	}

	@Override
	public void printOs() {
		System.out.println("RAM is :"+ ram);
		
	}
	
	public void speciality() {
		System.out.println("All are apple products");
	}
	
	

}
