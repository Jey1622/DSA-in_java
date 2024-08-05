package dsa.java;
import java.util.*;

public class mergeSort {
	public static int[] sort(int[] arr) {
		if(arr.length==1)
			return arr;
		
		int mid=arr.length/2;
		
		int[] left=sort(Arrays.copyOfRange(arr,0,mid));
		int[] right=sort(Arrays.copyOfRange(arr,mid,arr.length));
		
		
		return merge(left,right);
	}
	
	public static int[] merge(int[] first,int[] second) {
		int[] joined=new int[first.length+second.length];
		int i=0,j=0,k=0;
		
		while(i<first.length&&j<second.length) {
			if(first[i]<second[j]) {
				joined[k]=first[i];
				k++;
				i++;
			}
			else {
				joined[k]=second[j];
				k++;
				j++;
			}
		}
		while(i<first.length) {
			joined[k]=first[i];
			i++;
			k++;
		}
		while(j<second.length) {
			joined[k]=second[j];
			j++;
			k++;
		}
		return joined;
	}
}
