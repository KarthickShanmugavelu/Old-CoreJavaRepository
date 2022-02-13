package exceptions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionsDemo {
	
	public ExceptionsDemo() {
		
	}
	
	public void readFile() throws FileNotFoundException {
		String var1="C://file1.txt";
		File var2 = new File(var1);
		try {
			Scanner sc = new Scanner(var2);
		}
	finally{
	System.out.println("Line after try catch");
	}
	}

}
