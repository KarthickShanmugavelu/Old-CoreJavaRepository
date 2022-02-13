package collections;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

public class ComplexCollections {
	
	public static void main(String[] args) {
		
		String[] vehicleArray = {"ambulance","helicopter","lifeboat"};
		
		String[][] driversArray = {{"sam","ram","somu"},{"sita","geeta","divi","nivi","kavi"},{"ragu","raj","das","ragu"}};
		
		Map<String,Set<String>> vehicleAndDrivers = new LinkedHashMap<>();
		
		
		
		//Getting values from vehicleArray and driversArray and putting them in Map.
		
		for (int i=0;i<vehicleArray.length;i++) {
			String tempVehicle = vehicleArray[i];
			String[] tempDrivers = driversArray[i];
			
			Set<String> driversSet = new LinkedHashSet<>();
			for(String eachDriver:tempDrivers) {
				driversSet.add(eachDriver);
			}
			vehicleAndDrivers.put(tempVehicle, driversSet);
			
			}

		//Getting values of a single key for a sample.
		System.out.println(vehicleAndDrivers.get("lifeboat"));
		
		//Getting the values of entire map.
		
		  for(String vehicleKey:vehicleAndDrivers.keySet()) { 
			  System.out.print("<Key: "+vehicleKey+" | Values: ");
			  for(String tempdriversSet:vehicleAndDrivers.get(vehicleKey)) {
				  System.out.print(tempdriversSet+" , ");
			  }
			  System.out.print(">");
			  System.out.println();
		  
		  }
		 
		
		
		
		
		
		
		
		
		
	}

}
