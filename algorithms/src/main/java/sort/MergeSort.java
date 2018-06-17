package sort;

import utils.Utilities;

public class MergeSort {

	public static void sort(Object[] array) {
		Object[] newArray = new Object[array.length];
		sort(array, newArray, 0, array.length - 1);
	}

	public static void sort(Object[] array, Object[] newArray, int lo, int hi) {

		if (hi <= lo) {
			return;
		}

		int mid = lo + (hi - lo) / 2;
		sort(array, newArray, lo, mid);
		sort(array, newArray, mid + 1, hi);
		mergeIncrement(array, newArray, lo, hi);

	}

	private static void mergeIncrement(Object[] array, Object[] newArray, int lo, int hi) {

		int mid = lo + (hi - lo) / 2;
		System.arraycopy(array, lo, newArray, lo, mid - lo + 1);

		int leftIndex = lo;
		int rightIndex = mid + 1;
		for (int i = lo; i <= hi; i++) {
			if (leftIndex > mid) {
				array[i] = array[rightIndex++];
			} else if (rightIndex > hi) {
				array[i] = newArray[leftIndex++];
			} else if (Utilities.compare(newArray[leftIndex], array[rightIndex]) <= 0) {
				array[i] = newArray[leftIndex++];
			} else {
				array[i] = array[rightIndex++];
			}
		}

	}

	public static void invertedSort(Object[] array) {
		Object[] newArray = new Object[array.length];
		invertedSort(array, newArray, 0, array.length - 1);

	}

	public static void invertedSort(Object[] array, Object[] newArray, int hi, int lo) {
		if (hi <= lo) {
			return;
		}

		int mid = lo + (hi - lo) / 2;
		invertedSort(array, newArray, lo, mid);
		invertedSort(array, newArray, mid + 1, hi);
		mergeDecrement(array, newArray, lo, hi);
		
	}

	private static void mergeDecrement(Object[] array, Object[] newArray, int lo, int hi) {
		
		int mid = lo + (hi - lo) / 2;
		System.arraycopy(array, lo, newArray, lo, mid - lo + 1);

		int leftIndex = lo;
		int rightIndex = mid + 1;
		for (int i = lo; i <= hi; i++) {
			if (leftIndex > mid) {
				array[i] = array[rightIndex++];
			} else if (rightIndex > hi) {
				array[i] = newArray[leftIndex++];
			} else if (Utilities.compare(newArray[leftIndex], array[rightIndex]) >= 0) {
				array[i] = newArray[leftIndex++];
			} else {
				array[i] = array[rightIndex++];
			}
		}
		
	}
	
	public static void main(String[] args) {
		Integer[] array = { 20, 16, 16, 15, 13, 2 };
		invertedSort(array);

		System.out.println(Utilities.arrayAsString(array));
	}

}
