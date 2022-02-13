package mainClass;

import interfaces.Iphone;
import interfaces.Mobile;
import interfaces.OperatingSystem;
import interfaces.Specifications;

public class InterfacesMainClass {

	public static void main(String[] args) {
		Mobile ob = new Mobile();
		OperatingSystem ob1=new Iphone();
		Specifications ob2=new Iphone();
		Iphone ob3= new Iphone();
		
		ob.printOs();
		ob.printSpec();
		ob1.printOs();
		ob2.printSpec();
		Specifications.onlyspec();
		ob3.speciality();
		

	}

}
