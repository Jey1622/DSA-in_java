package dsa.java;

import java.util.Arrays;

public class Demo_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10,5,26,3,15,22};
		int[] arr2= {4,71,12,54,25,86,12,9,34,};
		int[] inp= {5,8,4,3,7,6,2,9,5};
		System.out.println("--------SelectionSort---------");
		Sort.SelectionSort_asc(arr);
		System.out.println(Arrays.toString(arr));
		Sort.SelectionSort_dsc(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("--------BubbleSort---------");
		Sort.bobbleSort_asc(arr);
		System.out.println(Arrays.toString(arr));
		Sort.bobbleSort_dsc(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("--------InsertionSort---------");
		Sort.insertionSort(arr);
		System.out.println(Arrays.toString(arr));
		System.out.println("--------MergeSort---------");
		arr2=mergeSort.sort(arr2);
		System.out.println(Arrays.toString(arr2));
		System.out.println("--------QuickSort---------");
		Sort.quickSort(inp, 0, inp.length-1);
		System.out.println(Arrays.toString(inp));
	}

}
