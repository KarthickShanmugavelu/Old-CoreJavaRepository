package sorting_collections;

public class SelectionSort {
	
	public static void main(String[] args) {
		int[] arr = new int[]{23,45,12,89,56,1,67,0};
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("================= Selection Sort =================");
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" | ");
		}
		System.out.println(); 
		System.out.println("=================================================");
		
		for(int i=0;i<arr.length;i++) {
			for(int j=i+1;j<arr.length-i-1;j++) {
				if(arr[i]>arr[j]) {
					int temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
			}
		}
		System.out.println("================= Bubble Sort =================");
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" | ");
		}
		System.out.println(); 
		System.out.println("=================================================");
		}
	}
