package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObject {
	
	public static void main(String[] args) {
		File file = new File("sample.bin");
		try(FileInputStream fob = new FileInputStream(file)){
			ObjectInputStream ref1 = new ObjectInputStream(fob);
			System.out.println(ref1.readObject());
			ArrayList<Person> a1=(ArrayList<Person>)ref1.readObject();
			for(Person person:a1) {
				System.out.println(person);
			}
			/*
			 * do { a1 = (Person) ref1.readObject(); System.out.println(a1.toString());
			 * }while(a1 != null);
			 */
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("File is read");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(char[] args) {
		
		System.out.println("2nd main");
		
	}

}
