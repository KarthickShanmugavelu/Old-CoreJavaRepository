package serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class WriteObject {

	public static void main(String[] args) {
		
		Person aob = new Person(5, "Karthick");
		Person bob = new Person(6, "Naveen");
		List<Person> list1 = new ArrayList();
		list1.add(aob);
		list1.add(bob);
		File file = new File( "sample.bin");
		try(FileOutputStream ref = new FileOutputStream(file)){
			
			ObjectOutputStream os = new ObjectOutputStream(ref);
			for(Person obj1:list1) {
			os.writeObject(obj1);
			}
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
