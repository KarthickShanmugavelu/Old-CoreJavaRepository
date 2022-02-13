package serialization;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

public class ReadObj1 {
	
	public static void main(String[] args) {
		
		File file = new File("test.bin");
		
		try(FileInputStream fi = new FileInputStream(file);ObjectInputStream oi = new ObjectInputStream(fi)){
			
			//Person[] people = (Person[])oi.readObject();
			//@SuppressWarnings("unchecked")
			//ArrayList<Person> people = (ArrayList<Person>)oi.readObject();
			
			int index=oi.readInt();
			System.out.println(index);
			for(int i=0;i<index;i++) {
			
				Person p1 = (Person)oi.readObject();
				System.out.println(p1);
			}
			
			/*
			 * for(Person peop:people) { System.out.println(peop); }
			 */
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
