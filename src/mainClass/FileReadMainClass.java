package mainClass;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import exceptions.ExceptionsDemo;

public class FileReadMainClass {
	
	public static void main(String[] args)  {
		/*
		 * File var = new File("Sample.txt"); Scanner sc = new Scanner(var);
		 * System.out.println(sc.nextInt());
		 */
		/**while(sc.hasNext()) {
			System.out.println(sc.nextLine());
		}**/
		/*
		 * String filename="D:\\input.txt"; File var2=new File(filename); Scanner sc2 =
		 * new Scanner(var2); //System.out.println(sc2.nextInt()); int count =0;
		 * while(sc2.hasNext()) { System.out.println("Line "+count+": "+sc2.nextLine());
		 * count++; }
		 */
		ExceptionsDemo ob = new ExceptionsDemo();
		try {
			ob.readFile();
		} catch (FileNotFoundException e) {
			System.out.println("Handling exception in method calling class");
		}
		
		
		
		
	}

}
