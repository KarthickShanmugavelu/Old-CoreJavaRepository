package files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWritingDemo {
	
	public static void main(String args[]) throws FileNotFoundException {
		
		File file = new File("WriteDemo.txt");
		try(BufferedWriter br = new BufferedWriter(new FileWriter(file))){
			br.write("This is line one");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
	}

}
