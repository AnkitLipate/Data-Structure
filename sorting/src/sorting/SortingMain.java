package sorting;

import java.util.Arrays;

public class SortingMain {
	public static void bubbleSort(int arr[]) {
		for(int i=0; i<arr.length-1; i++)
		for(int j=0; j<arr.length-1; j++) {
			if(arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	public static void impBubbleSort(int arr[]) {
		for(int i=0; i<arr.length-1; i++)
		for(int j=0; j<arr.length-1-i; j++) {
			if(arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
			}
		}
	}
	
	public static void moreImpBubbleSort(int arr[]) {
		
		for(int i=0; i<arr.length-1; i++) {
			boolean swapFlag = false;
		for(int j=0; j<arr.length-1-i; j++) {
			if(arr[j] > arr[j+1]) {
				int temp = arr[j];
				arr[j] = arr[j+1];
				arr[j+1] = temp;
				swapFlag = true;
			}
			}
			if(!swapFlag)
				break;
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {6, 4, 2, 8, 3, 1};
		System.out.println("Before: "+Arrays.toString(arr));
		bubbleSort(arr);
		System.out.println("After: "+Arrays.toString(arr));
		impBubbleSort(arr);
		System.out.println("After imp: "+Arrays.toString(arr));
		
		moreImpBubbleSort(arr);
		System.out.println("After more imp: "+Arrays.toString(arr));
	}

}
