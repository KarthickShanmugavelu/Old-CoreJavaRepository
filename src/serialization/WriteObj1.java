package serialization;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class WriteObj1 {

	public static void main(String[] args) {

		Person[] people = { new Person(1, "Che"), new Person(2, "Fidel"), new Person(3, "Bheem") };
		Person.setCount(345);
		ArrayList<Person> ref = new ArrayList(Arrays.asList(people));
		File file = new File("test.bin");

		try (FileOutputStream fs = new FileOutputStream(file); ObjectOutputStream os = new ObjectOutputStream(fs)) {

			os.writeInt(ref.size());
			for (Person temPerson : ref) {
				os.writeObject(temPerson);

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
