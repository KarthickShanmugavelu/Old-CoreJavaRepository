package mainClass;

import downcasting.Camera;
import downcasting.Machine;

public class DowncastingMainClass {
	
	public static void main(String[] args) {
		Machine ref= new Camera();
		Camera ref1=(Camera)ref;
		ref1.snap();
		ref1.start();
		Machine ref2=new Machine();
		Camera ref3=(Camera) ref2;
		ref3.snap();
	}
	

}
