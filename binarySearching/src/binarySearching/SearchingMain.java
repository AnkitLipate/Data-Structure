package binarySearching;

import java.util.Arrays;
import java.util.Scanner;

public class SearchingMain {

	public static int binarySearch(int[] arr, int key) {
		int left=0, right=arr.length-1, mid;
		
			
		while(left<=right) {
			mid  = (left + right )/2;
			if(key==arr[mid])
				return mid;
			if(key < arr[mid])
				right = mid-1;
			else
				left = mid+1;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = { 88, 33, 66, 99, 44, 77, 22, 55, 11 };
		Arrays.sort(arr);
		
		System.out.print("Enter key to Search: ");
		int key = sc.nextInt();
		int index = binarySearch(arr, key);
		
		if(index != -1)
			System.out.println("key found at index: "+index);
		else
			System.out.println("key not found.");
	}

}
