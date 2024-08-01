package dsa.java;

public class Sort {
	public static void SelectionSort_asc(int arr[]) {
		for (int i=0;i<arr.length;i++) {
			int minIndex=i;
			for (int j=i+1;j<arr.length;j++) {
				if(arr[j]<arr[minIndex]) {
					minIndex=j;
				}
			}
			int temp=arr[i];
			arr[i]=arr[minIndex];
			arr[minIndex]=temp;
		}
		
	}
	
	public static void SelectionSort_dsc(int arr[]) {
		for (int i=0;i<arr.length-1;i++) {
			int minIndex=i;
			for (int j=i;j<arr.length;j++) {
				if(arr[j]>arr[minIndex]) {
					minIndex=j;
				}
			}
			int temp=arr[minIndex];
			arr[minIndex]=arr[i];
			arr[i]=temp;
		}
		
	}
	
	public static void bobbleSort_asc(int[] arr) {
		for (int i=1;i<arr.length;i++) {
			boolean swaped=false;
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]>arr[j+1]) {
					swaped=true;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				if(!swaped) {
					break;
				}
			}
		}
	}
	
	public static void bobbleSort_dsc(int[] arr) {
		for (int i=1;i<arr.length;i++) {
			boolean swaped=false;
			for(int j=0;j<arr.length-i;j++) {
				if(arr[j]<arr[j+1]) {
					swaped=true;
					int temp=arr[j];
					arr[j]=arr[j+1];
					arr[j+1]=temp;
				}
				if(!swaped) {
					break;
				}
			}
		}
	}
	
	public static void insertionSort(int[] arr) {
		for (int i=0;i<arr.length;i++) {
			for(int j=i;j>0;j--) {
				if(arr[j]<arr[j-1]) {
					int temp=arr[j];
					arr[j]=arr[j-1];
					arr[j-1]=temp;
				}
				else
					break;
			}
		}
	}
}
