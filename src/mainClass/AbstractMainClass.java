package mainClass;

import abstractClass.Java;
import abstractClass.Spring;

public class AbstractMainClass {

	public static void main(String[] args) {
		
		Java job = new Spring();
		job.print();
		job.printFramework();
		job.say();
		

	}

}
