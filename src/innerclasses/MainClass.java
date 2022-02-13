package innerclasses;

public class MainClass {

	public static void main(String[] args) {
		
		Robot var = new Robot(89);
		var.intro();
		Robot.Brain ref = var.new Brain();
		ref.think();
		Robot.Config ob1= new Robot.Config();
		ob1.printConfig();

	}

}
