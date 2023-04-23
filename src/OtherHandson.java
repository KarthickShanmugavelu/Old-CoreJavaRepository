import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class OtherHandson {

	public static void main(String[] args) {
	
		String[] arr = new String[]{"5","2","C","D","+"};
		ArrayList<String> temp = new ArrayList<>();
		int tempIndex=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i].toCharArray()[0]=='C') {
				temp.remove(temp.size()-1);
			}
			else if(arr[i].toCharArray()[0]=='+') {
				temp.add(String.valueOf(Integer.parseInt(temp.get(temp.size()-1))+Integer.parseInt(temp.get(temp.size()-2))));
		
			}
			else if(arr[i].toCharArray()[0]=='D') {
				temp.add(String.valueOf(Integer.parseInt(temp.get(temp.size()-1))*2));
			}
			else {
				temp.add(arr[i]);
			}
		}
		for(int i=0;i<temp.size();i++) {
			tempIndex=tempIndex+Integer.parseInt(temp.get(i));
		}
		System.out.println(tempIndex);
		
		Set<Integer> setObj=new HashSet<>();
		int[] arr2 = new int[] {1,2,3,4,5,5,6};
		Arrays.sort(arr2);
		for(int i=0;i<arr2.length;i++) {
			if(!setObj.add(arr2[i])) {
			System.out.println("Duplicate: "+arr2[i]);	
			}
		}
		Integer[] arr3=new Integer[setObj.size()];
		setObj.toArray(arr3);
		Arrays.sort(arr3);			
		int n=arr2[0];
		for(int i=0;i<arr2.length;i++) {
			if(i==arr3.length) {
				System.out.println("Missing: "+n);
				break;
			}
			if(n!=arr3[i]) {
				System.out.println("Duplicate: "+n);
			}
			n++;
		}
		
		
    }
	

}
