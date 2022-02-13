package interfaces;

public class Mobile implements OperatingSystem,Specifications {
	
	String os="Android";
	String ram="intel core 8th gen";

	@Override
	public void printSpec() {
		System.out.println("OS is :"+ os);
		
	}

	@Override
	public void printOs() {
		System.out.println("RAM is :"+ ram);
		
	}

}
