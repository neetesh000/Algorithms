package sort;

import utils.Utilities;

public class InsertionSort {

	public static <T> void sort(T[] array, int lo, int hi) {

		for (int i = lo; i <= hi; i++) {
			for (int j = i; j > lo; j--) {
				if (Utilities.compare(array, j, j - 1) < 0) {
					Utilities.swap(array, i, j);
				} else {
					break;
				}

			}
		}
	}

	public static <T> void sort(T[] array) {

		int lo = 0, hi = array.length - 1;

		sort(array, lo, hi);

	}

	public static <T> void invertedSort(T[] array) {

		int lo = 0, hi = array.length - 1;

		for (int i = hi; i >= lo; i--) {
			for (int j = i; j < hi; j++) {
				if (Utilities.compare(array, j, j + 1) > 0) {
					Utilities.swap(array, i, j);
				} else {
					break;
				}

			}
		}

	}

}
