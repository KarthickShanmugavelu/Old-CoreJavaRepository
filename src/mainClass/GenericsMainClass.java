package mainClass;

import java.util.ArrayList;

import downcasting.Machine;
import genericsAndWildcards.Mother;
import genericsAndWildcards.Son;

public class GenericsMainClass {
	
	public static void main(String[] args) {
		ArrayList<Mother> ob1=new ArrayList<>();
		ob1.add(new Mother());
		ob1.add(new Mother());
		ArrayList<Son> ob2=new ArrayList<>();
		ob2.add(new Son());
		ob2.add(new Son());
		GenericsMainClass.show(ob2);
		}
	public static void show(ArrayList<? super Son> obj) {
		for(Object obj2:obj) {
			System.out.println(obj2.toString());
			//obj2.motherSpecific();
			}
	}

}
