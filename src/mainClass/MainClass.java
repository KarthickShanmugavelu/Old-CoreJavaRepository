package mainClass;

import ocean.*;
import ocean.plants.CoralReefs;
import ocean.plants.Hydrilla;

public class MainClass {

	public static void main(String[] args) {
		
		CoralReefs ob1= new CoralReefs();
		Hydrilla ob2 = new Hydrilla();
		BlueWhale ob3 = new BlueWhale();
		Shark ob4=new Shark();
		
		ob1.printCoralReefs();
		ob3.printBlaueWhale();
		ob4.printShark();
		

	}

}
