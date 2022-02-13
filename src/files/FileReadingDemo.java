package files;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class FileReadingDemo {
	
	public static void main(String[] args) {
		File filename = new File("Sample.txt");
		try {
			FileReader fr = new FileReader(filename);
			BufferedReader br = new BufferedReader(fr);
			String line;
			while((line=br.readLine())!=null) {
				System.out.println(line);
			}
			br.close();
		} catch (FileNotFoundException e) {
			System.out.println("Unable to find file"+filename.toString());
		} catch (IOException e) {
			System.out.println("Unable to read file"+filename.toString());
		}
		
	}
}
		

