package downcasting;

public class Camera extends Machine {

	@Override
	public void start() {
		System.out.println("Camera as machine is started");
	}
	
	public void snap() {
		System.out.println("Snap is taken");
	}
	
	

}
