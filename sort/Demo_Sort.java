package dsa.java;

import java.util.Arrays;

public class Demo_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr= {10,5,26,3,15,22};
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
	}

}
