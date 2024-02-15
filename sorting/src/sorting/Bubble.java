package sorting;

import java.util.Arrays;

public class Bubble {

	public static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length - 1; i++)
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
	}

	public static void moreImpBubbleSort(int[] arr) {

		for (int i = 0; i < arr.length - 1; i++) {
			boolean swapFlag = false;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					swapFlag = true;
				}
			}
			if (!swapFlag)
				break;
		}
	}

	public static void insertionSort(int[] arr) {
		for (int i = 1; i < arr.length; i++) {
			int j, temp = arr[i];
			for (j = i - 1; j >= 0 && arr[j] > temp; j--) {
				arr[j + 1] = arr[j];
			}
			arr[j + 1] = temp;
		}
	}

	public static void main(String[] args) {
		int[] arr = { 6, 4, 2, 8, 3, 1 };
		System.out.println("Before " + Arrays.toString(arr));
		// bubbleSort(arr);
//		moreImpBubbleSort(arr);
		insertionSort(arr);
		System.out.println("After " + Arrays.toString(arr));
	}

}
